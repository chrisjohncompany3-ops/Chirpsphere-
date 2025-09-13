package com.chirpsphere.app.models

data class Post(
        val userId: String = "",
            val content: String = "",
                val timestamp: Long = System.currentTimeMillis()
)

)