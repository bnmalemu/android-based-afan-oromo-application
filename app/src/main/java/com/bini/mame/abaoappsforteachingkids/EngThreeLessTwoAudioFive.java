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
public class EngThreeLessTwoAudioFive extends AppCompatActivity
{
    public Button ga1, ro1, ga2, ro2, ga3, ro3, ga4, ro4, ga5, ro5, ga6, ro6, ga7, ro7, ga8, ro8, ga9, ro9, ga10, ro10, ga11, ro11;
    public MediaPlayer singer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_three_less_two_audio_five);
        ga1 = (Button) findViewById(R.id.bnm1);
        ro1 = (Button) findViewById(R.id.bnm2);
        ga2 = (Button) findViewById(R.id.bnm3);
        ro2 = (Button) findViewById(R.id.bnm4);
        ga3 = (Button) findViewById(R.id.bnm5);
        ro3 = (Button) findViewById(R.id.bnm6);
        ga4 = (Button) findViewById(R.id.bnm7);
        ro4 = (Button) findViewById(R.id.bnm8);
        ga5 = (Button) findViewById(R.id.bnm9);
        ro5 = (Button) findViewById(R.id.bnm10);
        ga6 = (Button) findViewById(R.id.bnm11);
        ro6 = (Button) findViewById(R.id.bnm12);
        ga7 = (Button) findViewById(R.id.bnm13);
        ro7 = (Button) findViewById(R.id.bnm14);
        ga8 = (Button) findViewById(R.id.bnm15);
        ro8 = (Button) findViewById(R.id.bnm16);
        ga9 = (Button) findViewById(R.id.bnm17);
        ro9 = (Button) findViewById(R.id.bnm18);
        ga10 = (Button) findViewById(R.id.bnm19);
        ro10 = (Button) findViewById(R.id.bnm20);
        ga11 = (Button) findViewById(R.id.bnm21);
        ro11 = (Button) findViewById(R.id.bnm22);
    }
    public void numberFive(View yes)
    {
        switch (yes.getId())
        {
            case R.id.bnm1:
                singer = MediaPlayer.create(this, R.raw.aftokko);
                singer.start();
                break;
            case R.id.bnm2:
                singer = MediaPlayer.create(this, R.raw.fourone);
                singer.start();
                break;
            case R.id.bnm3:
                singer = MediaPlayer.create(this, R.raw.aflama);
                singer.start();
                break;
            case R.id.bnm4:
                singer = MediaPlayer.create(this, R.raw.fourtwo);
                singer.start();
                break;
            case R.id.bnm5:
                singer = MediaPlayer.create(this, R.raw.afsadii);
                singer.start();
                break;
            case R.id.bnm6:
                singer = MediaPlayer.create(this, R.raw.fourthree);
                singer.start();
                break;
            case R.id.bnm7:
                singer = MediaPlayer.create(this, R.raw.afafur);
                singer.start();
                break;
            case R.id.bnm8:
                singer = MediaPlayer.create(this, R.raw.fourfour);
                singer.start();
                break;
            case R.id.bnm9:
                singer = MediaPlayer.create(this, R.raw.afshan);
                singer.start();
                break;
            case R.id.bnm10:
                singer = MediaPlayer.create(this, R.raw.fourfive);
                singer.start();
                break;
            case R.id.bnm11:
                singer = MediaPlayer.create(this, R.raw.afjaa);
                singer.start();
                break;
            case R.id.bnm12:
                singer = MediaPlayer.create(this, R.raw.foursix);
                singer.start();
                break;
            case R.id.bnm13:
                singer = MediaPlayer.create(this, R.raw.aftorba);
                singer.start();
                break;
            case R.id.bnm14:
                singer = MediaPlayer.create(this, R.raw.fourseven);
                singer.start();
                break;
            case R.id.bnm15:
                singer = MediaPlayer.create(this, R.raw.afsaddet);
                singer.start();
                break;
            case R.id.bnm16:
                singer = MediaPlayer.create(this, R.raw.foureigt);
                singer.start();
                break;
            case R.id.bnm17:
                singer = MediaPlayer.create(this, R.raw.afsagal);
                singer.start();
                break;
            case R.id.bnm18:
                singer = MediaPlayer.create(this, R.raw.fournine);
                singer.start();
                break;
            case R.id.bnm19:
                singer = MediaPlayer.create(this, R.raw.shantama);
                singer.start();
                break;
            case R.id.bnm20:
                singer = MediaPlayer.create(this, R.raw.fifty);
                singer.start();
                break;
            case R.id.bnm21:
                Intent just = new Intent(getApplicationContext(), EngThreeLessTwoAudioFour.class);
                startActivity(just);
                break;
            case R.id.bnm22:
                Intent jst = new Intent(getApplicationContext(), EngThreeLessTwoAudioSix.class);
                startActivity(jst);
                break;
        }
    }
}
