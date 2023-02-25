package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by Mame on 3/18/2016.
 */
public class WearStyle extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ufata);
    }

    public void ufata(View view)
    {
        switch (view.getId())
        {
            case R.id.shaw:
                Intent hh = new Intent(WearStyle.this, WearShaw.class);
                startActivity(hh);
                break;
            case R.id.wll:
                Intent wl = new Intent(WearStyle.this, WearWalla.class);
                startActivity(wl);
                break;
            case R.id.jmm:
                Intent jm = new Intent(WearStyle.this, WearJimma.class);
                startActivity(jm);
                break;
            case R.id.hrr:
                Intent hr = new Intent(WearStyle.this, WearHarar.class);
                startActivity(hr);
                break;
            case R.id.bll:
                Intent bl = new Intent(WearStyle.this, WearBale.class);
                startActivity(bl);
                break;
            case R.id.brr:
                Intent br = new Intent(WearStyle.this, WearBora.class);
                startActivity(br);
                break;
            case R.id.arr:
                Intent ars = new Intent(WearStyle.this, WearArsi.class);
                startActivity(ars);
                break;
            case R.id.gjj:
                Intent gj = new Intent(WearStyle.this, WearGuji.class);
                startActivity(gj);
                break;
            case R.id.kmm:
                Intent km = new Intent(WearStyle.this, WearKam.class);
                startActivity(km);
                break;
        }
    }

}
