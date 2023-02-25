package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Mame on 4/8/2016.
 */
public class HerrSadiLessTwo extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herr_kuta_sadi_bar_lama);
    }
    public void herregaLessTwo(View view)
    {
        switch (view.getId())
        {
            case R.id.bn7:
                Intent mam = new Intent(getApplicationContext(), HerrSadiLessTwoMultiply.class);
                startActivity(mam);
                break;
            case R.id.bn8:
                Intent nan = new Intent(getApplicationContext(), HerrSadiLessTwoDivision.class);
                startActivity(nan);
                break;
        }
    }
}
