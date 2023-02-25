package com.bini.mame.abaoappsforteachingkids;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mame on 5/11/2016.
 */
public class AfanThreeCorrectionThree extends AppCompatActivity
{
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_three_test_three_correct);
        result = (TextView) findViewById(R.id.gag3);
        StringBuffer buffer = new StringBuffer();
        buffer.append("QABXII ARGATTE = " + AfanThreeTestThree.correct + "\n\n");
        buffer.append("DEEBII DOGOGGORAA = " + AfanThreeTestThree.wrong + "\n\n");
        result.setText(buffer);
    }
}
