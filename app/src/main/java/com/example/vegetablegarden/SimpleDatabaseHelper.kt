package com.example.vegetablegarden
/*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SimpleDatabaseHelper : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_database_helper)
    }
}*/
//package to.msn.wings.databasebasic

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
//import android.os.Build.VERSION

class SimpleDatabaseHelper(context: Context?):
        SQLiteOpenHelper(context, DBNAME, null,  VERSION){
            companion object{
                private const val DBNAME = "sample.sqlite"
                private const val VERSION = 1
            }
            override fun onCreate(db: SQLiteDatabase?){
                db?.let{
                    it.execSQL("CREATE TABLE books ( " + "isbn TEXT PRIMARY KEY, title TEXT, price)")
                    it.execSQL("INSERT INTO books (isbn, title, price)" + " VALUES('978-4-7980-4512-2', 'はじめてのASP.NET', 3000)")
                    it.execSQL("INSERT INTO books (isbn, title, price)" + " VALUES('978-4-7980-4179-7', 'ASP.NET Core実践プログラミング', 3500)")
                    it.execSQL("INSERT INTO books (isbn, title, price)" + " VALUES('978-4-7741-8030-4', 'Javaポケットリファレンス', 2680)")
                    it.execSQL("INSERT INTO books (isbn, title, price)" + " VALUES('978-4-7741-9617-6', 'Swiftポケットリファレンス', 2880)")
                    it.execSQL("INSERT INTO books (isbn, title, price)" + " VALUES('978-4-7981-3547-2', '独習PHP', 3200)")
                }
            }
            override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int){
                db?.let{
                    it.execSQL("DROP TABLE IF EXISTS books")
                    onCreate(it)
                }
            }
            override fun onOpen(db: SQLiteDatabase?){
                super.onOpen(db)
            }
        }