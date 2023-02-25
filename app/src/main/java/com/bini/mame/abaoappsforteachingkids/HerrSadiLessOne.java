package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Mame on 4/8/2016.
 */
public class HerrSadiLessOne extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herr_kuta_sadi_bar_toko);
    }
    public void herregaLessOne(View view)
    {
        switch (view.getId())
        {
            case R.id.bn4:
                Intent ma = new Intent(getApplicationContext(), HerrSadiLessOneAudio.class);
                startActivity(ma);
                break;
        }
    }
}
