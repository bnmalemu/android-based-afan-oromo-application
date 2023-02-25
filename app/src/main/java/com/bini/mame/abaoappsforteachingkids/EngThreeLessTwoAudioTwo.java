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
public class EngThreeLessTwoAudioTwo extends AppCompatActivity
{
    public Button bnm1, alm1, bnm2, alm2, bnm3, alm3, bnm4, alm4, bnm5, alm5, bnm6, alm6, bnm7, alm7, bnm8, alm8, bnm9, alm9, bnm10, alm10, bnm11, alm11;
    public MediaPlayer yanet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_three_less_two_audio_two);
        bnm1 = (Button) findViewById(R.id.butt1);
        alm1 = (Button) findViewById(R.id.butt2);
        bnm2 = (Button) findViewById(R.id.butt3);
        alm2 = (Button) findViewById(R.id.butt4);
        bnm3 = (Button) findViewById(R.id.butt5);
        alm3 = (Button) findViewById(R.id.butt6);
        bnm4 = (Button) findViewById(R.id.butt7);
        alm4 = (Button) findViewById(R.id.butt8);
        bnm5 = (Button) findViewById(R.id.butt9);
        alm5 = (Button) findViewById(R.id.butt10);
        bnm6 = (Button) findViewById(R.id.butt11);
        alm6 = (Button) findViewById(R.id.butt12);
        bnm7 = (Button) findViewById(R.id.butt13);
        alm7 = (Button) findViewById(R.id.butt14);
        bnm8 = (Button) findViewById(R.id.butt15);
        alm8 = (Button) findViewById(R.id.butt16);
        bnm9 = (Button) findViewById(R.id.butt17);
        alm9 = (Button) findViewById(R.id.butt18);
        bnm10 = (Button) findViewById(R.id.butt19);
        alm10 = (Button) findViewById(R.id.butt20);
        bnm11 = (Button) findViewById(R.id.butt21);
        alm11 = (Button) findViewById(R.id.butt22);
    }
    public void numberTwo(View v)
    {
        switch (v.getId())
        {
            case R.id.butt1:
                yanet = MediaPlayer.create(this, R.raw.kutokko);
                yanet.start();
                break;
            case R.id.butt2:
                yanet = MediaPlayer.create(this, R.raw.eleven);
                yanet.start();
                break;
            case R.id.butt3:
                yanet = MediaPlayer.create(this, R.raw.kulama);
                yanet.start();
                break;
            case R.id.butt4:
                yanet = MediaPlayer.create(this, R.raw.twelve);
                yanet.start();
                break;
            case R.id.butt5:
                yanet = MediaPlayer.create(this, R.raw.kusadi);
                yanet.start();
                break;
            case R.id.butt6:
                yanet = MediaPlayer.create(this, R.raw.thirteen);
                yanet.start();
                break;
            case R.id.butt7:
                yanet = MediaPlayer.create(this, R.raw.kuafur);
                yanet.start();
                break;
            case R.id.butt8:
                yanet = MediaPlayer.create(this, R.raw.fourteen);
                yanet.start();
                break;
            case R.id.butt9:
                yanet = MediaPlayer.create(this, R.raw.kushan);
                yanet.start();
                break;
            case R.id.butt10:
                yanet = MediaPlayer.create(this, R.raw.fiften);
                yanet.start();
                break;
            case R.id.butt11:
                yanet = MediaPlayer.create(this, R.raw.kujaa);
                yanet.start();
                break;
            case R.id.butt12:
                yanet = MediaPlayer.create(this, R.raw.sixten);
                yanet.start();
                break;
            case R.id.butt13:
                yanet = MediaPlayer.create(this, R.raw.kutorba);
                yanet.start();
                break;
            case R.id.butt14:
                yanet = MediaPlayer.create(this, R.raw.seventeen);
                yanet.start();
                break;
            case R.id.butt15:
                yanet = MediaPlayer.create(this, R.raw.kusadet);
                yanet.start();
                break;
            case R.id.butt16:
                yanet = MediaPlayer.create(this, R.raw.eighten);
                yanet.start();
                break;
            case R.id.butt17:
                yanet = MediaPlayer.create(this, R.raw.kusagal);
                yanet.start();
                break;
            case R.id.butt18:
                yanet = MediaPlayer.create(this, R.raw.ninteen);
                yanet.start();
                break;
            case R.id.butt19:
                yanet = MediaPlayer.create(this, R.raw.didama);
                yanet.start();
                break;
            case R.id.butt20:
                yanet = MediaPlayer.create(this, R.raw.twenty);
                yanet.start();
                break;
            case R.id.butt21:
                Intent bm = new Intent(getApplicationContext(), EngThreeLessTwoAudioOne.class);
                startActivity(bm);
                break;
            case R.id.butt22:
                Intent bnam = new Intent(getApplicationContext(), EngThreeLessTwoAudioThree.class);
                startActivity(bnam);
                break;
        }
    }
}
