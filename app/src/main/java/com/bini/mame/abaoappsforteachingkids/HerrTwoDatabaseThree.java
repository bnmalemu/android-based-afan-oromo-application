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
public class HerrTwoDatabaseThree extends SQLiteOpenHelper
{
    public static final String MATH3 = "MDAT3";
    public static final String MTAB3 = "MROW3";
    public static final String MNUM3 = "MLAKK3";
    public static final String MMAQ3 = "MMAQA3";
    public static final String MPNT3 = "MQABX3";
    public static final String DATE14 = "DATE14";
    //database creation

    public static final int database_version = 1;

    //creating query for creating tables

    public String WELCOME3 = "CREATE TABLE "+MTAB3+ "(" +MNUM3+" INTEGER PRIMARY KEY AUTOINCREMENT," +MMAQ3+" TEXT,"+MPNT3+" TEXT,"+DATE14+" TEXT);";
    public HerrTwoDatabaseThree(Context context)
    {
        //here we are creating our database
        super(context, MATH3, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(WELCOME3);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    //creating a method to insert kids information into database

    public void saveMaths23(HerrTwoDatabaseThree dbo, String names, String  points, String date)
    {
        //creating an object to insert data into SQlite.

        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(MMAQ3, names);
        bini.put(MPNT3, points);
        bini.put(DATE14, date);
        long bn = sql.insert(MTAB3, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    //here create user defined method to retrieve information back from the database
    // remember the return type is cursor

    public Cursor ShowHerrTwoResultThree(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {MNUM3, MPNT3, DATE14};
        String selection = MMAQ3+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(MTAB3, projection, selection, selection_args, null, null, null);
        return cursor;
    }
}
