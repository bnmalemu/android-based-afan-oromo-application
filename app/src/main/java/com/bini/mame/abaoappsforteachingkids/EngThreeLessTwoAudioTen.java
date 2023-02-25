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
public class EngThreeLessTwoAudioTen extends AppCompatActivity
{
    public Button mam1, dad1, mam2, dad2, mam3, dad3, mam4, dad4, mam5, dad5, mam6, dad6, mam7, dad7, mam8, dad8, mam9, dad9, mam10, dad10, mam11, dad11;
    public MediaPlayer patience;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_three_less_two_audio_ten);
        mam1 = (Button) findViewById(R.id.tad1);
        dad1 = (Button) findViewById(R.id.tad2);
        mam1 = (Button) findViewById(R.id.tad3);
        dad1 = (Button) findViewById(R.id.tad4);
        mam1 = (Button) findViewById(R.id.tad5);
        dad1 = (Button) findViewById(R.id.tad6);
        mam1 = (Button) findViewById(R.id.tad7);
        dad1 = (Button) findViewById(R.id.tad8);
        mam1 = (Button) findViewById(R.id.tad9);
        dad1 = (Button) findViewById(R.id.tad10);
        mam1 = (Button) findViewById(R.id.tad11);
        dad1 = (Button) findViewById(R.id.tad12);
        mam1 = (Button) findViewById(R.id.tad13);
        dad1 = (Button) findViewById(R.id.tad14);
        mam1 = (Button) findViewById(R.id.tad15);
        dad1 = (Button) findViewById(R.id.tad16);
        mam1 = (Button) findViewById(R.id.tad17);
        dad1 = (Button) findViewById(R.id.tad18);
        mam1 = (Button) findViewById(R.id.tad19);
        dad1 = (Button) findViewById(R.id.tad20);
        mam1 = (Button) findViewById(R.id.tad21);
        dad1 = (Button) findViewById(R.id.tad22);
    }
    public void numberTen(View ten)
    {
        switch (ten.getId())
        {
            case R.id.tad1:
                patience = MediaPlayer.create(this, R.raw.satokko);
                patience.start();
                break;
            case R.id.tad2:
                patience = MediaPlayer.create(this, R.raw.nineone);
                patience.start();
                break;
            case R.id.tad3:
                patience = MediaPlayer.create(this, R.raw.salama);
                patience.start();
                break;
            case R.id.tad4:
                patience = MediaPlayer.create(this, R.raw.ninetwo);
                patience.start();
                break;
            case R.id.tad5:
                patience = MediaPlayer.create(this, R.raw.sasadii);
                patience.start();
                break;
            case R.id.tad6:
                patience = MediaPlayer.create(this, R.raw.ninethree);
                patience.start();
                break;
            case R.id.tad7:
                patience = MediaPlayer.create(this, R.raw.saafur);
                patience.start();
                break;
            case R.id.tad8:
                patience = MediaPlayer.create(this, R.raw.ninefour);
                patience.start();
                break;
            case R.id.tad9:
                patience = MediaPlayer.create(this, R.raw.sashan);
                patience.start();
                break;
            case R.id.tad10:
                patience = MediaPlayer.create(this, R.raw.ninefive);
                patience.start();
                break;
            case R.id.tad11:
                patience = MediaPlayer.create(this, R.raw.sajaa);
                patience.start();
                break;
            case R.id.tad12:
                patience = MediaPlayer.create(this, R.raw.ninesix);
                patience.start();
                break;
            case R.id.tad13:
                patience = MediaPlayer.create(this, R.raw.satorba);
                patience.start();
                break;
            case R.id.tad14:
                patience = MediaPlayer.create(this, R.raw.nineseven);
                patience.start();
                break;
            case R.id.tad15:
                patience = MediaPlayer.create(this, R.raw.sasaddet);
                patience.start();
                break;
            case R.id.tad16:
                patience = MediaPlayer.create(this, R.raw.nineeight);
                patience.start();
                break;
            case R.id.tad17:
                patience = MediaPlayer.create(this, R.raw.sasagal);
                patience.start();
                break;
            case R.id.tad18:
                patience = MediaPlayer.create(this, R.raw.ninenin);
                patience.start();
                break;
            case R.id.tad19:
                patience = MediaPlayer.create(this, R.raw.dhibbatokko);
                patience.start();
                break;
            case R.id.tad20:
                patience = MediaPlayer.create(this, R.raw.hundred);
                patience.start();
                break;
            case R.id.tad21:
                Intent kesa = new Intent(getApplicationContext(), EngThreeLessTwoAudioNine.class);
                startActivity(kesa);
                break;
            case R.id.tad22:
                Intent kes = new Intent(getApplicationContext(), EngThreeLessTwoAudioTen.class);
                startActivity(kes);
                break;
        }
    }
}
