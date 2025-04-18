package com.example.bookstudyapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class TransparentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LIFECYCLE", "TransparentActivity onCreate")
        setContentView(R.layout.activity_transparent)
    }
}
