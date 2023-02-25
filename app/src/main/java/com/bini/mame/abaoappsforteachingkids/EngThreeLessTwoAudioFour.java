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
public class EngThreeLessTwoAudioFour extends AppCompatActivity
{
    public Button bn1, me1, bn2, me2, bn3, me3, bn4, me4, bn5, me5, bn6, me6, bn7, me7, bn8, me8, bn9, me9, bn10, me10, bn11, me11;
    public MediaPlayer mameko;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_three_less_two_audio_four);
        bn1 = (Button) findViewById(R.id.no1);
        me1 = (Button) findViewById(R.id.no2);
        bn2 = (Button) findViewById(R.id.no3);
        me2 = (Button) findViewById(R.id.no4);
        bn3 = (Button) findViewById(R.id.no5);
        me3 = (Button) findViewById(R.id.no6);
        bn4 = (Button) findViewById(R.id.no7);
        me4 = (Button) findViewById(R.id.no8);
        bn5 = (Button) findViewById(R.id.no9);
        me5 = (Button) findViewById(R.id.no10);
        bn6 = (Button) findViewById(R.id.no11);
        me6 = (Button) findViewById(R.id.no12);
        bn7 = (Button) findViewById(R.id.no13);
        me7 = (Button) findViewById(R.id.no14);
        bn8 = (Button) findViewById(R.id.no15);
        me8 = (Button) findViewById(R.id.no16);
        bn9 = (Button) findViewById(R.id.no17);
        me9 = (Button) findViewById(R.id.no18);
        bn10 = (Button) findViewById(R.id.no19);
        me10 = (Button) findViewById(R.id.no20);
        bn11 = (Button) findViewById(R.id.no21);
        me11 = (Button) findViewById(R.id.no22);
    }
    public void numberFour(View meti)
    {
        switch (meti.getId())
        {
            case R.id.no1:
                mameko = MediaPlayer.create(this, R.raw.sotokko);
                mameko.start();
                break;
            case R.id.no2:
                mameko = MediaPlayer.create(this, R.raw.threeone);
                mameko.start();
                break;
            case R.id.no3:
                mameko = MediaPlayer.create(this, R.raw.solama);
                mameko.start();
                break;
            case R.id.no4:
                mameko = MediaPlayer.create(this, R.raw.threetwo);
                mameko.start();
                break;
            case R.id.no5:
                mameko = MediaPlayer.create(this, R.raw.sosadii);
                mameko.start();
                break;
            case R.id.no6:
                mameko = MediaPlayer.create(this, R.raw.threethr);
                mameko.start();
                break;
            case R.id.no7:
                mameko = MediaPlayer.create(this, R.raw.soafur);
                mameko.start();
                break;
            case R.id.no8:
                mameko = MediaPlayer.create(this, R.raw.threefour);
                mameko.start();
                break;
            case R.id.no9:
                mameko = MediaPlayer.create(this, R.raw.soshan);
                mameko.start();
                break;
            case R.id.no10:
                mameko = MediaPlayer.create(this, R.raw.threefive);
                mameko.start();
                break;
            case R.id.no11:
                mameko = MediaPlayer.create(this, R.raw.sojaa);
                mameko.start();
                break;
            case R.id.no12:
                mameko = MediaPlayer.create(this, R.raw.threesix);
                mameko.start();
                break;
            case R.id.no13:
                mameko = MediaPlayer.create(this, R.raw.sotorba);
                mameko.start();
                break;
            case R.id.no14:
                mameko = MediaPlayer.create(this, R.raw.threeseven);
                mameko.start();
                break;
            case R.id.no15:
                mameko = MediaPlayer.create(this, R.raw.sosaddet);
                mameko.start();
                break;
            case R.id.no16:
                mameko = MediaPlayer.create(this, R.raw.threeeigh);
                mameko.start();
                break;
            case R.id.no17:
                mameko = MediaPlayer.create(this, R.raw.sosagal);
                mameko.start();
                break;
            case R.id.no18:
                mameko = MediaPlayer.create(this, R.raw.threenine);
                mameko.start();
                break;
            case R.id.no19:
                mameko = MediaPlayer.create(this, R.raw.afurtama);
                mameko.start();
                break;
            case R.id.no20:
                mameko = MediaPlayer.create(this, R.raw.fourty);
                mameko.start();
                break;
            case R.id.no21:
                Intent mthy = new Intent(getApplicationContext(), EngThreeLessTwoAudioThree.class);
                startActivity(mthy);
                break;
            case R.id.no22:
                Intent methy = new Intent(getApplicationContext(), EngThreeLessTwoAudioFive.class);
                startActivity(methy);
                break;
        }
    }
}
