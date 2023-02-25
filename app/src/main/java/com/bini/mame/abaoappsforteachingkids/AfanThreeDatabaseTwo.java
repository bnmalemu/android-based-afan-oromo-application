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
public class AfanThreeDatabaseTwo extends SQLiteOpenHelper
{
    public static final String AFAN12 = "ADATA12";
    public static final String ATAB12 = "AROWS12";
    public static final String ANUMB12 = "ALAK12";
    public static final String AMAQA12 = "AMAQAA12";
    public static final String AQABX12 = "AQABXI12";
    public static final String DATE31 = "DATE31";
    public static final int database_version = 1;

    //creating query for creating tables

    public String FAYE2 = "CREATE TABLE "+ATAB12+ "(" +ANUMB12+" INTEGER PRIMARY KEY AUTOINCREMENT," +AMAQA12+" TEXT,"+AQABX12+" TEXT,"+DATE31+" TEXT);";
    public AfanThreeDatabaseTwo(Context context)
    {
        //here we are creating our database
        super(context, AFAN12, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(FAYE2);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    public void saveAfan32(AfanThreeDatabaseTwo dbo, String names, String  points, String date)
    {
        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(AMAQA12, names);
        bini.put(AQABX12, points);
        bini.put(DATE31, date);
        long bn = sql.insert(ATAB12, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    public Cursor ShowAfanThreeResultTwo(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {ANUMB12, AQABX12, DATE31};
        String selection = AMAQA12+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(ATAB12, projection, selection, selection_args, null, null, null);
        return cursor;
    }
}
