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
public class HerrTwoDatabaseTwo extends SQLiteOpenHelper
{
    public static final String MATH2 = "MDAT2";
    public static final String MTAB2 = "MROW2";
    public static final String MNUM2 = "MLAKK2";
    public static final String MMAQ2 = "MMAQA2";
    public static final String MPNT2 = "MQABX2";
    public static final String DATE13 = "DATE13";
    //database creation

    public static final int database_version = 1;

    //creating query for creating tables

    public String WELCOME2 = "CREATE TABLE "+MTAB2+ "(" +MNUM2+" INTEGER PRIMARY KEY AUTOINCREMENT," +MMAQ2+" TEXT,"+MPNT2+" TEXT,"+DATE13+" TEXT);";
    public HerrTwoDatabaseTwo(Context context)
    {
        //here we are creating our database
        super(context, MATH2, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(WELCOME2);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    //creating a method to insert kids information into database

    public void saveMaths22(HerrTwoDatabaseTwo dbo, String names, String  points, String date)
    {
        //creating an object to insert data into SQlite.

        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(MMAQ2, names);
        bini.put(MPNT2, points);
        bini.put(DATE13, date);
        long bn = sql.insert(MTAB2, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    //here create user defined method to retrieve information back from the database
    // remember the return type is cursor

    public Cursor ShowHerrTwoResultTwo(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {MNUM2, MPNT2, DATE13};
        String selection = MMAQ2+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(MTAB2, projection, selection, selection_args, null, null, null);
        return cursor;
    }
}
