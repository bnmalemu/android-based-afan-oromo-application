package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Mame on 4/8/2016.
 */
public class HerrLamaLessTwo extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herr_kuta_lama_bar_lama);
    }
    public void MathsLessTwo(View view)
    {
        switch (view.getId())
        {
            case R.id.ks2:
                Intent ma = new Intent(getApplicationContext(), HerrLamaLessTwoAddition.class);
                startActivity(ma);
                break;
            case R.id.kil2:
                Intent na = new Intent(getApplicationContext(), HerrLamaLessTwoSubtraction.class);
                startActivity(na);
                break;
        }
    }
}
