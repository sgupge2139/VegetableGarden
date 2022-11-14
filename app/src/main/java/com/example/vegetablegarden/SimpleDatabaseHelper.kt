package com.example.vegetablegarden

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
//import android.os.Build.VERSION

class SimpleDatabaseHelper(context: Context?):
    SQLiteOpenHelper(context, DBNAME, null,  VERSION){
    companion object{
        private const val DBNAME = "plant.sqlite"
        private const val VERSION = 1
    }
    override fun onCreate(db: SQLiteDatabase?){
        db?.let{
            it.execSQL("CREATE TABLE plant ( " + "name TEXT PRIMARY KEY, branch1 TEXT, branch2 TEXT, branch3 TEXT, branch4 TEXT, branch5 TEXT)")
            it.execSQL("INSERT INTO plant (name, branch1, branch2, branch3, branch4, branch5)" + " VALUES('大葉（シソ）', 'あ', 'い', 'う', 'え', 'お')")
            it.execSQL("INSERT INTO plant (name, branch1, branch2, branch3, branch4, branch5)" + " VALUES('ミニトマト', 'あ', 'い', 'う', 'え', 'お')")
            it.execSQL("INSERT INTO plant (name, branch1, branch2, branch3, branch4, branch5)" + " VALUES('バジル', 'あ', 'い', 'う', 'え', 'お')")
        }
    }
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int){
        db?.let{
            it.execSQL("DROP TABLE IF EXISTS plant")
            onCreate(it)
        }
    }
    override fun onOpen(db: SQLiteDatabase?){
        super.onOpen(db)
    }
}