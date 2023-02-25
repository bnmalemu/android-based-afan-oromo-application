package com.bini.mame.abaoappsforteachingkids;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mame on 5/11/2016.
 */
public class HerrOneCorrectionTwo extends AppCompatActivity
{
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herr_one_test_two_correct);

        result = (TextView) findViewById(R.id.we2);

        StringBuffer buffer = new StringBuffer();
        buffer.append("DEEBII SIRRII = " +     HerrOneTestTwo.correct +"\n\n");
        buffer.append("DEEBII DOGOGGORAA = " + HerrOneTestTwo.wrong +"\n\n");
        result.setText(buffer);
    }
}
