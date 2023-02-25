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
public class EngOneDatabaseTwo extends SQLiteOpenHelper
{
    public static final String EDBS1 = "ENGLISH1";
    public static final String TABLE1 = "TABLE1";
    public static final String NUMBS1 = "LAKK1";
    public static final String USER1 = "MAQAA1";
    public static final String POINT1 = "QABXII1";
    public static final String DATE1 = "DATE1";
    //database creation

    public static final int database_version = 1;

    //creating query for creating tables

    public String ETABLE1 = "CREATE TABLE "+TABLE1+ "(" +NUMBS1+" INTEGER PRIMARY KEY AUTOINCREMENT," +USER1+" TEXT,"+POINT1+" TEXT,"+DATE1+" TEXT);";
    public EngOneDatabaseTwo(Context context)
    {
        //here we are creating our database
        super(context, EDBS1, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(ETABLE1);
        //sdb.execSQL(NEKEMTE);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    //creating a method to insert kids information into database

    public void saveEngTwo(EngOneDatabaseTwo dbo, String names, String  points, String day)
    {
        //creating an object to insert data into SQlite.

        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(USER1, names);
        bini.put(POINT1, points);
        bini.put(DATE1, day);
        long bn = sql.insert(TABLE1, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    //here create user defined method to retrieve information back from the database
    // remember the return type is cursor
    public Cursor ShowEngResultTwo(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {NUMBS1, POINT1, DATE1};
        String selection = USER1+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(TABLE1, projection, selection, selection_args, null, null, null);
        return cursor;
    }
}
