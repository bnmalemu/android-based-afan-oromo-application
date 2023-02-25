package com.bini.mame.abaoappsforteachingkids;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Mame on 5/11/2016.
 */
public class EngOneResultOne extends AppCompatActivity
{
    private EditText users;
    private Button see;
    private String name;
    private String lakko, qabxii, guyyaa;
    EngOneDatabaseOne engOneDatabaseOne;
    SQLiteDatabase sqLiteDatabase;
    private ListView listView;
    private  Cursor cursor;
    AfanOneNameOne afanOneNameOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_one_username_one);
        users = (EditText) findViewById(R.id.maq4);
        see = (Button) findViewById(R.id.fun4);
        listView = (ListView) findViewById(R.id.listView4);
        afanOneNameOne = new AfanOneNameOne(getApplicationContext(), R.layout.afan_list_one);
        listView.setAdapter(afanOneNameOne);
        see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = users.getText().toString();
                if (!(name.equals(cursor.getString(0))))
                {
                    Toast.makeText(getApplicationContext(), "FAYYADAMA MAQAA DOGOGGORAA GUUTTAN, " +
                            "MAALOO FAYYADAMA MAQAA KEESSAN GUUTAA!", Toast.LENGTH_LONG).show();
                    users.setText("");
                }

                else if (name.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "MAALOO FAYYADAMA MAQAA KEESSAN GUUTAA!", Toast.LENGTH_LONG).show();
                    users.setText("");
                }
                else
                {
                    engOneDatabaseOne = new EngOneDatabaseOne(getApplicationContext());
                    sqLiteDatabase = engOneDatabaseOne.getReadableDatabase();
                    cursor = engOneDatabaseOne.ShowEngResultOne(name, sqLiteDatabase);
                    Log.d("You user name is", "" + name);
                    if (cursor.moveToFirst())
                    {
                        do {
                            lakko = cursor.getString(0);
                            qabxii = cursor.getString(1);
                            guyyaa = cursor.getString(2);
                            DataProviders dataProviders = new DataProviders(lakko, qabxii, guyyaa);
                            afanOneNameOne.add(dataProviders);
                        }while (cursor.moveToNext());
                    }
                }
            }
        });
    }
}
