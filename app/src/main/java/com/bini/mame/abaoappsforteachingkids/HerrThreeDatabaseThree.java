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
public class HerrThreeDatabaseThree extends SQLiteOpenHelper
{
    public static final String MATH31 = "MDAT31";
    public static final String MTAB31 = "MROW31";
    public static final String MNUM31 = "MLAKK31";
    public static final String MMAQ31 = "MMAQA31";
    public static final String MPNT31 = "MQABX31";
    public static final String DATE17 = "DATE17";
    public static final int database_version = 1;

    //creating query for creating tables

    public String GATAMA3 = "CREATE TABLE "+MTAB31+ "(" +MNUM31+" INTEGER PRIMARY KEY AUTOINCREMENT," +MMAQ31+" TEXT,"+MPNT31+" TEXT,"+DATE17+" TEXT);";
    public HerrThreeDatabaseThree(Context context)
    {
        //here we are creating our database
        super(context, MATH31, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(GATAMA3);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    //creating a method to insert kids information into database

    public void saveMaths33(HerrThreeDatabaseThree dbo, String names, String  points, String day)
    {
        //creating an object to insert data into SQlite.

        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(MMAQ31, names);
        bini.put(MPNT31, points);
        bini.put(DATE17, day);
        long bn = sql.insert(MTAB31, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    //here create user defined method to retrieve information back from the database
    // remember the return type is cursor

    public Cursor ShowHerrThreeResultThree(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {MNUM31, MPNT31, DATE17};
        String selection = MMAQ31+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(MTAB31, projection, selection, selection_args, null, null, null);
        return cursor;
    }
}
