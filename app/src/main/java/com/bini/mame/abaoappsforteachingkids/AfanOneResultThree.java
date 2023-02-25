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
 * Created by Mame on 5/25/2016.
 */
public class AfanOneResultThree extends AppCompatActivity
{
    private EditText users;
    private Button see;
    private String name;
    private String lakko, qabxii, guyyaa;
    AfanOneDatabaseThree afanOneDatabaseThree;
    SQLiteDatabase sqLiteDatabase;
    private ListView listView;
    AfanOneNameOne afanOneNameOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_one_username_three);
        users = (EditText) findViewById(R.id.maq3);
        see = (Button) findViewById(R.id.fun3);
        listView = (ListView) findViewById(R.id.listView3);
        afanOneNameOne = new AfanOneNameOne(getApplicationContext(), R.layout.afan_list_one);
        listView.setAdapter(afanOneNameOne);
        see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = users.getText().toString();
                if (name.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "MAALOO FAYYADAMA MAQAA KEESSAN GUUTAA!", Toast.LENGTH_LONG).show();
                    users.setText("");
                }
                else
                {
                    afanOneDatabaseThree = new AfanOneDatabaseThree(getApplicationContext());
                    sqLiteDatabase = afanOneDatabaseThree.getReadableDatabase();
                    Cursor cursor = afanOneDatabaseThree.ShowAfanResultThree(name, sqLiteDatabase );
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
