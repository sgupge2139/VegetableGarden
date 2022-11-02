package com.example.vegetablegarden

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val btn = findViewById<Button>(R.id.title_back)
        btn.setOnClickListener {
            //インデントを作成
            val i = Intent(this, MainActivity::class.java)
            //アクティビティを起動
            startActivity(i)
        }
    }
}