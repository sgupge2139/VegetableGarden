package com.example.vegetablegarden

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//追加
import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SQLiteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sqlite)

        //ヘルパーを準備
        val helper = SimpleDatabaseHelper(this)
        //データベースを取得
        helper.writableDatabase.use { db ->
            //db.insertWithOnConflict("plant", null, cv, SQLiteDatabase.CONFLICT_REPLACE)
            Toast.makeText(this, "接続しました",
                Toast.LENGTH_SHORT).show()
            //以下にデータベース処理を記述
        }
    }
}