package com.chirpsphere.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

        private lateinit var recyclerView: RecyclerView
            private lateinit var adapter: PostAdapter
                private val posts = mutableListOf<Post>()

                    override fun onCreate(savedInstanceState: Bundle?) {
                                super.onCreate(savedInstanceState)
                                        setContentView(R.layout.activity_main)

                                                recyclerView = findViewById(R.id.recyclerView)
                                                        recyclerView.layoutManager = LinearLayoutManager(this)
                                                                adapter = PostAdapter(posts)
                                                                        recyclerView.adapter = adapter

                                                                                // Load posts from Firestore
                                                                                        val db = FirebaseFirestore.getInstance()
                                                                                                db.collection("posts").addSnapshotListener { snapshot, _ ->
                                                                                                            if (snapshot != null) {
                                                                                                                                posts.clear()
                                                                                                                                                for (doc in snapshot) {
                                                                                                                                                                        val post = doc.toObject(Post::class.java)
                                                                                                                                                                                            posts.add(post)
                                                                                                                                                }
                                                                                                                                                                adapter.notifyDataSetChanged()
                                                                                                            }
                                                                                                }

                                                                                                        // Floating action button for new post
                                                                                                                val fab: FloatingActionButton = findViewById(R.id.fabNewPost)
                                                                                                                        fab.setOnClickListener {
                                                                                                                                        startActivity(Intent(this, CommentsActivity::class.java))
                                                                                                                        }
                    }
}

                                                                                                                        }
                                                                                                                                                }
                                                                                                            }}
                    }
}