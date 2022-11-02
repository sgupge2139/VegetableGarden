package com.example.vegetablegarden

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val btn1 = findViewById<Button>(R.id.mini_tomato_1)
        btn1.setOnClickListener {
            //インデントを作成
            val i = Intent(this, MainActivity5_1::class.java)
            //アクティビティを起動
            startActivity(i)
        }

        val btn2 = findViewById<Button>(R.id.mini_tomato_2)
        btn2.setOnClickListener {
            //インデントを作成
            val i = Intent(this, MainActivity5_2::class.java)
            //アクティビティを起動
            startActivity(i)
        }
        val btn3 = findViewById<Button>(R.id.mini_tomato_3)
        btn3.setOnClickListener {
            //インデントを作成
            val i = Intent(this, MainActivity5_3::class.java)
            //アクティビティを起動
            startActivity(i)
        }
        val btn4 = findViewById<Button>(R.id.mini_tomato_4)
        btn4.setOnClickListener {
            //インデントを作成
            val i = Intent(this, MainActivity5_4::class.java)
            //アクティビティを起動
            startActivity(i)
        }
        val btn5 = findViewById<Button>(R.id.mini_tomato_5)
        btn5.setOnClickListener {
            //インデントを作成
            val i = Intent(this, MainActivity5_5::class.java)
            //アクティビティを起動
            startActivity(i)
        }
        val btn_other = findViewById<Button>(R.id.mini_tomato_other)
        btn_other.setOnClickListener {
            //インデントを作成
            val i = Intent(this, MainActivity5_other::class.java)
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