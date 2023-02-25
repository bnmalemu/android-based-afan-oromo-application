package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Mame on 3/18/2016.
 */
public class SongStyle extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sirba);
    }

    public void sirba(View view)
    {
        switch (view.getId())
        {
            case R.id.shaa:
                Intent ss = new Intent(SongStyle.this, SongShaw.class);
                startActivity(ss);
                break;
            case R.id.wgg:
                Intent wl = new Intent(SongStyle.this, SongWal.class);
                startActivity(wl);
                break;
            case R.id.jii:
                Intent jm = new Intent(SongStyle.this, SongJimma.class);
                startActivity(jm);
                break;
            case R.id.haa:
                Intent ha = new Intent(SongStyle.this, SongHarar.class);
                startActivity(ha);
                break;
            case R.id.baa:
                Intent ba = new Intent(SongStyle.this, SongBale.class);
                startActivity(ba);
                break;
            case R.id.boo:
                Intent bo = new Intent(SongStyle.this, SongBoran.class);
                startActivity(bo);
                break;
            case R.id.ass:
                Intent ars = new Intent(SongStyle.this, SongArsi.class);
                startActivity(ars);
                break;
            case R.id.guu:
                Intent gu = new Intent(SongStyle.this, SongGuji.class);
                startActivity(gu);
                break;
            case R.id.abbb:
                Intent ilu = new Intent(SongStyle.this, SongIlu.class);
                startActivity(ilu);
                break;
            case R.id.kaa:
                Intent ka = new Intent(SongStyle.this, SongKami.class);
                startActivity(ka);
                break;
        }
    }
}
