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
public class EngThreeLessTwoAudioThree extends AppCompatActivity
{
    public Button yes1, no1, yes2, no2, yes3, no3, yes4, no4, yes5, no5, yes6, no6, yes7, no7, yes8, no8, yes9, no9, yes10, no10, yes11, no11;
    public MediaPlayer saysomething;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_three_less_two_audio_three);
        yes1 = (Button) findViewById(R.id.butto1);
        no1 = (Button) findViewById(R.id.butto2);
        yes2 = (Button) findViewById(R.id.butto3);
        no2 = (Button) findViewById(R.id.butto4);
        yes3 = (Button) findViewById(R.id.butto5);
        no3 = (Button) findViewById(R.id.butto6);
        yes4 = (Button) findViewById(R.id.butto7);
        no4 = (Button) findViewById(R.id.butto8);
        yes5 = (Button) findViewById(R.id.butto9);
        no5 = (Button) findViewById(R.id.butto10);
        yes6 = (Button) findViewById(R.id.butto11);
        no6 = (Button) findViewById(R.id.butto12);
        yes7 = (Button) findViewById(R.id.butto13);
        no7 = (Button) findViewById(R.id.butto14);
        yes8 = (Button) findViewById(R.id.butto15);
        no8 = (Button) findViewById(R.id.butto16);
        yes9 = (Button) findViewById(R.id.butto17);
        no9 = (Button) findViewById(R.id.butto18);
        yes10 = (Button) findViewById(R.id.butto19);
        no10 = (Button) findViewById(R.id.butto20);
        yes11 = (Button) findViewById(R.id.butto21);
        no11 = (Button) findViewById(R.id.butto22);
    }
    public void numberThree(View bnman)
    {
        switch (bnman.getId())
        {
            case R.id.butto1:
                saysomething = MediaPlayer.create(this, R.raw.ditokko);
                saysomething.start();
                break;
            case R.id.butto2:
                saysomething = MediaPlayer.create(this, R.raw.twoone);
                saysomething.start();
                break;
            case R.id.butto3:
                saysomething = MediaPlayer.create(this, R.raw.dilama);
                saysomething.start();
                break;
            case R.id.butto4:
                saysomething = MediaPlayer.create(this, R.raw.twotwo);
                saysomething.start();
                break;
            case R.id.butto5:
                saysomething = MediaPlayer.create(this, R.raw.disadii);
                saysomething.start();
                break;
            case R.id.butto6:
                saysomething = MediaPlayer.create(this, R.raw.twothree);
                saysomething.start();
                break;
            case R.id.butto7:
                saysomething = MediaPlayer.create(this, R.raw.diafur);
                saysomething.start();
                break;
            case R.id.butto8:
                saysomething = MediaPlayer.create(this, R.raw.twofour);
                saysomething.start();
                break;
            case R.id.butto9:
                saysomething = MediaPlayer.create(this, R.raw.dishan);
                saysomething.start();
                break;
            case R.id.butto10:
                saysomething = MediaPlayer.create(this, R.raw.twofive);
                saysomething.start();
                break;
            case R.id.butto11:
                saysomething = MediaPlayer.create(this, R.raw.dijaa);
                saysomething.start();
                break;
            case R.id.butto12:
                saysomething = MediaPlayer.create(this, R.raw.twosix);
                saysomething.start();
                break;
            case R.id.butto13:
                saysomething = MediaPlayer.create(this, R.raw.ditorba);
                saysomething.start();
                break;
            case R.id.butto14:
                saysomething = MediaPlayer.create(this, R.raw.twosev);
                saysomething.start();
                break;
            case R.id.butto15:
                saysomething = MediaPlayer.create(this, R.raw.disadet);
                saysomething.start();
                break;
            case R.id.butto16:
                saysomething = MediaPlayer.create(this, R.raw.twoeight);
                saysomething.start();
                break;
            case R.id.butto17:
                saysomething = MediaPlayer.create(this, R.raw.disagal);
                saysomething.start();
                break;
            case R.id.butto18:
                saysomething = MediaPlayer.create(this, R.raw.twonine);
                saysomething.start();
                break;
            case R.id.butto19:
                saysomething = MediaPlayer.create(this, R.raw.sodoma);
                saysomething.start();
                break;
            case R.id.butto20:
                saysomething = MediaPlayer.create(this, R.raw.thirty);
                saysomething.start();
                break;
            case R.id.butto21:
                Intent meti = new Intent(getApplicationContext(), EngThreeLessTwoAudioTwo.class);
                startActivity(meti);
                break;
            case R.id.butto22:
                Intent met = new Intent(getApplicationContext(), EngThreeLessTwoAudioFour.class);
                startActivity(met);
                break;
        }
    }
}
