package com.bini.mame.abaoappsforteachingkids;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Mame on 4/9/2016.
 */
public class HerrTokoLessTwoAudio extends AppCompatActivity
{
    private ListView fulbana;
    private MediaPlayer abbush;
    private String jiota[] = {"+", "-", "X", "/", "="};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herr_one_list_view_two);
        fulbana = (ListView) findViewById(R.id.jab1);
        fulbana.setAdapter(new ArrayAdapter<>(this, R.layout.seven_single_row, R.id.gg2, jiota));
        fulbana.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.ida);
                    abbush.start();
                }
                if (position == 1)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.hir);
                    abbush.start();
                }
                if (position == 2)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.bay);
                    abbush.start();
                }
                if (position == 3)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.hiruu);
                    abbush.start();
                }
                if (position == 4)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.wolq);
                    abbush.start();
                }
            }
        });
    }
}
