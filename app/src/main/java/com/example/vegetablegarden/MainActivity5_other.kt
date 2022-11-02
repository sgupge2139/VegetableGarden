package com.example.vegetablegarden

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5_other : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity5_other)

        val btn = findViewById<Button>(R.id.next)
        btn.setOnClickListener {
            //インデントを作成
            val i = Intent(this, MainActivity6::class.java)
            //アクティビティを起動
            startActivity(i)
        }

        val back_btn = findViewById<Button>(R.id.back)
        back_btn.setOnClickListener {
            //アクティビティを終了
            finish()
        }
    }
}