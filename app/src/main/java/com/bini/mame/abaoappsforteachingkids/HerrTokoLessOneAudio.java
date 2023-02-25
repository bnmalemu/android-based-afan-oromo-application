package com.bini.mame.abaoappsforteachingkids;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Mame on 4/8/2016.
 */
public class HerrTokoLessOneAudio extends AppCompatActivity
{
    private String [] number = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50"};
    private ListView list;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herr_one_list_view_one);
        list = (ListView) findViewById(R.id.hl1);
        list.setAdapter(new ArrayAdapter<>(this, R.layout.herr_one_single_row_less_one, R.id.thl1, number));
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.to);
                    mediaPlayer.start();
                }

                if (position == 1) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.lam);
                    mediaPlayer.start();
                }

                if (position == 2) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.sadii);
                    mediaPlayer.start();
                }

                if (position == 3) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.afur);
                    mediaPlayer.start();
                }

                if (position == 4) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.shan);
                    mediaPlayer.start();
                }

                if (position == 5) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.jaa);
                    mediaPlayer.start();
                }

                if (position == 6) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.torba);
                    mediaPlayer.start();
                }

                if (position == 7) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.sadet);
                    mediaPlayer.start();
                }

                if (position == 8) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.sagal);
                    mediaPlayer.start();
                }

                if (position == 9) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.kudhan);
                    mediaPlayer.start();
                }

                if (position == 10) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.kutokko);
                    mediaPlayer.start();
                }

                if (position == 11) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.kulama);
                    mediaPlayer.start();
                }

                if (position == 12) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.kusadi);
                    mediaPlayer.start();
                }

                if (position == 13) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.kuafur);
                    mediaPlayer.start();
                }

                if (position == 14) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.kushan);
                    mediaPlayer.start();
                }

                if (position == 15) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.kujaa);
                    mediaPlayer.start();
                }

                if (position == 16) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.kutorba);
                    mediaPlayer.start();
                }

                if (position == 17) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.kusadet);
                    mediaPlayer.start();
                }

                if (position == 18) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.kusagal);
                    mediaPlayer.start();
                }

                if (position == 19) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.didama);
                    mediaPlayer.start();
                }

                if (position == 20) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.ditokko);
                    mediaPlayer.start();
                }

                if (position == 21) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.dilama);
                    mediaPlayer.start();
                }

                if (position == 22) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.disadii);
                    mediaPlayer.start();
                }

                if (position == 23) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.diafur);
                    mediaPlayer.start();
                }

                if (position == 24) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.dishan);
                    mediaPlayer.start();
                }

                if (position == 25) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.dijaa);
                    mediaPlayer.start();
                }

                if (position == 26) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.ditorba);
                    mediaPlayer.start();
                }

                if (position == 27) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.disadet);
                    mediaPlayer.start();
                }

                if (position == 28) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.disagal);
                    mediaPlayer.start();
                }

                if (position == 29) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.sodoma);
                    mediaPlayer.start();
                }

                if (position == 30) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.sotokko);
                    mediaPlayer.start();
                }

                if (position == 31) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.solama);
                    mediaPlayer.start();
                }

                if (position == 32) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.sosadii);
                    mediaPlayer.start();
                }

                if (position == 33) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.soafur);
                    mediaPlayer.start();
                }

                if (position == 34) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.soshan);
                    mediaPlayer.start();
                }

                if (position == 35) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.sojaa);
                    mediaPlayer.start();
                }

                if (position == 36) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.sotorba);
                    mediaPlayer.start();
                }

                if (position == 37) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.sosaddet);
                    mediaPlayer.start();
                }

                if (position == 38) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.sosagal);
                    mediaPlayer.start();
                }

                if (position == 39) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.afurtama);
                    mediaPlayer.start();
                }

                if (position == 40) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.aftokko);
                    mediaPlayer.start();
                }

                if (position == 41) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.aflama);
                    mediaPlayer.start();
                }

                if (position == 42) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.afsadii);
                    mediaPlayer.start();
                }

                if (position == 43) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.afafur);
                    mediaPlayer.start();
                }

                if (position == 44) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.afshan);
                    mediaPlayer.start();
                }

                if (position == 45) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.afjaa);
                    mediaPlayer.start();
                }

                if (position == 46) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.aftorba);
                    mediaPlayer.start();
                }

                if (position == 47) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.afsaddet);
                    mediaPlayer.start();
                }

                if (position == 48) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.afsagal);
                    mediaPlayer.start();
                }

                if (position == 49) {
                    mediaPlayer = MediaPlayer.create(HerrTokoLessOneAudio.this, R.raw.shantama);
                    mediaPlayer.start();
                }
            }
        });
    }
}
