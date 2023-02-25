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
public class EngThreeDatabaseThree extends SQLiteOpenHelper
{
    public static final String ENG31 = "EDAB31";
    public static final String EGAB31 = "ETAB31";
    public static final String ELAK31 ="ENUM131";
    public static final String ENAM31 = "ENAM31";
    public static final String EPOT31 = "EPTS31";
    public static final String DATE8 = "DATE8";
    public static final int database_version = 1;

    //creating query for creating tables

    public String BONSA2 = "CREATE TABLE "+EGAB31+ "(" +ELAK31+" INTEGER PRIMARY KEY AUTOINCREMENT," +ENAM31+" TEXT,"+EPOT31+" TEXT,"+DATE8+" TEXT);";
    public EngThreeDatabaseThree(Context context)
    {
        //here we are creating our database
        super(context, ENG31, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(BONSA2);
        //sdb.execSQL(NEKEMTE);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    //creating a method to insert kids information into database

    public void saveEng33(EngThreeDatabaseThree dbo, String names, String  points, String date)
    {
        //creating an object to insert data into SQlite.

        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(ENAM31, names);
        bini.put(EPOT31, points);
        bini.put(DATE8, date);
        long bn = sql.insert(EGAB31, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    //here create user defined method to retrieve information back from the database
    // remember the return type is cursor

    public Cursor ShowEngThreeResultThree(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {ELAK31, EPOT31, DATE8};
        String selection = ENAM31+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(EGAB31, projection, selection, selection_args, null, null, null);
        return cursor;
    }
}
