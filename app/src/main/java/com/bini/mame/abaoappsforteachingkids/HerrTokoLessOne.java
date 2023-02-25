package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Mame on 4/8/2016.
 */
public class HerrTokoLessOne extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herr_kuta_toko_bar_toko);
    }

    public void mamLessOne(View view)
    {
        switch (view.getId())
        {
            case R.id.bs1:
                Intent bs = new Intent(getApplicationContext(), HerrTokoLessOneAudio.class);
                startActivity(bs);
                break;
            case R.id.vil1:
                Intent vi1 = new Intent(getApplicationContext(), HerrTokoLessOneVideo.class);
                startActivity(vi1);
                break;
        }
    }
}
