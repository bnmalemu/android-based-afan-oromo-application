package com.bini.mame.abaoappsforteachingkids;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Mame on 5/11/2016.
 */
public class EngOneCorrectionThree extends AppCompatActivity
{
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_one_test_three_correct);
        result = (TextView) findViewById(R.id.opq3);
        StringBuffer buffer = new StringBuffer();
        buffer.append("QABXII ARGATTE = " + EngOneTestThree.correct + "\n\n");
        buffer.append("DEEBII DOGOGGORAA = " + EngOneTestThree.wrong + "\n\n");
        result.setText(buffer);
    }
}
