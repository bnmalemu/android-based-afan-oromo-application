package com.bini.mame.abaoappsforteachingkids;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mame on 5/11/2016.
 */
public class EngThreeCorrectionOne extends AppCompatActivity
{
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_three_test_one_correct);
        result = (TextView) findViewById(R.id.ban1);
        StringBuffer buffer = new StringBuffer();
        buffer.append("QABXII ARGATTE = " + EngThreeTestOne.correct + "\n\n");
        buffer.append("DEEBII DOGOGGORAA = " + EngThreeTestOne.wrong + "\n\n");
        result.setText(buffer);
    }
}
