package com.chirpsphere.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(private val posts: List<Post>) :
    RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

            class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
                        val tvContent: TextView = itemView.findViewById(R.id.tvContent)
            }

                override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
                            val view = LayoutInflater.from(parent.context)
                                        .inflate(R.layout.item_post, parent, false)
                                                return PostViewHolder(view)
                }

                    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
                                holder.tvContent.text = posts[position].content
                    }

                        override fun getItemCount(): Int = posts.size
    }
    
                    }
                }
            }
    }