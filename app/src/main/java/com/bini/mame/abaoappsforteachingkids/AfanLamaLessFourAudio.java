package com.bini.mame.abaoappsforteachingkids;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Mame on 4/13/2016.
 */
public class AfanLamaLessFourAudio extends AppCompatActivity
{
    private ListView guyyoota;
    private MediaPlayer honey;
    private String monday[] = {"WIIXATA", "KIBXATA", "ROOBII", "KAMISA", "JIMAATA", "SANBATA", "DILBATA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_two_list_view_four);
        guyyoota = (ListView) findViewById(R.id.gf);
        guyyoota.setAdapter(new ArrayAdapter<>(this, R.layout.afan_two_single_row_four, R.id.df, monday));
        guyyoota.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    honey = MediaPlayer.create(getApplicationContext(), R.raw.wix);
                    honey.start();
                }
                if (position == 1)
                {
                    honey = MediaPlayer.create(getApplicationContext(), R.raw.kib);
                    honey.start();
                }
                if (position == 2)
                {
                    honey = MediaPlayer.create(getApplicationContext(), R.raw.rob);
                    honey.start();
                }
                if (position == 3)
                {
                    honey = MediaPlayer.create(getApplicationContext(), R.raw.kam);
                    honey.start();
                }
                if (position == 4)
                {
                    honey = MediaPlayer.create(getApplicationContext(), R.raw.jim);
                    honey.start();
                }
                if (position == 5)
                {
                    honey = MediaPlayer.create(getApplicationContext(), R.raw.sanb);
                    honey.start();
                }
                if (position == 6)
                {
                    honey = MediaPlayer.create(getApplicationContext(), R.raw.dilb);
                    honey.start();
                }

            }

        });
    }
}
