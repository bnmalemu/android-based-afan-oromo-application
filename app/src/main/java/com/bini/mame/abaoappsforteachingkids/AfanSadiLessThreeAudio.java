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
public class AfanSadiLessThreeAudio extends AppCompatActivity
{
    private ListView gammee;
    private MediaPlayer dawite;
    private String gabaabaa[] = {"AANNAN", "ADDA", "BADDAA", "BALLAA", "BOWWAA", "CAACCUU", "CABBII", "DAMMA", "DHUKKEE", "GANNA",
                                "HARREE", "JABBII", "KENNAA", "MADDA", "MADDII", "ONNEE", "QACCEE", "QAWWEE", "YAABBII", "YABBUU"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_three_list_view_three);
        gammee = (ListView) findViewById(R.id.gi);
        gammee.setAdapter(new ArrayAdapter<>(this, R.layout.afan_three_single_row_three, R.id.di, gabaabaa));
        gammee.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    dawite = MediaPlayer.create(getApplicationContext(), R.raw.aannan);
                    dawite.start();
                }
                if (position == 1)
                {
                    dawite = MediaPlayer.create(getApplicationContext(), R.raw.adda);
                    dawite.start();
                }
                if (position == 2)
                {
                    dawite = MediaPlayer.create(getApplicationContext(), R.raw.baddaa);
                    dawite.start();
                }
                if (position == 3)
                {
                    dawite = MediaPlayer.create(getApplicationContext(), R.raw.ballaa);
                    dawite.start();
                }
                if (position == 4)
                {
                    dawite = MediaPlayer.create(getApplicationContext(), R.raw.bowwaa);
                    dawite.start();
                }
                if (position == 5)
                {
                    dawite = MediaPlayer.create(getApplicationContext(), R.raw.caaccuu);
                    dawite.start();
                }
                if (position == 6)
                {
                    dawite = MediaPlayer.create(getApplicationContext(), R.raw.cabbii);
                    dawite.start();
                }
                if (position == 7)
                {
                    dawite = MediaPlayer.create(getApplicationContext(), R.raw.damma);
                    dawite.start();
                }
                if (position == 8)
                {
                    dawite = MediaPlayer.create(getApplicationContext(), R.raw.dhukkee);
                    dawite.start();
                }
                if (position == 9)
                {
                    dawite = MediaPlayer.create(getApplicationContext(), R.raw.ganna);
                    dawite.start();
                }
                if (position == 10)
                {
                    dawite = MediaPlayer.create(getApplicationContext(), R.raw.harree);
                    dawite.start();
                }
                if (position == 11)
                {
                    dawite = MediaPlayer.create(getApplicationContext(), R.raw.jabbii);
                    dawite.start();
                }
                if (position == 12)
                {
                    dawite = MediaPlayer.create(getApplicationContext(), R.raw.kennaa);
                    dawite.start();
                }
                if (position == 13)
                {
                    dawite = MediaPlayer.create(getApplicationContext(), R.raw.madda);
                    dawite.start();
                }
                if (position == 14)
                {
                    dawite = MediaPlayer.create(getApplicationContext(), R.raw.maddii);
                    dawite.start();
                }
                if (position == 15)
                {
                    dawite = MediaPlayer.create(getApplicationContext(), R.raw.onnee);
                    dawite.start();
                }
                if (position == 16)
                {
                    dawite = MediaPlayer.create(getApplicationContext(), R.raw.qaccee);
                    dawite.start();
                }
                if (position == 17)
                {
                    dawite = MediaPlayer.create(getApplicationContext(), R.raw.qawwee);
                    dawite.start();
                }
                if (position == 18)
                {
                    dawite = MediaPlayer.create(getApplicationContext(), R.raw.yaabbii);
                    dawite.start();
                }
                if (position == 19)
                {
                    dawite = MediaPlayer.create(getApplicationContext(), R.raw.yabbuu);
                    dawite.start();
                }
            }
        });
    }
}
