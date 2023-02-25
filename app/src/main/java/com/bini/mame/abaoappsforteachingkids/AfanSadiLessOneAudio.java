package com.bini.mame.abaoappsforteachingkids;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by Mame on 5/8/2016.
 */
public class AfanSadiLessOneAudio extends AppCompatActivity
{
    private ListView fulbana;
    private MediaPlayer abbush;
    private String jiota[] = {"AANAA", "BAADUU", "CAASAA", "DEEMUU", "DHAANUU", "DIIMAA",
            "GAABII", "HAAMUU", "HOOLAA", "JAAMAA", "KAASUU", "LAAFAA", "OOFUU", "QOODUU",
            "RAAFUU", "RAASUU", "REEBUU", "SAAMUU", "SEENAA", "SAAMUU", "YAABUU"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_three_list_view_one);
        fulbana = (ListView) findViewById(R.id.gg);
        fulbana.setAdapter(new ArrayAdapter<>(this, R.layout.six_single_row, R.id.gg1, jiota));
        fulbana.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.aanaa);
                    abbush.start();
                }
                if (position == 1)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.baaduu);
                    abbush.start();
                }
                if (position == 2)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.caasaa);
                    abbush.start();
                }
                if (position == 3)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.deemuu);
                    abbush.start();
                }
                if (position == 4)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.dhaanuu);
                    abbush.start();
                }
                if (position == 5)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.diimaa);
                    abbush.start();
                }
                if (position == 6)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.gaabii);
                    abbush.start();
                }
                if (position == 7)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.haamuu);
                    abbush.start();
                }
                if (position == 8)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.hoolaa);
                    abbush.start();
                }
                if (position == 9)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.jaamaa);
                    abbush.start();
                }
                if (position == 10)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.kaasuu);
                    abbush.start();
                }
                if (position == 11)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.laafaa);
                    abbush.start();
                }
                if (position == 12)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.oofuu);
                    abbush.start();
                }
                if (position == 13)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.qooduu);
                    abbush.start();
                }
                if (position == 14)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.raafuu);
                    abbush.start();
                }
                if (position == 15)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.raasuu);
                    abbush.start();
                }
                if (position == 16)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.reebuu);
                    abbush.start();
                }
                if (position == 17)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.saamuu);
                    abbush.start();
                }
                if (position == 18)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.seenaa);
                    abbush.start();
                }
                if (position == 19)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.saamuu);
                    abbush.start();
                }
                if (position == 20)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.yaabuu);
                    abbush.start();
                }
            }
        });
    }
}
