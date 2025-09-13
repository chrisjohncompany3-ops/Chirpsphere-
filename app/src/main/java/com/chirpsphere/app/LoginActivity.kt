package com.chirpsphere.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

        private lateinit var auth: FirebaseAuth

            override fun onCreate(savedInstanceState: Bundle?) {
                        super.onCreate(savedInstanceState)
                                setContentView(R.layout.activity_login)

                                        auth = FirebaseAuth.getInstance()

                                                val emailField = findViewById<EditText>(R.id.etEmail)
                                                        val passwordField = findViewById<EditText>(R.id.etPassword)
                                                                val btnLogin = findViewById<Button>(R.id.btnLogin)

                                                                        btnLogin.setOnClickListener {
                                                                                        val email = emailField.text.toString()
                                                                                                    val password = passwordField.text.toString()

                                                                                                                auth.signInWithEmailAndPassword(email, password).addOnCompleteListener { task ->
                                                                                                                                if (task.isSuccessful) {
                                                                                                                                                        startActivity(Intent(this, MainActivity::class.java))
                                                                                                                                                                            finish()
                                                                                                                                } else {
                                                                                                                                                        Toast.makeText(this, "Login failed!", Toast.LENGTH_SHORT).show()
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