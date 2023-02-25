package com.bini.mame.abaoappsforteachingkids;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Mame on 3/16/2016.
 */
public class DatabaseOperation extends SQLiteOpenHelper
{
    public static final String ID = "ID_NUMBER";


    public static final String USERNAME = "KGUSERNAME";
    public static final String PASSWORD = "PAASSWORD";
    public static final String LEVEL = "LEVEL";
    public static final String MAME = "MAAMMEE";
    public static final String BINIYAM = "GAMMEE";

    //database creation

    public static final int database_version = 1;

    //creating query for creating tables

    public String CREATE_QUERY = "CREATE TABLE "+BINIYAM+ "(" +ID+" INTEGER PRIMARY KEY AUTOINCREMENT," +USERNAME+" TEXT," +PASSWORD+" TEXT,"+LEVEL+" TEXT);";

    public DatabaseOperation(Context context)
    {
    //here we are creating our database
        super(context, MAME, null, database_version);
        Log.d("Database creation", "Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb)
    {
        sdb.execSQL(CREATE_QUERY);

        Log.d("Table creation", "Table Created");
    }

      @Override
    public void onUpgrade(SQLiteDatabase sdb, int oldVersion, int newVersion) {

    }

    //creating a method to insert kids information into database

    public void regStudent(DatabaseOperation dbo, String username, String password, String  level)
    {

        SQLiteDatabase sql = dbo.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(USERNAME, username);
        cv.put(PASSWORD, password);
        cv.put(LEVEL, level);
        long bn = sql.insert(BINIYAM, null, cv); //successfully inserted log b/c this stmt returns a long value
        Log.d("Database operation", "Username created successfully");
    }

    public Cursor getInformation(DatabaseOperation bdbo) {
        SQLiteDatabase sql = bdbo.getReadableDatabase();

        //create string array to take information and initialize th array

        String[] columns = {USERNAME, PASSWORD, LEVEL};
        Cursor cr = sql.query(BINIYAM, columns, null, null, null, null, null, null);
        //return the cursor object

        return cr;

    }
}
