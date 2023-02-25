package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Mame on 4/16/2016.
 */
public class AfanTokoLessOne extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_oromo_one_les_one);
    }


    public void oneLessonOne(View view)
    {
        switch (view.getId())
        {
            case R.id.tts01:
                Intent tt1 = new Intent(getApplicationContext(), AfanTokoLessOneAudio.class);
                startActivity(tt1);
                break;
            case R.id.vid01:
                Intent vi1 = new Intent(getApplicationContext(), AfanTokoLessOneVideo.class);
                startActivity(vi1);
                break;
            case R.id.pic01:
                Intent pc1 = new Intent(getApplicationContext(), AfanTokoLessOnePicture.class);
                startActivity(pc1);
                break;
        }
    }
}
