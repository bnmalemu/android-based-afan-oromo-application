package com.bini.mame.abaoappsforteachingkids;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mame on 5/11/2016.
 */
public class AfanOneCorrectionTwo extends AppCompatActivity
{
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_one_test_two_correct);

        result = (TextView) findViewById(R.id.res12);
        StringBuffer buffer = new StringBuffer();
        buffer.append("DEEBII SIRRII = " + AfanOneTestTwo.correct +"\n\n");
        buffer.append("DEEBII DOGOGGORAA = " + AfanOneTestTwo.wrong +"\n\n");
        //buffer.append("QABXII GALMEESSITE = " + AfanOneTestTwo.marks + "\n\n");
        result.setText(buffer);
    }
}
