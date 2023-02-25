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
public class EngOneLessThreeAudio extends AppCompatActivity
{
    private String [] capandsmall = new String[]{"A              a", "B              b", "C              c", "D              d", "E              e", "F              f", "G              g", "H              h", "I              i", "J              j", "K              k", "L              l", "M              m", "N              n", "O              o", "P              p", "Q              q", "R              r", "S              s", "T              t", "U              u", "V              v", "W              w", "X              x", "Y              y", "Z              z"};
    private ListView listView;
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_one_list_view_three);
        listView = (ListView) findViewById(R.id.mm);
        listView.setAdapter(new ArrayAdapter<>(this, R.layout.eng_one_single_row_three, R.id.just3, capandsmall));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.aa);
                    mediaPlayer.start();
                }

                if (position == 1) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bb);
                    mediaPlayer.start();
                }

                if (position == 2) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.cc);
                    mediaPlayer.start();
                }

                if (position == 3) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.dd);
                    mediaPlayer.start();
                }

                if (position == 4) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ee);
                    mediaPlayer.start();
                }

                if (position == 5) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ff);
                    mediaPlayer.start();
                }

                if (position == 6) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.gg);
                    mediaPlayer.start();
                }

                if (position == 7) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.hh);
                    mediaPlayer.start();
                }

                if (position == 8) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ii);
                    mediaPlayer.start();
                }

                if (position == 9) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.jj);
                    mediaPlayer.start();
                }

                if (position == 10) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.kk);
                    mediaPlayer.start();
                }

                if (position == 11) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ll);
                    mediaPlayer.start();
                }

                if (position == 12) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.mm);
                    mediaPlayer.start();
                }

                if (position == 13) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.nn);
                    mediaPlayer.start();
                }

                if (position == 14) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.oo);
                    mediaPlayer.start();
                }

                if (position == 15) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.pp);
                    mediaPlayer.start();
                }

                if (position == 16) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.qq);
                    mediaPlayer.start();
                }

                if (position == 17) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.rr);
                    mediaPlayer.start();
                }

                if (position == 18) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ss);
                    mediaPlayer.start();
                }

                if (position == 19) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tt);
                    mediaPlayer.start();
                }

                if (position == 20) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.uu);
                    mediaPlayer.start();
                }

                if (position == 21) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.vv);
                    mediaPlayer.start();
                }

                if (position == 22) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ww);
                    mediaPlayer.start();
                }

                if (position == 23) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.xx);
                    mediaPlayer.start();
                }

                if (position == 24) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.yy);
                    mediaPlayer.start();
                }

                if (position == 25) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.zz);
                    mediaPlayer.start();
                }
            }
        });
    }
}
