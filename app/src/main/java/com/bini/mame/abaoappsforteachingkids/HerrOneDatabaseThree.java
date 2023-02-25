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
public class HerrOneDatabaseThree extends SQLiteOpenHelper
{
    public static final String MDBS2 = "MATHS2";
    public static final String MTABLE2 = "MTABLE2";
    public static final String MNUMBS2 = "MLAKK2";
    public static final String MUSER2 = "MMAQAA2";
    public static final String MPOINT2 = "MQABXII2";
    public static final String DATE11 = "DATE11";
    //database creation

    public static final int database_version = 1;

    //creating query for creating tables

    public String MATHICS2 = "CREATE TABLE "+MTABLE2+ "(" +MNUMBS2+" INTEGER PRIMARY KEY AUTOINCREMENT," +MUSER2+" TEXT,"+MPOINT2+" TEXT,"+DATE11+" TEXT);";
    public HerrOneDatabaseThree(Context context)
    {
        //here we are creating our database
        super(context, MDBS2, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(MATHICS2);
        //sdb.execSQL(NEKEMTE);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    //creating a method to insert kids information into database

    public void saveMaths2(HerrOneDatabaseThree dbo, String names, String  points, String date)
    {
        //creating an object to insert data into SQlite.

        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(MUSER2, names);
        bini.put(MPOINT2, points);
        bini.put(DATE11, date);
        long bn = sql.insert(MTABLE2, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    //here create user defined method to retrieve information back from the database
    // remember the return type is cursor

    public Cursor ShowHerrResultThree(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {MNUMBS2, MPOINT2, DATE11};
        String selection = MUSER2+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(MTABLE2, projection, selection, selection_args, null, null, null);
        return cursor;
    }
}
