package com.bini.mame.abaoappsforteachingkids;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Mame on 4/16/2016.
 */

public class EngTwoLessFourAudio extends AppCompatActivity
{
    public MediaPlayer faye;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_two_less_four_audio);
    }
    public void daysOfWeek(View view)
    {
        switch (view.getId())
        {
            case R.id.u1:
                faye = MediaPlayer.create(this, R.raw.wix);
                faye.start();
                break;
            case R.id.u2:
                faye = MediaPlayer.create(this, R.raw.mon);
                faye.start();
                break;
            case R.id.u3:
                faye = MediaPlayer.create(this, R.raw.kib);
                faye.start();
                break;
            case R.id.u4:
                faye = MediaPlayer.create(this, R.raw.tue);
                faye.start();
                break;
            case R.id.u5:
                faye = MediaPlayer.create(this, R.raw.rob);
                faye.start();
                break;
            case R.id.u6:
                faye = MediaPlayer.create(this, R.raw.wend);
                faye.start();
                break;
            case R.id.u7:
                faye = MediaPlayer.create(this, R.raw.kam);
                faye.start();
                break;
            case R.id.u8:
                faye = MediaPlayer.create(this, R.raw.thur);
                faye.start();
                break;
            case R.id.u9:
                faye = MediaPlayer.create(this, R.raw.jim);
                faye.start();
                break;
            case R.id.u10:
                faye = MediaPlayer.create(this, R.raw.fri);
                faye.start();
                break;
            case R.id.u11:
                faye = MediaPlayer.create(this, R.raw.sanb);
                faye.start();
                break;
            case R.id.u12:
                faye = MediaPlayer.create(this, R.raw.sat);
                faye.start();
                break;
            case R.id.u13:
                faye = MediaPlayer.create(this, R.raw.sun);
                faye.start();
                break;
            case R.id.u14:
                faye = MediaPlayer.create(this, R.raw.dilb);
                faye.start();
                break;
        }
    }
}
