package com.bini.mame.abaoappsforteachingkids;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Mame on 5/21/2016.
 */
public class EngOneDatabaseThree extends SQLiteOpenHelper
{
    public static final String EDBS2 = "ENGLISH2";
    public static final String TABLE2 = "TABLE2";
    public static final String NUMBS2 = "LAKK2";
    public static final String USER2 = "MAQAA2";
    public static final String POINT2 = "QABXII2";
    public static final String DATE2 = "DATE2";
    //database creation

    public static final int database_version = 1;

    //creating query for creating tables

    public String ETABLE2 = "CREATE TABLE "+TABLE2+ "(" +NUMBS2+" INTEGER PRIMARY KEY AUTOINCREMENT," +USER2+" TEXT,"+POINT2+" TEXT,"+DATE2+" TEXT);";
    public EngOneDatabaseThree(Context context)
    {
        //here we are creating our database
        super(context, EDBS2, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(ETABLE2);
        //sdb.execSQL(NEKEMTE);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    //creating a method to insert kids information into database

    public void saveEng(EngOneDatabaseThree dbo, String names, String  points, String day)
    {
        //creating an object to insert data into SQlite.

        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(USER2, names);
        bini.put(POINT2, points);
        bini.put(DATE2, day);
        long bn = sql.insert(TABLE2, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    //here create user defined method to retrieve information back from the database
    // remember the return type is cursor

    public Cursor ShowEngResultThree(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {NUMBS2, POINT2, DATE2};
        String selection = USER2+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(TABLE2, projection, selection, selection_args, null, null, null);
        return cursor;
    }
}
