package com.bini.mame.abaoappsforteachingkids;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Mame on 4/23/2016.
 */
public class EngThreeLessFourAudio extends AppCompatActivity
{
    public MediaPlayer calling;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_three_less_four_audio);
    }
    public void monthOfYear(View view)
    {
        switch (view.getId())
        {
            case R.id.bnym:
                calling = MediaPlayer.create(this, R.raw.ful);
                calling.start();
                break;
            case R.id.f2:
                calling = MediaPlayer.create(this, R.raw.sept);
                calling.start();
                break;
            case R.id.f3:
                calling = MediaPlayer.create(this, R.raw.onk);
                calling.start();
                break;
            case R.id.f4:
                calling = MediaPlayer.create(this, R.raw.okt);
                calling.start();
                break;
            case R.id.f5:
                calling = MediaPlayer.create(this, R.raw.sad);
                calling.start();
                break;
            case R.id.f6:
                calling = MediaPlayer.create(this, R.raw.nov);
                calling.start();
                break;
            case R.id.f7:
                calling = MediaPlayer.create(this, R.raw.mud);
                calling.start();
                break;
            case R.id.f8:
                calling = MediaPlayer.create(this, R.raw.dec);
                calling.start();
                break;
            case R.id.f9:
                calling = MediaPlayer.create(this, R.raw.amj);
                calling.start();
                break;
            case R.id.f10:
                calling = MediaPlayer.create(this, R.raw.jan);
                calling.start();
                break;
            case R.id.f11:
                calling = MediaPlayer.create(this, R.raw.gur);
                calling.start();
                break;
            case R.id.f12:
                calling = MediaPlayer.create(this, R.raw.feb);
                calling.start();
                break;
            case R.id.f13:
                calling = MediaPlayer.create(this, R.raw.bit);
                calling.start();
                break;
            case R.id.f14:
                calling = MediaPlayer.create(this, R.raw.mar);
                calling.start();
                break;
            case R.id.f15:
                calling = MediaPlayer.create(this, R.raw.ebl);
                calling.start();
                break;
            case R.id.f16:
                calling = MediaPlayer.create(this, R.raw.aprl);
                calling.start();
                break;
            case R.id.f17:
                calling = MediaPlayer.create(this, R.raw.cam);
                calling.start();
                break;
            case R.id.f18:
                calling = MediaPlayer.create(this, R.raw.may);
                calling.start();
                break;
            case R.id.f19:
                calling = MediaPlayer.create(this, R.raw.wax);
                calling.start();
                break;
            case R.id.f20:
                calling = MediaPlayer.create(this, R.raw.jun);
                calling.start();
                break;
            case R.id.f21:
                calling = MediaPlayer.create(this, R.raw.adol);
                calling.start();
                break;
            case R.id.f22:
                calling = MediaPlayer.create(this, R.raw.jul);
                calling.start();
                break;
            case R.id.f23:
                calling = MediaPlayer.create(this, R.raw.hag);
                calling.start();
                break;
            case R.id.f24:
                calling = MediaPlayer.create(this, R.raw.aug);
                calling.start();
                break;
        }
    }
}
