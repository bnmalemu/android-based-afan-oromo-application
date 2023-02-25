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
public class HerrOneDatabaseOne extends SQLiteOpenHelper
{
    public static final String MDBS = "MATHS";
    public static final String MTABLE = "MTABLE";
    public static final String MNUMBS = "MLAKK";
    public static final String MUSER = "MMAQAA";
    public static final String MPOINT = "MQABXII";
    public static final String DATE9 = "DATE9";
    //database creation

    public static final int database_version = 1;

    //creating query for creating tables

    public String MATHICS = "CREATE TABLE "+MTABLE+ "(" +MNUMBS+" INTEGER PRIMARY KEY AUTOINCREMENT," +MUSER+" TEXT,"+MPOINT+" TEXT,"+DATE9+" TEXT);";
    public HerrOneDatabaseOne(Context context)
    {
        //here we are creating our database
        super(context, MDBS, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(MATHICS);
        //sdb.execSQL(NEKEMTE);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    //creating a method to insert kids information into database

    public void saveMaths(HerrOneDatabaseOne dbo, String names, String  points, String day)
    {
        //creating an object to insert data into SQlite.

        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(MUSER, names);
        bini.put(MPOINT, points);
        bini.put(DATE9, day);
        long bn = sql.insert(MTABLE, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    //here create user defined method to retrieve information back from the database
    // remember the return type is cursor
    public Cursor ShowHerrResultOne(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {MNUMBS, MPOINT, DATE9};
        String selection = MUSER+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(MTABLE, projection, selection, selection_args, null, null, null);
        return cursor;
    }
}
