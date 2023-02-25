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
public class HerrTwoDatabaseOne extends SQLiteOpenHelper
{
    public static final String MATH1 = "MDAT1";
    public static final String MTAB1 = "MROW1";
    public static final String MNUM1 = "MLAKK1";
    public static final String MMAQ1 = "MMAQA1";
    public static final String MPNT1 = "MQABX1";
    public static final String DATE12= "DATE12";
    //database creation

    public static final int database_version = 1;

    //creating query for creating tables

    public String WELCOME1 = "CREATE TABLE "+MTAB1+ "(" +MNUM1+" INTEGER PRIMARY KEY AUTOINCREMENT," +MMAQ1+" TEXT,"+MPNT1+" TEXT,"+DATE12+" TEXT);";
    public HerrTwoDatabaseOne(Context context)
    {
        //here we are creating our database
        super(context, MATH1, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(WELCOME1);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    //creating a method to insert kids information into database

    public void saveMaths21(HerrTwoDatabaseOne dbo, String names, String  points, String date)
    {
        //creating an object to insert data into SQlite.

        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(MMAQ1, names);
        bini.put(MPNT1, points);
        bini.put(DATE12, date);
        long bn = sql.insert(MTAB1, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    //here create user defined method to retrieve information back from the database
    // remember the return type is cursor

    public Cursor ShowHerrTwoResultOne(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {MNUM1, MPNT1, DATE12};
        String selection = MMAQ1+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(MTAB1, projection, selection, selection_args, null, null, null);
        return cursor;
    }
}
