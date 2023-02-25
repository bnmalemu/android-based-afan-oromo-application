package com.bini.mame.abaoappsforteachingkids;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Mame on 6/11/2016.
 */
public class AfanSadiLessFiveAudio extends AppCompatActivity
{
    private ListView fulbana;
    private MediaPlayer abbush;
    private String jiota[] = {"FULBAANA", "ONKOLOOLESSA", "SADAASA", "MUDDE", "AMAJJI", "GURAANDHALA",
            "BITOOTESSA", "EEBILA", "CAAMSAA", "WAXABAJJII", "ADOOLESSA", "HAGAYYA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_three_list_view_five);
        fulbana = (ListView) findViewById(R.id.lee);
        fulbana.setAdapter(new ArrayAdapter<>(this, R.layout.five_single_row, R.id.lee1, jiota));
        fulbana.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.ful);
                    abbush.start();
                }
                if (position == 1)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.onk);
                    abbush.start();
                }
                if (position == 2)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.sad);
                    abbush.start();
                }
                if (position == 3)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.mud);
                    abbush.start();
                }
                if (position == 4)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.amj);
                    abbush.start();
                }
                if (position == 5)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.gur);
                    abbush.start();
                }
                if (position == 6)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.bit);
                    abbush.start();
                }
                if (position == 7)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.ebl);
                    abbush.start();
                }
                if (position == 8)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.cam);
                    abbush.start();
                }
                if (position == 9)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.wax);
                    abbush.start();
                }
                if (position == 10)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.adol);
                    abbush.start();
                }
                if (position == 11)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.hag);
                    abbush.start();
                }
            }
        });
    }
}
