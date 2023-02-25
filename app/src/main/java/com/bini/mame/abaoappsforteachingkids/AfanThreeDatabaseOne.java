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
public class AfanThreeDatabaseOne extends SQLiteOpenHelper
{
    public static final String AFAN11 = "ADATA11";
    public static final String ATAB11 = "AROWS11";
    public static final String ANUMB11 = "ALAK11";
    public static final String AMAQA11 = "AMAQAA11";
    public static final String AQABX11 = "AQABXI11";
    public static final String DATE30 = "DATE30";
    public static final int database_version = 1;

    //creating query for creating tables

    public String FAYE1 = "CREATE TABLE "+ATAB11+ "(" +ANUMB11+" INTEGER PRIMARY KEY AUTOINCREMENT," +AMAQA11+" TEXT,"+AQABX11+" TEXT,"+DATE30+" TEXT);";
    public AfanThreeDatabaseOne(Context context)
    {
        //here we are creating our database
        super(context, AFAN11, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(FAYE1);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    public void saveAfan31(AfanThreeDatabaseOne dbo, String names, String  points, String date)
    {
        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(AMAQA11, names);
        bini.put(AQABX11, points);
        bini.put(DATE30, date);
        long bn = sql.insert(ATAB11, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    public Cursor ShowAfanThreeResultOne(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {ANUMB11, AQABX11, DATE30};
        String selection = AMAQA11+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(ATAB11, projection, selection, selection_args, null, null, null);
        return cursor;
    }
}
