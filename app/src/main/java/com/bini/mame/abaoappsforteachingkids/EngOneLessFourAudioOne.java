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
public class EngOneLessFourAudioOne extends AppCompatActivity
{
    public MediaPlayer say;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_one_less_four_audio_one);
    }
    public void transOne(View view)
    {
        switch (view.getId())
        {
            case R.id.x1:
                say = MediaPlayer.create(this, R.raw.a);
                say.start();
                break;
            case R.id.x2:
                say = MediaPlayer.create(this, R.raw.aa);
                say.start();
                break;
            case R.id.x3:
                say = MediaPlayer.create(this, R.raw.b);
                say.start();
                break;
            case R.id.x4:
                say = MediaPlayer.create(this, R.raw.bb);
                say.start();
                break;
            case R.id.x5:
                say = MediaPlayer.create(this, R.raw.c);
                say.start();
                break;
            case R.id.x6:
                say = MediaPlayer.create(this, R.raw.cc);
                say.start();
                break;
            case R.id.x7:
                say = MediaPlayer.create(this, R.raw.d);
                say.start();
                break;
            case R.id.x8:
                say = MediaPlayer.create(this, R.raw.dd);
                say.start();
                break;
            case R.id.x9:
                say = MediaPlayer.create(this, R.raw.e);
                say.start();
                break;
            case R.id.x10:
                say = MediaPlayer.create(this, R.raw.ee);
                say.start();
                break;
            case R.id.x11:
                say = MediaPlayer.create(this, R.raw.f);
                say.start();
                break;
            case R.id.x12:
                say = MediaPlayer.create(this, R.raw.ff);
                say.start();
                break;
            case R.id.x13:
                say = MediaPlayer.create(this, R.raw.gg);
                say.start();
                break;
            case R.id.x14:
                say = MediaPlayer.create(this, R.raw.g);
                say.start();
                break;
            case R.id.x15:
                say = MediaPlayer.create(this, R.raw.h);
                say.start();
                break;
            case R.id.x16:
                say = MediaPlayer.create(this, R.raw.hh);
                say.start();
                break;
            case R.id.x17:
                say = MediaPlayer.create(this, R.raw.i);
                say.start();
                break;
            case R.id.x18:
                say = MediaPlayer.create(this, R.raw.ii);
                say.start();
                break;
            case R.id.x23:
                Intent next = new Intent(getApplicationContext(), EngOneLessFourAudioTwo.class);
                startActivity(next);
                break;
            case R.id.x24:
                Intent back = new Intent(getApplicationContext(), MainChoiceOne.class);
                startActivity(back);
                break;
        }
    }
}
