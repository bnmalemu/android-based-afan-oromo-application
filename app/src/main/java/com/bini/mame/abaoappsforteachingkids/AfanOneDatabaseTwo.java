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
public class AfanOneDatabaseTwo extends SQLiteOpenHelper
{
    public static final String DAB1 = "DATABASE1";
    public static final String TAB1 = "GABATEE1";
    public static final String IDNO1 = "USERID1";
    public static final String NAME1 = "USERNAME1";
    public static final String MARK1 = "POINT1";
    public static final String DAY2 = "GUYYAA1";
    //database creation

    public static final int database_version = 1;

    //creating query for creating tables

    public String BIINII = "CREATE TABLE "+TAB1+ "(" +IDNO1+" INTEGER PRIMARY KEY AUTOINCREMENT," +NAME1+" TEXT,"+MARK1+" TEXT,"+DAY2+" TEXT);";
    public AfanOneDatabaseTwo(Context context)
    {
        //here we are creating our database
        super(context, DAB1, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        //database manipulation here/ execution

        sdb.execSQL(BIINII);
        //sdb.execSQL(NEKEMTE);

        Log.d("Table creation", "Table Created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    //creating a method to insert kids information into database

    public void savedOne(AfanOneDatabaseTwo dbo, String names, String  points, String days)
    {
        //creating an object to insert data into SQlite.

        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues bini = new ContentValues();
        bini.put(NAME1, names);
        bini.put(MARK1, points);
        bini.put(DAY2, days);
        long bn = sql.insert(TAB1, null, bini); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "kids point inserted successfully");
    }
    //here create user defined method to retrieve information back from the database
    public Cursor ShowAfanResultTwo(String username, SQLiteDatabase sqLiteDatabase)
    {
        String[] projection = {IDNO1, MARK1, DAY2};
        String selection = NAME1+" LIKE ?";
        String [] selection_args = {username};
        Cursor cursor = sqLiteDatabase.query(TAB1, projection, selection, selection_args, null, null, null);
        return cursor;
    }

}
