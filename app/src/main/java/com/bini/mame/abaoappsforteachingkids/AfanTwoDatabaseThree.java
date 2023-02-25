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
public class AfanTwoDatabaseThree extends SQLiteOpenHelper
{
    public static final String AFAN2 = "ADATA2";
    public static final String ATAB2 = "AROWS2";
    public static final String ANUMB2 = "ALAK2";
    public static final String AMAQA2 = "AMAQAA2";
    public static final String AQABX2 = "AQABXI2";
    public static final String DATE21 = "DATE21";
    public static final int database_version = 1;

    //creating query for creating tables

    public String AFAANKOO2 = "CREATE TABLE "+ATAB2+ "(" +ANUMB2+" INTEGER PRIMARY KEY AUTOINCREMENT," +AMAQA2+" TEXT,"+AQABX2+" TEXT,"+DATE21+" TEXT);";
    public AfanTwoDatabaseThree(Context context)
    {
        //here we are creating our database
        super(context, AFAN2, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(AFAANKOO2);
        //sdb.execSQL(NEKEMTE);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    //creating a method to insert kids information into database

    public void saveAfan23(AfanTwoDatabaseThree dbo, String names, String  points, String no)
    {
        //creating an object to insert data into SQlite.

        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(AMAQA2, names);
        bini.put(AQABX2, points);
        bini.put(DATE21, no);
        long bn = sql.insert(ATAB2, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    //here create user defined method to retrieve information back from the database
    // remember the return type is cursor

    public Cursor ShowAfanTwoResultThree(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {ANUMB2, AQABX2, DATE21};
        String selection = AMAQA2+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(ATAB2, projection, selection, selection_args, null, null, null);
        return cursor;
    }
}
