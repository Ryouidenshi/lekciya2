package com.example.lab02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var studentString = Student("Иван", false).toString();
        startActivity(Intent(this, SecondActivity::class.java).apply {
            putExtra(SecondActivity.DATA_KEY_STUDENT, studentString)
        });
    }
}

class Student(val name: String, val expelled: Boolean) {
    override fun toString(): String {
        return "Студент $name, отчислен: ${if (expelled) "да" else "нет"}"
    }
}
