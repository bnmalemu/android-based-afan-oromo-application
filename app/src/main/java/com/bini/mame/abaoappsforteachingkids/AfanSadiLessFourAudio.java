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
public class AfanSadiLessFourAudio extends AppCompatActivity
{
    private ListView fulbana;
    private MediaPlayer abbush;
    private String jiota[] = {"BAALA", "CAAMA", "CAASAA", "DIINA", "GAARA", "HAAMUU", "HOOLAA", "KAASUU", "LAFA", "LAFEE",
                                "LAMA", "MALA", "MANA", "NAMA", "QARA", "RAASE", "RAFE", "SAAMUU", "SEENAA", "WAAQA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_three_list_view_four);
        fulbana = (ListView) findViewById(R.id.la);
        fulbana.setAdapter(new ArrayAdapter<>(this, R.layout.afan_three_single_row_four, R.id.dj, jiota));
        fulbana.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.baala);
                    abbush.start();
                }
                if (position == 1)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.caama);
                    abbush.start();
                }
                if (position == 2)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.caasaa);
                    abbush.start();
                }
                if (position == 3)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.diina);
                    abbush.start();
                }
                if (position == 4)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.gaara);
                    abbush.start();
                }
                if (position == 5)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.haamuu);
                    abbush.start();
                }
                if (position == 6)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.hoolaa);
                    abbush.start();
                }
                if (position == 7)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.kaasuu);
                    abbush.start();
                }
                if (position == 8)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.lafa);
                    abbush.start();
                }
                if (position == 9)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.lafee);
                    abbush.start();
                }
                if (position == 10)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.lama);
                    abbush.start();
                }
                if (position == 11)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.mala);
                    abbush.start();
                }
                if (position == 12)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.mana);
                    abbush.start();
                }
                if (position == 13)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.nama);
                    abbush.start();
                }
                if (position == 14)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.qara);
                    abbush.start();
                }
                if (position == 15)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.raase);
                    abbush.start();
                }
                if (position == 16)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.rafe);
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
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.waaqa);
                    abbush.start();
                }
            }
        });
    }
}
