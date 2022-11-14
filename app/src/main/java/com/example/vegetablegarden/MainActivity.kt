package com.example.vegetablegarden

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.start)
        btn.setOnClickListener {
            //インデントを作成
            //val i = Intent(this, MainActivity2::class.java)
            val i = Intent(this, SQLiteActivity::class.java)
            //アクティビティを起動
            startActivity(i)
        }

    }
}