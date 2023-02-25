package com.bini.mame.abaoappsforteachingkids;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Mame on 5/14/2016.
 */
public class AfanOneDatabaseOne extends SQLiteOpenHelper
{
    //database creation

    public static final int database_version = 1;
    public static final String DAB = "DATABASE";
    public static final String TAB = "GABATEE";
    public static final String IDNO = "USERID";
    public static final String NAME = "USERNAME";
    public static final String DAY1 = "GUYYAA";
    public static final String MARK = "POINT";

    //creating query for creating tables

    public String NEKEMTE = "CREATE TABLE "+TAB+ "(" +IDNO+" INTEGER PRIMARY KEY AUTOINCREMENT," +NAME+" TEXT," +MARK+" TEXT, "+DAY1+" TEXT);";
    public AfanOneDatabaseOne(Context context)
    {
        //here we are creating our database
        super(context, DAB, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(NEKEMTE);
        //sdb.execSQL(NEKEMTE);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    //creating a method to insert kids information into database

    public void saved(AfanOneDatabaseOne dbo, String names, String  points, String days)
    {
        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(NAME, names);
        bini.put(MARK, points);
        bini.put(DAY1, days);
        long bn = sql.insert(TAB, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    public Cursor ShowAfanOneResultOne(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {IDNO, MARK, DAY1};
        String selection = NAME+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(TAB, projection, selection, selection_args, null, null, null);
        return cursor;
    }
}


