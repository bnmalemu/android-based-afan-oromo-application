package com.bini.mame.abaoappsforteachingkids;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mame on 5/11/2016.
 */
public class HerrThreeCorrectionTwo extends AppCompatActivity
{
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herr_three_test_two_correct);

        result = (TextView) findViewById(R.id.we8);

        StringBuffer buffer = new StringBuffer();
        buffer.append("DEEBII SIRRII = " +     HerrThreeTestTwo.correct +"\n\n");
        buffer.append("DEEBII DOGOGGORAA = " + HerrThreeTestTwo.wrong +"\n\n");
        result.setText(buffer);
    }
}
