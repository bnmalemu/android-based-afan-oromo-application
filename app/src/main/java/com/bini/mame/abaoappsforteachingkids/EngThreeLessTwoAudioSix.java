package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Mame on 4/24/2016.
 */
public class EngThreeLessTwoAudioSix extends AppCompatActivity
{
    public Button ja1, bo1, ja2, bo2, ja3, bo3, ja4, bo4, ja5, bo5, ja6, bo6, ja7, bo7, ja8, bo8, ja9, bo9, ja10, bo10, ja11, bo11;
    public MediaPlayer songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_three_less_two_audio_six);
        ja1 = (Button) findViewById(R.id.rob1);
        bo1 = (Button) findViewById(R.id.rob2);
        ja2 = (Button) findViewById(R.id.rob3);
        bo2 = (Button) findViewById(R.id.rob4);
        ja3 = (Button) findViewById(R.id.rob5);
        bo3 = (Button) findViewById(R.id.rob6);
        ja4 = (Button) findViewById(R.id.rob7);
        bo4 = (Button) findViewById(R.id.rob8);
        ja5 = (Button) findViewById(R.id.rob9);
        bo5 = (Button) findViewById(R.id.rob10);
        ja6 = (Button) findViewById(R.id.rob11);
        bo6 = (Button) findViewById(R.id.rob12);
        ja7 = (Button) findViewById(R.id.rob13);
        bo7 = (Button) findViewById(R.id.rob14);
        ja8 = (Button) findViewById(R.id.rob15);
        bo8 = (Button) findViewById(R.id.rob16);
        ja9 = (Button) findViewById(R.id.rob17);
        bo9 = (Button) findViewById(R.id.rob18);
        ja10 = (Button) findViewById(R.id.rob19);
        bo10 = (Button) findViewById(R.id.rob20);
        ja11 = (Button) findViewById(R.id.rob21);
        bo11 = (Button) findViewById(R.id.rob22);
    }
    public void numberSix(View haay)
    {
        switch (haay.getId())
        {
            case R.id.rob1:
                songs = MediaPlayer.create(this, R.raw.shatokko);
                songs.start();
                break;
            case R.id.rob2:
                songs = MediaPlayer.create(this, R.raw.fiveone);
                songs.start();
                break;
            case R.id.rob3:
                songs = MediaPlayer.create(this, R.raw.shalama);
                songs.start();
                break;
            case R.id.rob4:
                songs = MediaPlayer.create(this, R.raw.fivetwo);
                songs.start();
                break;
            case R.id.rob5:
                songs = MediaPlayer.create(this, R.raw.shasadii);
                songs.start();
                break;
            case R.id.rob6:
                songs = MediaPlayer.create(this, R.raw.fivethree);
                songs.start();
                break;
            case R.id.rob7:
                songs = MediaPlayer.create(this, R.raw.shaafur);
                songs.start();
                break;
            case R.id.rob8:
                songs = MediaPlayer.create(this, R.raw.fivefour);
                songs.start();
                break;
            case R.id.rob9:
                songs = MediaPlayer.create(this, R.raw.shashan);
                songs.start();
                break;
            case R.id.rob10:
                songs = MediaPlayer.create(this, R.raw.fivefive);
                songs.start();
                break;
            case R.id.rob11:
                songs = MediaPlayer.create(this, R.raw.shajaa);
                songs.start();
                break;
            case R.id.rob12:
                songs = MediaPlayer.create(this, R.raw.fivesix);
                songs.start();
                break;
            case R.id.rob13:
                songs = MediaPlayer.create(this, R.raw.shatorba);
                songs.start();
                break;
            case R.id.rob14:
                songs = MediaPlayer.create(this, R.raw.fiveseven);
                songs.start();
                break;
            case R.id.rob15:
                songs = MediaPlayer.create(this, R.raw.shasaddet);
                songs.start();
                break;
            case R.id.rob16:
                songs = MediaPlayer.create(this, R.raw.fiveeight);
                songs.start();
                break;
            case R.id.rob17:
                songs = MediaPlayer.create(this, R.raw.shasagal);
                songs.start();
                break;
            case R.id.rob18:
                songs = MediaPlayer.create(this, R.raw.fivenine);
                songs.start();
                break;
            case R.id.rob19:
                songs = MediaPlayer.create(this, R.raw.jatama);
                songs.start();
                break;
            case R.id.rob20:
                songs = MediaPlayer.create(this, R.raw.sixty);
                songs.start();
                break;
            case R.id.rob21:
                Intent had = new Intent(getApplicationContext(), EngThreeLessTwoAudioFive.class);
                startActivity(had);
                break;
            case R.id.rob22:
                Intent hadh = new Intent(getApplicationContext(), EngThreeLessTwoAudioSeven.class);
                startActivity(hadh);
                break;
        }
    }
}
