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
public class AfanOneDatabaseThree extends SQLiteOpenHelper
{
    public static final String DAB2 = "DATABASE2";
    public static final String TAB2 = "GABATEE2";
    public static final String IDNO2 = "USERID2";
    public static final String NAME2 = "USERNAME2";
    public static final String MARK2 = "POINT2";
    public static final String DAY3 = "GUYYAA3";
    //database creation

    public static final int database_version = 1;

    //creating query for creating tables

    public String MAME = "CREATE TABLE "+TAB2+ "(" +IDNO2+" INTEGER PRIMARY KEY AUTOINCREMENT," +NAME2+" TEXT,"+MARK2+" TEXT, "+DAY3+" TEXT);";
    public AfanOneDatabaseThree(Context context)
    {
        //here we are creating our database
        super(context, DAB2, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(MAME);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    //creating a method to insert kids information into database

    public void savedTwo(AfanOneDatabaseThree dbo, String names, String  points, String day)
    {
        //creating an object to insert data into SQlite.

        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(NAME2, names);
        bini.put(MARK2, points);
        bini.put(DAY3, day);
        long bn = sql.insert(TAB2, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    //here create user defined method to retrieve information back from the database
    // remember the return type is cursor
    public Cursor ShowAfanResultThree(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {IDNO2, MARK2, DAY3};
        String selection = NAME2+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(TAB2, projection, selection, selection_args, null, null, null);
        return cursor;
    }
}
