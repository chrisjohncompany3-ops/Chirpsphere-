package com.chirpsphere.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class RegisterActivity : AppCompatActivity() {

        private lateinit var auth: FirebaseAuth
            private lateinit var db: FirebaseFirestore

                override fun onCreate(savedInstanceState: Bundle?) {
                            super.onCreate(savedInstanceState)
                                    setContentView(R.layout.activity_register)

                                            auth = FirebaseAuth.getInstance()
                                                    db = FirebaseFirestore.getInstance()

                                                            val emailField = findViewById<EditText>(R.id.etEmail)
                                                                    val passwordField = findViewById<EditText>(R.id.etPassword)
                                                                            val usernameField = findViewById<EditText>(R.id.etUsername)
                                                                                    val btnRegister = findViewById<Button>(R.id.btnRegister)

                                                                                            btnRegister.setOnClickListener {
                                                                                                            val email = emailField.text.toString()
                                                                                                                        val password = passwordField.text.toString()
                                                                                                                                    val username = usernameField.text.toString()

                                                                                                                                                auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener { task ->
                                                                                                                                                                if (task.isSuccessful) {
                                                                                                                                                                                        val userId = auth.currentUser?.uid ?: ""
                                                                                                                                                                                                            val user = User(userId, username, email)

                                                                                                                                                                                                                                db.collection("users").document(userId).set(user).addOnSuccessListener {
                                                                                                                                                                                                                                                            startActivity(Intent(this, MainActivity::class.java))
                                                                                                                                                                                                                                                                                    finish()
                                                                                                                                                                                                                                }
                                                                                                                                                                } else {
                                                                                                                                                                                        Toast.makeText(this, "Registration failed!", Toast.LENGTH_SHORT).show()
                                                                                                                                                                }
                                                                                                                                                }
                                                                                            }
                }
}

                                                                                                                                                                }
                                                                                                                                                                                                                                }
                                                                                                                                                                }}
                                                                                            }
                }
}