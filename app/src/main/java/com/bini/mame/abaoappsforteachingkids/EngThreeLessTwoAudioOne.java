package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Mame on 4/16/2016.
 */
public class EngThreeLessTwoAudioOne extends AppCompatActivity
{
    private MediaPlayer jambo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_three_less_two_audio_one);
    }
    public void numberOne(View v)
    {
        switch (v.getId())
        {
            case R.id.button3:
                jambo = MediaPlayer.create(this, R.raw.to);
                jambo.start();
                break;
            case R.id.button4:
                jambo = MediaPlayer.create(this, R.raw.one);
                jambo.start();
                break;
            case R.id.button5:
                jambo = MediaPlayer.create(this, R.raw.lam);
                jambo.start();
                break;
            case R.id.button6:
                jambo = MediaPlayer.create(this, R.raw.two);
                jambo.start();
                break;
            case R.id.button7:
                jambo = MediaPlayer.create(this, R.raw.sadii);
                jambo.start();
                break;
            case R.id.button8:
                jambo = MediaPlayer.create(this, R.raw.three);
                jambo.start();
                break;
            case R.id.button9:
                jambo = MediaPlayer.create(this, R.raw.afur);
                jambo.start();
                break;
            case R.id.button10:
                jambo = MediaPlayer.create(this, R.raw.four);
                jambo.start();
                break;
            case R.id.button11:
                jambo = MediaPlayer.create(this, R.raw.shan);
                jambo.start();
                break;
            case R.id.button12:
                jambo = MediaPlayer.create(this, R.raw.five);
                jambo.start();
                break;
            case R.id.button13:
                jambo = MediaPlayer.create(this, R.raw.jaa);
                jambo.start();
                break;
            case R.id.button14:
                jambo = MediaPlayer.create(this, R.raw.six);
                jambo.start();
                break;
            case R.id.button15:
                jambo = MediaPlayer.create(this, R.raw.torba);
                jambo.start();
                break;
            case R.id.button16:
                jambo = MediaPlayer.create(this, R.raw.seven);
                jambo.start();
                break;
            case R.id.button17:
                jambo = MediaPlayer.create(this, R.raw.sadet);
                jambo.start();
                break;
            case R.id.button18:
                jambo = MediaPlayer.create(this, R.raw.eight);
                jambo.start();
                break;
            case R.id.button19:
                jambo = MediaPlayer.create(this, R.raw.sagal);
                jambo.start();
                break;
            case R.id.button20:
                jambo = MediaPlayer.create(this, R.raw.nine);
                jambo.start();
                break;
            case R.id.button21:
                jambo = MediaPlayer.create(this, R.raw.kudhan);
                jambo.start();
                break;
            case R.id.button22:
                jambo = MediaPlayer.create(this, R.raw.ten);
                jambo.start();
                break;
            case R.id.button23:
                Intent intent = new Intent(getApplicationContext(), MainChoiceThree.class);
                startActivity(intent);
                break;
            case R.id.button24:
                Intent next = new Intent(getApplicationContext(), EngThreeLessTwoAudioTwo.class);
                startActivity(next);
                break;
        }
    }
}
