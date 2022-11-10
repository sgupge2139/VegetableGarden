package com.example.vegetablegarden

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SQLiteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sqlite)
    }
}*/
//package to.msn.wings.databasebasic

class SQLiteActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sqlite)

        //ヘルパーを準備
        val helper = SimpleDatabaseHelper(this)
        //データベースを取得
        helper.writableDatabase.use { db ->
            Toast.makeText(this, "接続しました",
                Toast.LENGTH_SHORT).show()
                //本来であれば，ここにデータベース処理を記述
        }
    }
}

