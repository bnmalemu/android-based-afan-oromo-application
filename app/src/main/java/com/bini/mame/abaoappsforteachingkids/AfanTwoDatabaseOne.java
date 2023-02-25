package com.bini.mame.abaoappsforteachingkids;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Mame on 5/15/2016.
 */
public class AfanTwoDatabaseOne extends SQLiteOpenHelper
{
    public static final String AFAN = "ADATA";
    public static final String ATAB = "AROWS";
    public static final String ANUMB = "ALAK";
    public static final String AMAQA = "AMAQAA";
    public static final String AQABX = "AQABXI";
    public static final String DATE19 = "DATE19";
    public static final int database_version = 1;

    //creating query for creating tables

    public String AFAANKOO = "CREATE TABLE "+ATAB+ "(" +ANUMB+" INTEGER PRIMARY KEY AUTOINCREMENT," +AMAQA+" TEXT,"+AQABX+" TEXT,"+DATE19+" TEXT);";
    public AfanTwoDatabaseOne(Context context)
    {
        //here we are creating our database
        super(context, AFAN, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(AFAANKOO);
        //sdb.execSQL(NEKEMTE);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    //creating a method to insert kids information into database

    public void saveAfan21(AfanTwoDatabaseOne dbo, String names, String  points, String dates)
    {
        //creating an object to insert data into SQlite.

        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(AMAQA, names);
        bini.put(AQABX, points);
        bini.put(DATE19, dates);
        long bn = sql.insert(ATAB, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    //here create user defined method to retrieve information back from the database
    // remember the return type is cursor

    public Cursor ShowAfanTwoResultOne(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {ANUMB, AQABX, DATE19};
        String selection = AMAQA+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(ATAB, projection, selection, selection_args, null, null, null);
        return cursor;
    }
}
