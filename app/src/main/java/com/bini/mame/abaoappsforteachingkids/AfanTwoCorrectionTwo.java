package com.bini.mame.abaoappsforteachingkids;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mame on 5/11/2016.
 */
public class AfanTwoCorrectionTwo extends AppCompatActivity
{
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_two_test_two_correct);
        result = (TextView) findViewById(R.id.dat2);
        StringBuffer buffer = new StringBuffer();
        buffer.append("QABXII ARGATTE = " + AfanTwoTestTwo.correct + "\n\n");
        buffer.append("DEEBII DOGOGGORAA = " + AfanTwoTestTwo.wrong + "\n\n");
        result.setText(buffer);
    }
}
