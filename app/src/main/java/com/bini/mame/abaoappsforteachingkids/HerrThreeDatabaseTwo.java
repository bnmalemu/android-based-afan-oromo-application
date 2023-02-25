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
public class HerrThreeDatabaseTwo extends SQLiteOpenHelper
{
    public static final String MATH21 = "MDAT21";
    public static final String MTAB21 = "MROW21";
    public static final String MNUM21 = "MLAKK21";
    public static final String MMAQ21 = "MMAQA21";
    public static final String MPNT21 = "MQABX21";
    public static final String DATE16 = "DATE16";
    //database creation

    public static final int database_version = 1;

    //creating query for creating tables

    public String GATAMA1 = "CREATE TABLE "+MTAB21+ "(" +MNUM21+" INTEGER PRIMARY KEY AUTOINCREMENT," +MMAQ21+" TEXT,"+MPNT21+" TEXT,"+DATE16+" TEXT);";
    public HerrThreeDatabaseTwo(Context context)
    {
        //here we are creating our database
        super(context, MATH21, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(GATAMA1);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    //creating a method to insert kids information into database

    public void saveMaths32(HerrThreeDatabaseTwo dbo, String names, String  points, String date)
    {
        //creating an object to insert data into SQlite.

        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(MMAQ21, names);
        bini.put(MPNT21, points);
        bini.put(DATE16, date);
        long bn = sql.insert(MTAB21, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    //here create user defined method to retrieve information back from the database
    // remember the return type is cursor

    public Cursor ShowHerrThreeResultTwo(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {MNUM21, MPNT21, DATE16};
        String selection = MMAQ21+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(MTAB21, projection, selection, selection_args, null, null, null);
        return cursor;
    }
}
