package com.bini.mame.abaoappsforteachingkids;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mame on 5/11/2016.
 */
public class AfanTwoCorrectionThree extends AppCompatActivity
{
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_two_test_three_correct);
        result = (TextView) findViewById(R.id.dat3);
        StringBuffer buffer = new StringBuffer();
        buffer.append("QABXII ARGATTE = " + AfanTwoTestThree.correct + "\n\n");
        buffer.append("DEEBII DOGOGGORAA = " + AfanTwoTestThree.wrong + "\n\n");
        result.setText(buffer);
    }
}
