package com.example.flipclassroom;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by WPH on 2019/3/6.
 * 创建数据库 建表
 */

public class DBHelper extends SQLiteOpenHelper {

    public static final String studentInfo_table = "create table usertable" +
            "(id integer primary key autoincrement, username text," +
            "password text)";

    public static final String teacherInfo_table = "create table usertable" +
            "(id integer primary key autoincrement, username text," +
            "password text)";

    private Context mContent;
    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        mContent = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(teacherInfo_table);
        db.execSQL(studentInfo_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists teacherInfo_table");
        db.execSQL("drop table if exists studentInfo_table");
        onCreate(db);
    }
}
