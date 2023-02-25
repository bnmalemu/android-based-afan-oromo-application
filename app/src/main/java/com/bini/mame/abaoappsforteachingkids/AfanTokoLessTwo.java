package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Mame on 4/16/2016.
 */
public class AfanTokoLessTwo extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_oromo_one_les_two);
    }

    public void oneLessonTwo(View v)
    {
        switch (v.getId())
        {
            case R.id.tts02:
                Intent tt2 = new Intent(getApplicationContext(), AfanTokoLessTwoAudio.class);
                startActivity(tt2);
                break;
            case R.id.vid02:
                Intent vi2 = new Intent(getApplicationContext(), AfanTokoLessTwoVideo.class);
                startActivity(vi2);
                break;
        }
    }
}
