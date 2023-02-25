package com.bini.mame.abaoappsforteachingkids;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mame on 6/13/2016.
 */
public class Help extends AppCompatActivity
{
    private String [] hlp = {"hhhhhhhhhhhhhhhhhhhhhhhhhhhhh"};
    private TextView helps;
    private String why;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
    }
}
