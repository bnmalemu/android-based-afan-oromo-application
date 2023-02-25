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
public class EngTwoDatabaseTwo extends SQLiteOpenHelper
{
    public static final String ENG2 = "EDAB2";
    public static final String EGAB2 = "ETAB2";
    public static final String ELAK2 ="ENUM2";
    public static final String ENAM2 = "EEMU2";
    public static final String EPOT2 = "EPTS2";
    public static final String DATE4 = "DATE4";
    public static final int database_version = 1;

    //creating query for creating tables

    public String HABTE2 = "CREATE TABLE "+EGAB2+ "(" +ELAK2+" INTEGER PRIMARY KEY AUTOINCREMENT," +ENAM2+" TEXT,"+EPOT2+" TEXT,"+DATE4+" TEXT);";
    public EngTwoDatabaseTwo(Context context)
    {
        //here we are creating our database
        super(context, ENG2, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(HABTE2);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    //creating a method to insert kids information into database

    public void saveEng22(EngTwoDatabaseTwo dbo, String names, String  points, String days)
    {
        //creating an object to insert data into SQlite.

        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(ENAM2, names);
        bini.put(EPOT2, points);
        bini.put(DATE4, days);
        long bn = sql.insert(EGAB2, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    //here create user defined method to retrieve information back from the database
    // remember the return type is cursor

    public Cursor ShowEngTwoResultTwo(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {ELAK2, EPOT2, DATE4};
        String selection = ENAM2+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(EGAB2, projection, selection, selection_args, null, null, null);
        return cursor;
    }
}
