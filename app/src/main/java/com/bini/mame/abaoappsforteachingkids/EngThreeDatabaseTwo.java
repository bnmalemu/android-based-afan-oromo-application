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
public class EngThreeDatabaseTwo extends SQLiteOpenHelper
{
    public static final String ENG21 = "EDAB21";
    public static final String EGAB21 = "ETAB21";
    public static final String ELAK21 ="ENMB21";
    public static final String ENAM21 = "ENAM21";
    public static final String EPOT21 = "EPTS21";
    public static final String DATE7 = "DATE7";
    public static final int database_version = 1;

    //creating query for creating tables

    public String BONSA1 = "CREATE TABLE "+EGAB21+ "(" +ELAK21+" INTEGER PRIMARY KEY AUTOINCREMENT," +ENAM21+" TEXT,"+EPOT21+" TEXT,"+DATE7+" TEXT);";
    public EngThreeDatabaseTwo(Context context)
    {
        //here we are creating our database
        super(context, ENG21, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(BONSA1);
        //sdb.execSQL(NEKEMTE);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    //creating a method to insert kids information into database

    public void saveEng32(EngThreeDatabaseTwo dbo, String names, String  points, String days)
    {
        //creating an object to insert data into SQlite.

        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(ENAM21, names);
        bini.put(EPOT21, points);
        bini.put(DATE7, days);
        long bn = sql.insert(EGAB21, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    //here create user defined method to retrieve information back from the database
    // remember the return type is cursor

    public Cursor ShowEngTwoResultTwo(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {ELAK21, EPOT21, DATE7};
        String selection = ENAM21+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(EGAB21, projection, selection, selection_args, null, null, null);
        return cursor;
    }
}
