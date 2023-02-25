package com.bini.mame.abaoappsforteachingkids;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mame on 5/11/2016.
 */
public class EngTwoCorrectionThree extends AppCompatActivity
{
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_two_test_three_correct);
        result = (TextView) findViewById(R.id.bal3);
        StringBuffer buffer = new StringBuffer();
        buffer.append("QABXII ARGATTE = " + EngTwoTestThree.correct + "\n\n");
        buffer.append("DEEBII DOGOGGORAA = " + EngTwoTestThree.wrong + "\n\n");
        result.setText(buffer);
    }
}
