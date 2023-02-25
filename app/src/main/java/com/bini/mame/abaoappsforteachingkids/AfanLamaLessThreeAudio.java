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
public class AfanLamaLessThreeAudio extends AppCompatActivity
{
    private ListView qonjee;
    private MediaPlayer beyonce;
    String qubeeDachaa[] = {"   CH ", "   DH ", "   NY ", "   PH ", "   SH ", "   TS ", "   ZY ",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_two_list_view_three);
        qonjee = (ListView) findViewById(R.id.ge);
        qonjee.setAdapter(new ArrayAdapter<>(this, R.layout.afan_two_single_row_less_three, R.id.de, qubeeDachaa));
        qonjee.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    beyonce = MediaPlayer.create(getApplicationContext(), R.raw.ch);
                    beyonce.start();
                }
                if (position == 1)
                {
                    beyonce = MediaPlayer.create(getApplicationContext(), R.raw.dh);
                    beyonce.start();
                }
                if (position == 2)
                {
                    beyonce = MediaPlayer.create(getApplicationContext(), R.raw.ny);
                    beyonce.start();
                }
                if (position == 3)
                {
                    beyonce = MediaPlayer.create(getApplicationContext(), R.raw.ph);
                    beyonce.start();
                }
                if (position == 4)
                {
                    beyonce = MediaPlayer.create(getApplicationContext(), R.raw.sh);
                    beyonce.start();
                }
                if (position == 5)
                {
                    beyonce = MediaPlayer.create(getApplicationContext(), R.raw.ts);
                    beyonce.start();
                }
                if (position == 6)
                {
                    beyonce = MediaPlayer.create(getApplicationContext(), R.raw.zy);
                    beyonce.start();
                }
            }
        });
    }
}
