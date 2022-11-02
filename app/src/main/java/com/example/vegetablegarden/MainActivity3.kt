package com.example.vegetablegarden

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val btn = findViewById<Button>(R.id.skip)
        btn.setOnClickListener {
            //インデントを作成
            val i = Intent(this, MainActivity4::class.java)
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