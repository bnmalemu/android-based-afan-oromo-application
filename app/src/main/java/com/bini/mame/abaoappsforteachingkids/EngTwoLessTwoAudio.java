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
public class EngTwoLessTwoAudio extends AppCompatActivity
{
    private ListView jaarsoo;
    private MediaPlayer ladies;
    private String [] dubbifamaa = new String[]{"B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_two_list_view_two);
        jaarsoo = (ListView) findViewById(R.id.tt);
        jaarsoo.setAdapter(new ArrayAdapter<>(this, R.layout.eng_two_single_row_two, R.id.qa, dubbifamaa));
        jaarsoo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.bb);
                    ladies.start();
                }

                if (position == 1) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.cc);
                    ladies.start();
                }

                if (position == 2) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.dd);
                    ladies.start();
                }

                if (position == 3) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.ff);
                    ladies.start();
                }

                if (position == 4) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.gg);
                    ladies.start();
                }

                if (position == 5) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.hh);
                    ladies.start();
                }

                if (position == 6) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.jj);
                    ladies.start();
                }

                if (position == 7) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.kk);
                    ladies.start();
                }

                if (position == 8) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.ll);
                    ladies.start();
                }

                if (position == 9) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.mm);
                    ladies.start();
                }

                if (position == 10) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.nn);
                    ladies.start();
                }

                if (position == 11) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.pp);
                    ladies.start();
                }

                if (position == 12) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.qq);
                    ladies.start();
                }

                if (position == 13) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.rr);
                    ladies.start();
                }

                if (position == 14) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.ss);
                    ladies.start();
                }

                if (position == 15) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.tt);
                    ladies.start();
                }

                if (position == 16) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.vv);
                    ladies.start();
                }

                if (position == 17) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.ww);
                    ladies.start();
                }

                if (position == 18) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.xx);
                    ladies.start();
                }

                if (position == 19) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.yy);
                    ladies.start();
                }

                if (position == 20) {
                    ladies = MediaPlayer.create(getApplicationContext(), R.raw.zz);
                    ladies.start();
                }
            }
        });
    }
}
