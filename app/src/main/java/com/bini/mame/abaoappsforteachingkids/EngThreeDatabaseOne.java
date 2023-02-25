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
public class EngThreeDatabaseOne extends SQLiteOpenHelper
{
    public static final String ENG11 = "EDAB11";
    public static final String EGAB11 = "ETAB11";
    public static final String ELAK11 ="ENUM11";
    public static final String ENAM11 = "ENAM11";
    public static final String EPOT11 = "EPTS11";
    public static final String DATE6 = "DATE6";
    public static final int database_version = 1;

    //creating query for creating tables

    public String BONSA = "CREATE TABLE "+EGAB11+ "(" +ELAK11+" INTEGER PRIMARY KEY AUTOINCREMENT," +ENAM11+" TEXT,"+EPOT11+" TEXT,"+DATE6+" TEXT);";
    public EngThreeDatabaseOne(Context context)
    {
        //here we are creating our database
        super(context, ENG11, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(BONSA);
        //sdb.execSQL(NEKEMTE);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    //creating a method to insert kids information into database

    public void saveEng31(EngThreeDatabaseOne dbo, String names, String  points, String day)
    {
        //creating an object to insert data into SQlite.

        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(ENAM11, names);
        bini.put(EPOT11, points);
        bini.put(DATE6, day);
        long bn = sql.insert(EGAB11, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    //here create user defined method to retrieve information back from the database
    // remember the return type is cursor
    public Cursor ShowEngThreeResultOne(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {ELAK11, EPOT11, DATE6};
        String selection = ENAM11+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(EGAB11, projection, selection, selection_args, null, null, null);
        return cursor;
    }

}
