package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Mame on 3/18/2016.
 */
public class EatStyle extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nyaata);
    }

    public void eatingWay(View v)
    {
        switch (v.getId())
        {
            case R.id.nysh:
                Intent sh = new Intent(EatStyle.this, ShawaEat.class);
                startActivity(sh);
                break;
            case R.id.nywl:
                Intent wa = new Intent(EatStyle.this, WallEat.class);
                startActivity(wa);
                break;
            case R.id.nyjm:
                Intent jm = new Intent(EatStyle.this, JimmaEat.class);
                startActivity(jm);
                break;
            case R.id.nyhr:
                Intent hr = new Intent(EatStyle.this, HararEat.class);
                startActivity(hr);
                break;
            case R.id.nybl:
                Intent ba = new Intent(EatStyle.this, BaleEat.class);
                startActivity(ba);
                break;
            case R.id.nybr:
                Intent bo = new Intent(EatStyle.this, BoranaEat.class);
                startActivity(bo);
                break;
            case R.id.nyar:
                Intent ar = new Intent(EatStyle.this, ArsiEat.class);
                startActivity(ar);
                break;
            case R.id.nyab:
                Intent ab = new Intent(EatStyle.this, IluEat.class);
                startActivity(ab);
                break;
        }
    }
}
