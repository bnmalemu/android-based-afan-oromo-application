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
public class EngThreeLessTwoAudioNine extends AppCompatActivity
{
    public Button ju1, cs1, ju2, cs2, ju3, cs3, ju4, cs4, ju5, cs5, ju6, cs6, ju7, cs7, ju8, cs8, ju9, cs9, ju10, cs10, ju11, cs11;
    public MediaPlayer lata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_three_less_two_audio_nine);
        ju1 = (Button) findViewById(R.id.zed1);
        cs1 = (Button) findViewById(R.id.zed2);
        ju2 = (Button) findViewById(R.id.zed3);
        cs2 = (Button) findViewById(R.id.zed4);
        ju3 = (Button) findViewById(R.id.zed5);
        cs3 = (Button) findViewById(R.id.zed6);
        ju4 = (Button) findViewById(R.id.zed7);
        cs4 = (Button) findViewById(R.id.zed8);
        ju5 = (Button) findViewById(R.id.zed9);
        cs5 = (Button) findViewById(R.id.zed10);
        ju6 = (Button) findViewById(R.id.zed11);
        cs6 = (Button) findViewById(R.id.zed12);
        ju7 = (Button) findViewById(R.id.zed13);
        cs7 = (Button) findViewById(R.id.zed14);
        ju8 = (Button) findViewById(R.id.zed15);
        cs8 = (Button) findViewById(R.id.zed16);
        ju9 = (Button) findViewById(R.id.zed17);
        cs9 = (Button) findViewById(R.id.zed18);
        ju10 = (Button) findViewById(R.id.zed19);
        cs10 = (Button) findViewById(R.id.zed20);
        ju11 = (Button) findViewById(R.id.zed21);
        cs11 = (Button) findViewById(R.id.zed22);
    }
    public void numberNine(View bko)
    {
        switch (bko.getId())
        {
            case R.id.zed1:
                lata = MediaPlayer.create(this, R.raw.sadtokko);
                lata.start();
                break;
            case R.id.zed2:
                lata = MediaPlayer.create(this, R.raw.eithtone);
                lata.start();
                break;
            case R.id.zed3:
                lata = MediaPlayer.create(this, R.raw.sadlama);
                lata.start();
                break;
            case R.id.zed4:
                lata = MediaPlayer.create(this, R.raw.eighttwo);
                lata.start();
                break;
            case R.id.zed5:
                lata = MediaPlayer.create(this, R.raw.sadsadii);
                lata.start();
                break;
            case R.id.zed6:
                lata = MediaPlayer.create(this, R.raw.eightthree);
                lata.start();
                break;
            case R.id.zed7:
                lata = MediaPlayer.create(this, R.raw.sadafur);
                lata.start();
                break;
            case R.id.zed8:
                lata = MediaPlayer.create(this, R.raw.eightfour);
                lata.start();
                break;
            case R.id.zed9:
                lata = MediaPlayer.create(this, R.raw.sadshan);
                lata.start();
                break;
            case R.id.zed10:
                lata = MediaPlayer.create(this, R.raw.eightfive);
                lata.start();
                break;
            case R.id.zed11:
                lata = MediaPlayer.create(this, R.raw.sadjaa);
                lata.start();
                break;
            case R.id.zed12:
                lata = MediaPlayer.create(this, R.raw.eightsix);
                lata.start();
                break;
            case R.id.zed13:
                lata = MediaPlayer.create(this, R.raw.sadtorba);
                lata.start();
                break;
            case R.id.zed14:
                lata = MediaPlayer.create(this, R.raw.eightseven);
                lata.start();
                break;
            case R.id.zed15:
                lata = MediaPlayer.create(this, R.raw.sadsaddet);
                lata.start();
                break;
            case R.id.zed16:
                lata = MediaPlayer.create(this, R.raw.eighteight);
                lata.start();
                break;
            case R.id.zed17:
                lata = MediaPlayer.create(this, R.raw.sadsagal);
                lata.start();
                break;
            case R.id.zed18:
                lata = MediaPlayer.create(this, R.raw.eightnine);
                lata.start();
                break;
            case R.id.zed19:
                lata = MediaPlayer.create(this, R.raw.sagaltama);
                lata.start();
                break;
            case R.id.zed20:
                lata = MediaPlayer.create(this, R.raw.ninty);
                lata.start();
                break;
            case R.id.zed21:
                Intent bnm = new Intent(getApplicationContext(), EngThreeLessTwoAudioEight.class);
                startActivity(bnm);
                break;
            case R.id.zed22:
                Intent bnma = new Intent(getApplicationContext(), EngThreeLessTwoAudioTen.class);
                startActivity(bnma);
                break;
        }
    }
}
