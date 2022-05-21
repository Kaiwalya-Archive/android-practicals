package com.example.pract_26;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {
    DatabaseHandler(Context c) {
        super(c, "student_database", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE st_info (name text, message text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    //User defined function which gets invoked from Async.java for creating data
    public long onInsert(String s_name, String s_message) {

        SQLiteDatabase sqld = this.getWritableDatabase();
        ContentValues val = new ContentValues();
        val.put("name", s_name);
        val.put("message", s_message);

        long result=sqld.insert("st_info", null, val);

        return result;
    }
}
