package com.example.lab02

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val view = findViewById<TextView>(R.id.textView)

        val data = intent?.getStringExtra(DATA_KEY_STUDENT)
        view.text = data ?: ""
    }

    companion object{
        public const val DATA_KEY_STUDENT = "EXTRA_DIP";
    }
}

