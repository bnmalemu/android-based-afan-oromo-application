package com.bini.mame.abaoappsforteachingkids;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Mame on 4/16/2016.
 */
public class EngTwoLessThreeAudio extends AppCompatActivity
{
    private ListView guyyoota;
    private MediaPlayer honey;
    private String monday[] = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_two_list_view_three);
        guyyoota = (ListView) findViewById(R.id.uu);
        guyyoota.setAdapter(new ArrayAdapter<>(this, R.layout.eng_two_single_row_three, R.id.ra, monday));
        guyyoota.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    honey = MediaPlayer.create(getApplicationContext(), R.raw.mon);
                    honey.start();
                }
                if (position == 1)
                {
                    honey = MediaPlayer.create(getApplicationContext(), R.raw.tue);
                    honey.start();
                }
                if (position == 2)
                {
                    honey = MediaPlayer.create(getApplicationContext(), R.raw.wend);
                    honey.start();
                }
                if (position == 3)
                {
                    honey = MediaPlayer.create(getApplicationContext(), R.raw.thur);
                    honey.start();
                }
                if (position == 4)
                {
                    honey = MediaPlayer.create(getApplicationContext(), R.raw.fri);
                    honey.start();
                }
                if (position == 5)
                {
                    honey = MediaPlayer.create(getApplicationContext(), R.raw.sat);
                    honey.start();
                }
                if (position == 6)
                {
                    honey = MediaPlayer.create(getApplicationContext(), R.raw.sun);
                    honey.start();
                }

            }

        });
    }
}
