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
public class EngOneDatabaseOne extends SQLiteOpenHelper
{
    public static final String BINI1 = "ENGLISH";
    public static final String BINI2 = "JUTABLE";
    public static final String BINI3 = "JULAKKO";
    public static final String BINI4 = "JUMAQAA";
    public static final String BINI5 = "JUQABXI";
    private static final String BINI6 = "DATE1";
    public static final int database_version = 1;

    //creating query for creating tables

    public String STEPHEN = "CREATE TABLE "+BINI2+ "(" +BINI3+" INTEGER PRIMARY KEY AUTOINCREMENT," +BINI4+" TEXT,"+BINI5+" TEXT, "+BINI6+" TEXT);";
    public EngOneDatabaseOne(Context context)
    {
        //here we are creating our database
        super(context, BINI1, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(STEPHEN);
        //sdb.execSQL(NEKEMTE);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    //creating a method to insert kids information into database

    public void saveEng11(EngOneDatabaseOne dbo, String names, String  points, String day)
    {
        //creating an object to insert data into SQlite.

        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(BINI4, names);
        bini.put(BINI5, points);
        bini.put(BINI6, day);
        long bn = sql.insert(BINI2, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    //here create user defined method to retrieve information back from the database
    // remember the return type is cursor
    public Cursor ShowEngResultOne(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {BINI3, BINI5, BINI6};
        String selection = BINI4+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(BINI1, projection, selection, selection_args, null, null, null);
        return cursor;
    }
}
