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
public class EngOneLessFourAudioTwo extends AppCompatActivity
{
    public MediaPlayer says;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_one_less_four_audio_two);
    }
    public void transTwo(View view)
    {
        switch (view.getId())
        {
            case R.id.y1:
                says = MediaPlayer.create(this, R.raw.j);
                says.start();
                break;
            case R.id.y2:
                says = MediaPlayer.create(this, R.raw.jj);
                says.start();
                break;
            case R.id.y3:
                says = MediaPlayer.create(this, R.raw.k);
                says.start();
                break;
            case R.id.y4:
                says = MediaPlayer.create(this, R.raw.kk);
                says.start();
                break;
            case R.id.y5:
                says = MediaPlayer.create(this, R.raw.l);
                says.start();
                break;
            case R.id.y6:
                says = MediaPlayer.create(this, R.raw.ll);
                says.start();
                break;
            case R.id.y7:
                says = MediaPlayer.create(this, R.raw.m);
                says.start();
                break;
            case R.id.y8:
                says = MediaPlayer.create(this, R.raw.mm);
                says.start();
                break;
            case R.id.y9:
                says = MediaPlayer.create(this, R.raw.n);
                says.start();
                break;
            case R.id.y10:
                says = MediaPlayer.create(this, R.raw.nn);
                says.start();
                break;
            case R.id.y11:
                says = MediaPlayer.create(this, R.raw.o);
                says.start();
                break;
            case R.id.y12:
                says = MediaPlayer.create(this, R.raw.oo);
                says.start();
                break;
            case R.id.y13:
                says = MediaPlayer.create(this, R.raw.pp);
                says.start();
                break;
            case R.id.y14:
                says = MediaPlayer.create(this, R.raw.p);
                says.start();
                break;
            case R.id.y15:
                says = MediaPlayer.create(this, R.raw.q);
                says.start();
                break;
            case R.id.y16:
                says = MediaPlayer.create(this, R.raw.qq);
                says.start();
                break;
            case R.id.y17:
                says = MediaPlayer.create(this, R.raw.r);
                says.start();
                break;
            case R.id.y18:
                says = MediaPlayer.create(this, R.raw.rr);
                says.start();
                break;
            case R.id.y23:
                Intent nx = new Intent(getApplicationContext(), EngOneLessFourAudioThree.class);
                startActivity(nx);
                break;
            case R.id.y24:
                Intent bc = new Intent(getApplicationContext(), EngOneLessFourAudioOne.class);
                startActivity(bc);
                break;
        }
    }
}
