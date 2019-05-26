package com.example.washingmachine

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class NoticeAnswer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.notice_answer)


        val Cancell = findViewById<View>(R.id.cancellation2) as Button
        Cancell.setOnClickListener {
            val intent = Intent(
                applicationContext,
                MakeNotice::class.java
            )
            startActivity(intent)
        }
    }
}
