package com.example.practicemvp.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by kth919 on 2017-02-08.
 */

public class DBHelper extends SQLiteOpenHelper {

    private String TAG = DBHelper.class.getName();

    public DBHelper(Context context) {
        super(context, "memberInfo.db", null, 1);
        Log.d(TAG, "helper 생성");
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(
                "CREATE TABLE tastTable" +
                "(email STRING NOT NULL," +
                "password STRING NOT NULL," +
                        "primary key(email))"
        );

        Log.d(TAG , "db생성" );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
