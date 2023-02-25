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
public class HerrOneDatabaseTwo extends SQLiteOpenHelper
{
    public static final String MDBS1 = "MATHS1";
    public static final String MTABLE1 = "MTABLE1";
    public static final String MNUMBS1 = "MLAKK1";
    public static final String MUSER1 = "MMAQAA1";
    public static final String MPOINT1 = "MQABXII1";
    public static final String DATE10 = "DATE10";
    //database creation

    public static final int database_version = 1;

    //creating query for creating tables

    public String MATHICS1 = "CREATE TABLE "+MTABLE1+ "(" +MNUMBS1+" INTEGER PRIMARY KEY AUTOINCREMENT," +MUSER1+" TEXT,"+MPOINT1+" TEXT,"+DATE10+" TEXT);";
    public HerrOneDatabaseTwo(Context context)
    {
        //here we are creating our database
        super(context, MDBS1, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(MATHICS1);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    //creating a method to insert kids information into database

    public void saveMaths1(HerrOneDatabaseTwo dbo, String names, String  points, String day)
    {
        //creating an object to insert data into SQlite.

        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(MUSER1, names);
        bini.put(MPOINT1, points);
        bini.put(DATE10, day);
        long bn = sql.insert(MTABLE1, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    //here create user defined method to retrieve information back from the database
    // remember the return type is cursor

    public Cursor ShowHerrResultTwo(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {MNUMBS1, MPOINT1, DATE10};
        String selection = MUSER1+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(MTABLE1, projection, selection, selection_args, null, null, null);
        return cursor;
    }
}
