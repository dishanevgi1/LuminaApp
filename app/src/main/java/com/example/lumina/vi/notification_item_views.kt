package com.example.lumina.vi

import android.app.Activity

class NotificationItemViewsVi(
    private val title: String,
    private val body: String,
    private val timestamp: String
) : Activity() {

    fun getTitle(): String {
        return title
    }

    fun getBody(): String {
        return body
    }

    fun getTimestamp(): String {
        return timestamp
    }
}
