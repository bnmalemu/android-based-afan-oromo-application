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
public class EngThreeLessTwoAudioSeven extends AppCompatActivity
{
    public Button fa1, ha1, fa2,ha2, fa3, ha3, fa4, ha4, fa5, ha5, fa6,ha6, fa7, ha7, fa8, ha8, fa9, ha9, fa10,ha10, fa11, ha11;
    public MediaPlayer doit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_three_less_two_audio_seven);
        fa1 = (Button) findViewById(R.id.abd1);
        ha1 = (Button) findViewById(R.id.abd2);
        fa2 = (Button) findViewById(R.id.abd3);
        ha2 = (Button) findViewById(R.id.abd4);
        fa3 = (Button) findViewById(R.id.abd5);
        ha3 = (Button) findViewById(R.id.abd6);
        fa4 = (Button) findViewById(R.id.abd7);
        ha4 = (Button) findViewById(R.id.abd8);
        fa5 = (Button) findViewById(R.id.abd9);
        ha5 = (Button) findViewById(R.id.abd10);
        fa6 = (Button) findViewById(R.id.abd11);
        ha6 = (Button) findViewById(R.id.abd12);
        fa7 = (Button) findViewById(R.id.abd13);
        ha7 = (Button) findViewById(R.id.abd14);
        fa8 = (Button) findViewById(R.id.abd15);
        ha8 = (Button) findViewById(R.id.abd16);
        fa9 = (Button) findViewById(R.id.abd17);
        ha9 = (Button) findViewById(R.id.abd18);
        fa10 = (Button) findViewById(R.id.abd19);
        ha10 = (Button) findViewById(R.id.abd20);
        fa11 = (Button) findViewById(R.id.abd21);
        ha11 = (Button) findViewById(R.id.abd22);
    }
    public void numberSeven(View kgstd)
    {
        switch (kgstd.getId())
        {
            case R.id.abd1:
                doit = MediaPlayer.create(this, R.raw.jatokko);
                doit.start();
                break;
            case R.id.abd2:
                doit = MediaPlayer.create(this, R.raw.sixone);
                doit.start();
                break;
            case R.id.abd3:
                doit = MediaPlayer.create(this, R.raw.jalama);
                doit.start();
                break;
            case R.id.abd4:
                doit = MediaPlayer.create(this, R.raw.sixtwo);
                doit.start();
                break;
            case R.id.abd5:
                doit = MediaPlayer.create(this, R.raw.jasadii);
                doit.start();
                break;
            case R.id.abd6:
                doit = MediaPlayer.create(this, R.raw.sixthree);
                doit.start();
                break;
            case R.id.abd7:
                doit = MediaPlayer.create(this, R.raw.jaafur);
                doit.start();
                break;
            case R.id.abd8:
                doit = MediaPlayer.create(this, R.raw.sixfour);
                doit.start();
                break;
            case R.id.abd9:
                doit = MediaPlayer.create(this, R.raw.jashan);
                doit.start();
                break;
            case R.id.abd10:
                doit = MediaPlayer.create(this, R.raw.sixfive);
                doit.start();
                break;
            case R.id.abd11:
                doit = MediaPlayer.create(this, R.raw.jajaa);
                doit.start();
                break;
            case R.id.abd12:
                doit = MediaPlayer.create(this, R.raw.sixsix);
                doit.start();
                break;
            case R.id.abd13:
                doit = MediaPlayer.create(this, R.raw.jatorba);
                doit.start();
                break;
            case R.id.abd14:
                doit = MediaPlayer.create(this, R.raw.sixseven);
                doit.start();
                break;
            case R.id.abd15:
                doit = MediaPlayer.create(this, R.raw.jasaddet);
                doit.start();
                break;
            case R.id.abd16:
                doit = MediaPlayer.create(this, R.raw.sixeight);
                doit.start();
                break;
            case R.id.abd17:
                doit = MediaPlayer.create(this, R.raw.jasagal);
                doit.start();
                break;
            case R.id.abd18:
                doit = MediaPlayer.create(this, R.raw.sixnine);
                doit.start();
                break;
            case R.id.abd19:
                doit = MediaPlayer.create(this, R.raw.torbatama);
                doit.start();
                break;
            case R.id.abd20:
                doit = MediaPlayer.create(this, R.raw.seventy);
                doit.start();
                break;
            case R.id.abd21:
                Intent inst = new Intent(getApplicationContext(), EngThreeLessTwoAudioSix.class);
                startActivity(inst);
                break;
            case R.id.abd22:
                Intent it = new Intent(getApplicationContext(), EngThreeLessTwoAudioEight.class);
                startActivity(it);
                break;
        }
    }
}
