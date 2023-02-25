package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Mame on 4/16/2016.
 */
public class EngOneLessOne extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_one_less_one);
    }

    public void yesOneOne(View view)
    {
        switch (view.getId())
        {
            case R.id.on:
                Intent bs = new Intent(getApplicationContext(), EngOneLessOneAudio.class);
                startActivity(bs);
                break;
            case R.id.on1:
                Intent bs1 = new Intent(getApplicationContext(), EngOneLessOneVideo.class);
                startActivity(bs1);
                break;
            case R.id.on2:
                Intent bs2 = new Intent(getApplicationContext(), EngOneLessOnePicture.class);
                startActivity(bs2);
                break;
        }
    }
}
