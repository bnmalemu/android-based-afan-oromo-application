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
public class EngTwoDatabaseThree extends SQLiteOpenHelper
{
    public static final String ENG3 = "EDAB3";
    public static final String EGAB3 = "ETAB3";
    public static final String ELAK3 ="ENUM13";
    public static final String ENAM3 = "EMAMY";
    public static final String EPOT3 = "EPTS3";
    public static final String DATE5 = "DATE5";
    public static final int database_version = 1;

    //creating query for creating tables

    public String HABTE3 = "CREATE TABLE "+EGAB3+ "(" +ELAK3+" INTEGER PRIMARY KEY AUTOINCREMENT," +ENAM3+" TEXT,"+EPOT3+" TEXT,"+DATE5+" TEXT);";
    public EngTwoDatabaseThree(Context context)
    {
        //here we are creating our database
        super(context, ENG3, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(HABTE3);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    //creating a method to insert kids information into database

    public void saveEng23(EngTwoDatabaseThree dbo, String names, String  points, String day)
    {
        //creating an object to insert data into SQlite.

        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(ENAM3, names);
        bini.put(EPOT3, points);
        bini.put(DATE5, day);
        long bn = sql.insert(EGAB3, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    //here create user defined method to retrieve information back from the database
    // remember the return type is cursor

    public Cursor ShowEngTwoResultThree(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {ELAK3, EPOT3, DATE5};
        String selection = ENAM3+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(EGAB3, projection, selection, selection_args, null, null, null);
        return cursor;
    }
}
