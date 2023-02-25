package com.bini.mame.abaoappsforteachingkids;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Mame on 5/22/2016.
 */
public class HerrThreeDatabaseOne extends SQLiteOpenHelper
{
    public static final String MATH11 = "MDAT11";
    public static final String MTAB11 = "MROW11";
    public static final String MNUM11 = "MLAKK11";
    public static final String MMAQ11 = "MMAQA11";
    public static final String MPNT11 = "MQABX11";
    public static final String DATE15 = "DATE15";
    //database creation

    public static final int database_version = 1;

    //creating query for creating tables

    public String GATAMA = "CREATE TABLE "+MTAB11+ "(" +MNUM11+" INTEGER PRIMARY KEY AUTOINCREMENT," +MMAQ11+" TEXT,"+MPNT11+" TEXT,"+DATE15+" TEXT);";
    public HerrThreeDatabaseOne(Context context)
    {
        //here we are creating our database
        super(context, MATH11, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(GATAMA);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    //creating a method to insert kids information into database

    public void saveMaths31(HerrThreeDatabaseOne dbo, String names, String  points, String date)
    {
        //creating an object to insert data into SQlite.

        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(MMAQ11, names);
        bini.put(MPNT11, points);
        bini.put(DATE15, date);
        long bn = sql.insert(MTAB11, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    //here create user defined method to retrieve information back from the database
    // remember the return type is cursor

    public Cursor ShowHerrThreeResultOne(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {MNUM11, MPNT11, DATE15};
        String selection = MMAQ11+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(MTAB11, projection, selection, selection_args, null, null, null);
        return cursor;
    }
}
