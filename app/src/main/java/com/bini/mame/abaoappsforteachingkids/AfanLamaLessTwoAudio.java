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
public class AfanLamaLessTwoAudio extends AppCompatActivity
{
    private ListView jaarsoo;
    private MediaPlayer ladies;
    private String [] dubbifamaa = new String[]{"B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_two_list_view_two);
        jaarsoo = (ListView) findViewById(R.id.gd);
        jaarsoo.setAdapter(new ArrayAdapter<>(this, R.layout.afan_two_single_row_less_two, R.id.dd, dubbifamaa));
        jaarsoo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.b);
                    ladies.start();
                }

                if (position == 1) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.c);
                    ladies.start();
                }

                if (position == 2) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.d);
                    ladies.start();
                }

                if (position == 3) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.f);
                    ladies.start();
                }

                if (position == 4) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.g);
                    ladies.start();
                }

                if (position == 5) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.h);
                    ladies.start();
                }

                if (position == 6) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.j);
                    ladies.start();
                }

                if (position == 7) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.k);
                    ladies.start();
                }

                if (position == 8) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.l);
                    ladies.start();
                }

                if (position == 9) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.m);
                    ladies.start();
                }

                if (position == 10) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.n);
                    ladies.start();
                }

                if (position == 11) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.p);
                    ladies.start();
                }

                if (position == 12) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.q);
                    ladies.start();
                }

                if (position == 13) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.r);
                    ladies.start();
                }

                if (position == 14) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.s);
                    ladies.start();
                }

                if (position == 15) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.t);
                    ladies.start();
                }

                if (position == 16) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.v);
                    ladies.start();
                }

                if (position == 17) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.w);
                    ladies.start();
                }

                if (position == 18) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.x);
                    ladies.start();
                }

                if (position == 19) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.y);
                    ladies.start();
                }

                if (position == 20) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.z);
                    ladies.start();
                }
            }
        });
    }
}
