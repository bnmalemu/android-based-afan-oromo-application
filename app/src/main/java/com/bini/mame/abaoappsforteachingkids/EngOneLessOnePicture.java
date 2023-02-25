package com.bini.mame.abaoappsforteachingkids;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Mame on 4/16/2016.
 */
public class EngOneLessOnePicture extends AppCompatActivity {
    ViewPager viewPager;
    EngOnePicture adapterOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager_main);

        viewPager = (ViewPager) findViewById(R.id.vp1);
        adapterOne = new EngOnePicture(this);
        viewPager.setAdapter(adapterOne);

    }
}
