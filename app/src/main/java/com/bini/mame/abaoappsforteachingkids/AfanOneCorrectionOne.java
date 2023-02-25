package com.bini.mame.abaoappsforteachingkids;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mame on 4/6/2016.
 */
public class AfanOneCorrectionOne extends AppCompatActivity
{
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_one_test_one_correct);

        result = (TextView) findViewById(R.id.res11);
        StringBuffer buffer = new StringBuffer();
        buffer.append("QABXII ARGATTE = " + AfanOneTestOne.correct + "\n\n");
        buffer.append("DEEBII DOGOGGORAA = " + AfanOneTestOne.wrong + "\n\n");
        result.setText(buffer);
    }

}
