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
public class AfanSadiLessTwoAudio extends AppCompatActivity
{
    private ListView mame;
    private MediaPlayer kemer;
    private String jabaa[] = {"BADE", "BARA", "BIRA", "DHUFE", "FALA", "GALE", "GAMA", "GATE", "HARE", "JIRA",
                                "KORE", "KUTE", "LAFA", "LAMA", "MALA", "MANA", "NAMA", "QARA", "RAFE", "SONA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_three_list_view_two);
        mame = (ListView) findViewById(R.id.gh);
        mame.setAdapter(new ArrayAdapter<>(this, R.layout.afan_three_single_row_two, R.id.dh, jabaa));
        mame.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    kemer = MediaPlayer.create(getApplicationContext(), R.raw.bade);
                    kemer.start();
                }
                if (position == 1)
                {
                    kemer = MediaPlayer.create(getApplicationContext(), R.raw.bara);
                    kemer.start();
                }
                if (position == 2)
                {
                    kemer = MediaPlayer.create(getApplicationContext(), R.raw.bira);
                    kemer.start();
                }
                if (position == 3)
                {
                    kemer = MediaPlayer.create(getApplicationContext(), R.raw.dhufe);
                    kemer.start();
                }
                if (position == 4)
                {
                    kemer = MediaPlayer.create(getApplicationContext(), R.raw.fala);
                    kemer.start();
                }
                if (position == 5)
                {
                    kemer = MediaPlayer.create(getApplicationContext(), R.raw.gale);
                    kemer.start();
                }
                if (position == 6)
                {
                    kemer = MediaPlayer.create(getApplicationContext(), R.raw.gama);
                    kemer.start();
                }
                if (position == 7)
                {
                    kemer = MediaPlayer.create(getApplicationContext(), R.raw.gate);
                    kemer.start();
                }
                if (position == 8)
                {
                    kemer = MediaPlayer.create(getApplicationContext(), R.raw.hare);
                    kemer.start();
                }
                if (position == 9)
                {
                    kemer = MediaPlayer.create(getApplicationContext(), R.raw.jira);
                    kemer.start();
                }
                if (position == 10)
                {
                    kemer = MediaPlayer.create(getApplicationContext(), R.raw.kore);
                    kemer.start();
                }
                if (position == 11)
                {
                    kemer = MediaPlayer.create(getApplicationContext(), R.raw.kute);
                    kemer.start();
                }
                if (position == 12)
                {
                    kemer = MediaPlayer.create(getApplicationContext(), R.raw.lafa);
                    kemer.start();
                }
                if (position == 13)
                {
                    kemer = MediaPlayer.create(getApplicationContext(), R.raw.lama);
                    kemer.start();
                }
                if (position == 14)
                {
                    kemer = MediaPlayer.create(getApplicationContext(), R.raw.mala);
                    kemer.start();
                }
                if (position == 15)
                {
                    kemer = MediaPlayer.create(getApplicationContext(), R.raw.mana);
                    kemer.start();
                }
                if (position == 16)
                {
                    kemer = MediaPlayer.create(getApplicationContext(), R.raw.nama);
                    kemer.start();
                }
                if (position == 17)
                {
                    kemer = MediaPlayer.create(getApplicationContext(), R.raw.qara);
                    kemer.start();
                }
                if (position == 18)
                {
                    kemer = MediaPlayer.create(getApplicationContext(), R.raw.rafe);
                    kemer.start();
                }
                if (position == 19)
                {
                    kemer = MediaPlayer.create(getApplicationContext(), R.raw.sona);
                    kemer.start();
                }
            }
        });
    }
}
