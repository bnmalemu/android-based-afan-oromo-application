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
public class EngThreeLessTwoAudioEight extends AppCompatActivity
{
    public Button ke1, se1, ke2, se2, ke3, se3, ke4, se4, ke5, se5, ke6, se6, ke7, se7, ke8, se8, ke9, se9, ke10, se10, ke11, se11;
    public MediaPlayer kero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_three_less_two_audio_eight);
        ke1 = (Button) findViewById(R.id.dad1);
        se1 = (Button) findViewById(R.id.dad2);
        ke2 = (Button) findViewById(R.id.dad3);
        se2 = (Button) findViewById(R.id.dad4);
        ke3 = (Button) findViewById(R.id.dad5);
        se3 = (Button) findViewById(R.id.dad6);
        ke4 = (Button) findViewById(R.id.dad7);
        se4 = (Button) findViewById(R.id.dad8);
        ke5 = (Button) findViewById(R.id.dad9);
        se5 = (Button) findViewById(R.id.dad10);
        ke6 = (Button) findViewById(R.id.dad11);
        se6 = (Button) findViewById(R.id.dad12);
        ke7 = (Button) findViewById(R.id.dad13);
        se7 = (Button) findViewById(R.id.dad14);
        ke8 = (Button) findViewById(R.id.dad15);
        se8 = (Button) findViewById(R.id.dad16);
        ke9 = (Button) findViewById(R.id.dad17);
        se9 = (Button) findViewById(R.id.dad18);
        ke10 = (Button) findViewById(R.id.dad19);
        se10 = (Button) findViewById(R.id.dad20);
        ke11 = (Button) findViewById(R.id.dad21);
        se11 = (Button) findViewById(R.id.dad22);
    }
    public void numberEight(View dawite)
    {
        switch (dawite.getId())
        {
            case R.id.dad1:
                kero = MediaPlayer.create(this, R.raw.totokko);
                kero.start();
                break;
            case R.id.dad2:
                kero = MediaPlayer.create(this, R.raw.sevenone);
                kero.start();
                break;
            case R.id.dad3:
                kero = MediaPlayer.create(this, R.raw.tolama);
                kero.start();
                break;
            case R.id.dad4:
                kero = MediaPlayer.create(this, R.raw.seventwo);
                kero.start();
                break;
            case R.id.dad5:
                kero = MediaPlayer.create(this, R.raw.tosadii);
                kero.start();
                break;
            case R.id.dad6:
                kero = MediaPlayer.create(this, R.raw.seventhree);
                kero.start();
                break;
            case R.id.dad7:
                kero = MediaPlayer.create(this, R.raw.toafur);
                kero.start();
                break;
            case R.id.dad8:
                kero = MediaPlayer.create(this, R.raw.sevenfour);
                kero.start();
                break;
            case R.id.dad9:
                kero = MediaPlayer.create(this, R.raw.toshan);
                kero.start();
                break;
            case R.id.dad10:
                kero = MediaPlayer.create(this, R.raw.sevenfive);
                kero.start();
                break;
            case R.id.dad11:
                kero = MediaPlayer.create(this, R.raw.tojaa);
                kero.start();
                break;
            case R.id.dad12:
                kero = MediaPlayer.create(this, R.raw.sevensix);
                kero.start();
                break;
            case R.id.dad13:
                kero = MediaPlayer.create(this, R.raw.totorba);
                kero.start();
                break;
            case R.id.dad14:
                kero = MediaPlayer.create(this, R.raw.sevenseven);
                kero.start();
                break;
            case R.id.dad15:
                kero = MediaPlayer.create(this, R.raw.tosadet);
                kero.start();
                break;
            case R.id.dad16:
                kero = MediaPlayer.create(this, R.raw.seveneight);
                kero.start();
                break;
            case R.id.dad17:
                kero = MediaPlayer.create(this, R.raw.tosagal);
                kero.start();
                break;
            case R.id.dad18:
                kero = MediaPlayer.create(this, R.raw.sevennine);
                kero.start();
                break;
            case R.id.dad19:
                kero = MediaPlayer.create(this, R.raw.sadetama);
                kero.start();
                break;
            case R.id.dad20:
                kero = MediaPlayer.create(this, R.raw.eithty);
                kero.start();
                break;
            case R.id.dad21:
                Intent man = new Intent(getApplicationContext(), EngThreeLessTwoAudioSeven.class);
                startActivity(man);
                break;
            case R.id.dad22:
                Intent min = new Intent(getApplicationContext(), EngThreeLessTwoAudioNine.class);
                startActivity(min);
                break;
        }
    }
}
