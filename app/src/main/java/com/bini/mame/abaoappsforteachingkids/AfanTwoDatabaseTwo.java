package com.bini.mame.abaoappsforteachingkids;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.YuvImage;
import android.util.Log;

/**
 * Created by Mame on 5/15/2016.
 */
public class AfanTwoDatabaseTwo extends SQLiteOpenHelper
{
    public static final String AFAN1 = "ADATA1";
    public static final String ATAB1 = "AROWS1";
    public static final String ANUMB1 = "ALAK1";
    public static final String AMAQA1 = "AMAQAA1";
    public static final String AQABX1 = "AQABXI1";
    public static final String DATE20 = "DATE20";

    public static final int database_version = 1;

    //creating query for creating tables

    public String AFAANKOO1 = "CREATE TABLE "+ATAB1+ "(" +ANUMB1+" INTEGER PRIMARY KEY AUTOINCREMENT," +AMAQA1+" TEXT,"+AQABX1+" TEXT,"+DATE20+" TEXT);";
    public AfanTwoDatabaseTwo(Context context)
    {
        //here we are creating our database
        super(context, AFAN1, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {

        sdb.execSQL(AFAANKOO1);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    //creating a method to insert kids information into database

    public void saveAfan22(AfanTwoDatabaseTwo dbo, String names, String  points, String yes)
    {
        //creating an object to insert data into SQlite.

        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(AMAQA1, names);
        bini.put(AQABX1, points);
        bini.put(DATE20, yes);
        long bn = sql.insert(ATAB1, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    //here create user defined method to retrieve information back from the database
    // remember the return type is cursor

    public Cursor ShowAfanTwoResultTwo(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {ANUMB1, AQABX1, DATE20};
        String selection = AMAQA1+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(ATAB1, projection, selection, selection_args, null, null, null);
        return cursor;
    }
}
