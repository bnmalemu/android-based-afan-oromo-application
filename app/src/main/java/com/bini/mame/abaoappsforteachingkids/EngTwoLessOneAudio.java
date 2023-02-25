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
public class EngTwoLessOneAudio extends AppCompatActivity
{
    private ListView biinii;
    private MediaPlayer player;
    String dubachistu[] = {"    A   ", "    E   ", "    I   ", "    O   ", "    U   ",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_two_list_view_one);
        biinii = (ListView) findViewById(R.id.ss);
        biinii.setAdapter(new ArrayAdapter<>(this, R.layout.eng_two_single_row_one, R.id.pa, dubachistu));
        biinii.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    player = MediaPlayer.create(getApplicationContext(), R.raw.aa);
                    player.start();
                }
                if (position == 1)
                {
                    player = MediaPlayer.create(getApplicationContext(), R.raw.ee);
                    player.start();
                }
                if (position == 2)
                {
                    player = MediaPlayer.create(getApplicationContext(), R.raw.ii);
                    player.start();
                }
                if (position == 3)
                {
                    player = MediaPlayer.create(getApplicationContext(), R.raw.oo);
                    player.start();
                }
                if (position == 4)
                {
                    player = MediaPlayer.create(getApplicationContext(), R.raw.uu);
                    player.start();
                }
            }
        });
    }
}
