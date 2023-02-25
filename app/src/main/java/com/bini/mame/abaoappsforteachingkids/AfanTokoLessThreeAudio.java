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
public class AfanTokoLessThreeAudio extends AppCompatActivity
{
    private String [] capandsmall = new String[]{"A              a", "B              b", "C              c", "D              d", "E              e", "F              f", "G              g", "H              h", "I              i", "J              j", "K              k", "L              l", "M              m", "N              n", "O              o", "P              p", "Q              q", "R              r", "S              s", "T              t", "U              u", "V              v", "W              w", "X              x", "Y              y", "Z              z"};
    private ListView listView;
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_one_list_view_three);
        listView = (ListView) findViewById(R.id.ga);
        listView.setAdapter(new ArrayAdapter<>(this, R.layout.afan_one_single_row_less_three, R.id.da, capandsmall));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.a);
                    mediaPlayer.start();
                }

                if (position == 1) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.b);
                    mediaPlayer.start();
                }

                if (position == 2) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.c);
                    mediaPlayer.start();
                }

                if (position == 3) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.d);
                    mediaPlayer.start();
                }

                if (position == 4) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.e);
                    mediaPlayer.start();
                }

                if (position == 5) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.f);
                    mediaPlayer.start();
                }

                if (position == 6) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.g);
                    mediaPlayer.start();
                }

                if (position == 7) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.h);
                    mediaPlayer.start();
                }

                if (position == 8) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.i);
                    mediaPlayer.start();
                }

                if (position == 9) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.j);
                    mediaPlayer.start();
                }

                if (position == 10) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.k);
                    mediaPlayer.start();
                }

                if (position == 11) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.l);
                    mediaPlayer.start();
                }

                if (position == 12) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.m);
                    mediaPlayer.start();
                }

                if (position == 13) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.n);
                    mediaPlayer.start();
                }

                if (position == 14) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.o);
                    mediaPlayer.start();
                }

                if (position == 15) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.p);
                    mediaPlayer.start();
                }

                if (position == 16) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.q);
                    mediaPlayer.start();
                }

                if (position == 17) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.r);
                    mediaPlayer.start();
                }

                if (position == 18) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.s);
                    mediaPlayer.start();
                }

                if (position == 19) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.t);
                    mediaPlayer.start();
                }

                if (position == 20) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.u);
                    mediaPlayer.start();
                }

                if (position == 21) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v);
                    mediaPlayer.start();
                }

                if (position == 22) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.w);
                    mediaPlayer.start();
                }

                if (position == 23) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.x);
                    mediaPlayer.start();
                }

                if (position == 24) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.y);
                    mediaPlayer.start();
                }

                if (position == 25) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.z);
                    mediaPlayer.start();
                }
            }
        });
    }
}
