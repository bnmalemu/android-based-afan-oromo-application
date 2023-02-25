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
public class AfanLamaLessOneAudio extends AppCompatActivity
{
    private ListView biinii;
    private MediaPlayer player;
    private String biniam[] = new String []{"    A   ", "    E   ", "    I   ", "    O   ", "    U   "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_two_list_view_one);
        biinii = (ListView) findViewById(R.id.vow);
        biinii.setAdapter(new ArrayAdapter<>(this, R.layout.afan_two_single_row_less_one, R.id.vow1, biniam));
        biinii.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    player = MediaPlayer.create(getApplicationContext(), R.raw.a);
                    player.start();
                }
                if (position == 1)
                {
                    player = MediaPlayer.create(getApplicationContext(), R.raw.e);
                    player.start();
                }
                if (position == 2)
                {
                    player = MediaPlayer.create(getApplicationContext(), R.raw.i);
                    player.start();
                }
                if (position == 3)
                {
                    player = MediaPlayer.create(getApplicationContext(), R.raw.o);
                    player.start();
                }
                if (position == 4)
                {
                    player = MediaPlayer.create(getApplicationContext(), R.raw.u);
                    player.start();
                }
            }
        });
    }
}
