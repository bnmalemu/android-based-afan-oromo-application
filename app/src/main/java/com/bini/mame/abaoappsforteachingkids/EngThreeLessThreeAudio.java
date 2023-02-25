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
public class EngThreeLessThreeAudio extends AppCompatActivity
{
    private ListView fulbana;
    private MediaPlayer abbush;
    private String months[] = {"SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "JANUARY", "FEBRUARY",
            "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_three_list_view_three);
        fulbana = (ListView) findViewById(R.id.qq);
        fulbana.setAdapter(new ArrayAdapter<>(this, R.layout.eng_three_single_row_three, R.id.does1, months));
        fulbana.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.sept);
                    abbush.start();
                }
                if (position == 1)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.okt);
                    abbush.start();
                }
                if (position == 2)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.nov);
                    abbush.start();
                }
                if (position == 3)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.dec);
                    abbush.start();
                }
                if (position == 4)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.jan);
                    abbush.start();
                }
                if (position == 5)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.feb);
                    abbush.start();
                }
                if (position == 6)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.mar);
                    abbush.start();
                }
                if (position == 7)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.aprl);
                    abbush.start();
                }
                if (position == 8)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.may);
                    abbush.start();
                }
                if (position == 9)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.jun);
                    abbush.start();
                }
                if (position == 10)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.jul);
                    abbush.start();
                }
                if (position == 11)
                {
                    abbush = MediaPlayer.create(getApplicationContext(), R.raw.aug);
                    abbush.start();
                }
            }
        });
    }
}
