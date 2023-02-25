package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Mame on 4/23/2016.
 */
public class EngOneLessFourAudioThree extends AppCompatActivity
{
    public MediaPlayer saying;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_one_less_four_audio_three);
    }
    public void transThree(View view)
    {
        switch (view.getId())
        {
            case R.id.w1:
                saying = MediaPlayer.create(this, R.raw.s);
                saying.start();
                break;
            case R.id.w2:
                saying = MediaPlayer.create(this, R.raw.ss);
                saying.start();
                break;
            case R.id.w3:
                saying = MediaPlayer.create(this, R.raw.t);
                saying.start();
                break;
            case R.id.w4:
                saying = MediaPlayer.create(this, R.raw.tt);
                saying.start();
                break;
            case R.id.w5:
                saying = MediaPlayer.create(this, R.raw.u);
                saying.start();
                break;
            case R.id.w6:
                saying = MediaPlayer.create(this, R.raw.uu);
                saying.start();
                break;
            case R.id.w7:
                saying = MediaPlayer.create(this, R.raw.v);
                saying.start();
                break;
            case R.id.w8:
                saying = MediaPlayer.create(this, R.raw.vv);
                saying.start();
                break;
            case R.id.w9:
                saying = MediaPlayer.create(this, R.raw.w);
                saying.start();
                break;
            case R.id.w10:
                saying = MediaPlayer.create(this, R.raw.ww);
                saying.start();
                break;
            case R.id.w11:
                saying = MediaPlayer.create(this, R.raw.x);
                saying.start();
                break;
            case R.id.w12:
                saying = MediaPlayer.create(this, R.raw.xx);
                saying.start();
                break;
            case R.id.w13:
                saying = MediaPlayer.create(this, R.raw.yy);
                saying.start();
                break;
            case R.id.w14:
                saying = MediaPlayer.create(this, R.raw.y);
                saying.start();
                break;
            case R.id.w15:
                saying = MediaPlayer.create(this, R.raw.z);
                saying.start();
                break;
            case R.id.w16:
                saying = MediaPlayer.create(this, R.raw.zz);
                saying.start();
                break;
            case R.id.w23:
                Intent ntx = new Intent(getApplicationContext(), EngOneLessFourAudioThree.class);
                startActivity(ntx);
                break;
            case R.id.w24:
                Intent bk = new Intent(getApplicationContext(), EngOneLessFourAudioTwo.class);
                startActivity(bk);
                break;
        }
    }
}