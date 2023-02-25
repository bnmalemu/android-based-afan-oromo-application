package com.bini.mame.abaoappsforteachingkids;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mame on 5/11/2016.
 */
public class HerrTwoCorrectionThree extends AppCompatActivity
{
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herr_two_test_three_correct);

        result = (TextView) findViewById(R.id.we6);

        StringBuffer buffer = new StringBuffer();
        buffer.append("DEEBII SIRRII = " +     HerrTwoTestThree.correct +"\n\n");
        buffer.append("DEEBII DOGOGGORAA = " + HerrTwoTestThree.wrong +"\n\n");
        result.setText(buffer);
    }
}
