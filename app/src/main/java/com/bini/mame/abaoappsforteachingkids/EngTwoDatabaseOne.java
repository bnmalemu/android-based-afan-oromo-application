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
public class EngTwoDatabaseOne extends SQLiteOpenHelper
{
    public static final String ENG1 = "EDAB1";
    public static final String EGAB1 = "ETAB1";
    public static final String ELAK1 ="EEMU1";
    public static final String ENAM1 = "ENUM1";
    public static final String EPOT1 = "EPTS1";
    public static final String DATE3 = "DATE3";
    public static final int database_version = 1;

    //creating query for creating tables

    public String HABTE1 = "CREATE TABLE "+EGAB1+ "(" +ELAK1+" INTEGER PRIMARY KEY AUTOINCREMENT," +ENAM1+" TEXT,"+EPOT1+" TEXT,"+DATE3+" TEXT);";
    public EngTwoDatabaseOne(Context context)
    {
        //here we are creating our database
        super(context, ENG1, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(HABTE1);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    //creating a method to insert kids information into database

    public void saveEng21(EngTwoDatabaseOne dbo, String names, String  points, String days)
    {
        //creating an object to insert data into SQlite.

        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(ENAM1, names);
        bini.put(EPOT1, points);
        bini.put(DATE3, days);
        long bn = sql.insert(EGAB1, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    //here create user defined method to retrieve information back from the database
    // remember the return type is cursor
    public Cursor ShowEngTwoResultOne(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {ELAK1, EPOT1, DATE3};
        String selection = ENAM1+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(EGAB1, projection, selection, selection_args, null, null, null);
        return cursor;
    }

}
