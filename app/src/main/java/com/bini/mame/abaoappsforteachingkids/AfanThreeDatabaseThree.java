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
public class AfanThreeDatabaseThree extends SQLiteOpenHelper
{
    public static final String AFAN22 = "ADATA22";
    public static final String ATAB22 = "AROWS22";
    public static final String ANUMB22 = "ALAK22";
    public static final String AMAQA22 = "AMAQAA22";
    public static final String AQABX22 = "AQABXI22";
    public static final String DATE32 = "DATE32";
    public static final int database_version = 1;

    //creating query for creating tables

    public String FAYE3 = "CREATE TABLE "+ATAB22+ "(" +ANUMB22+" INTEGER PRIMARY KEY AUTOINCREMENT," +AMAQA22+" TEXT,"+AQABX22+" TEXT,"+DATE32+" TEXT);";
    public AfanThreeDatabaseThree(Context context)
    {
        //here we are creating our database
        super(context, AFAN22, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(FAYE3);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    public void saveAfan33(AfanThreeDatabaseThree dbo, String names, String  points, String date)
    {
        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(AMAQA22, names);
        bini.put(AQABX22, points);
        bini.put(DATE32, date);
        long bn = sql.insert(ATAB22, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    public Cursor ShowAfanThreeResultThree(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {ANUMB22, AQABX22, DATE32};
        String selection = AMAQA22+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(ATAB22, projection, selection, selection_args, null, null, null);
        return cursor;
    }
}
