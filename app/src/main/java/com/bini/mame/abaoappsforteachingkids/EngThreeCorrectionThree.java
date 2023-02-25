package com.bini.mame.abaoappsforteachingkids;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mame on 5/11/2016.
 */
public class EngThreeCorrectionThree extends AppCompatActivity
{
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_three_test_three_correct);
        result = (TextView) findViewById(R.id.ban3);
        StringBuffer buffer = new StringBuffer();
        buffer.append("QABXII ARGATTE = " + EngThreeTestThree.correct + "\n\n");
        buffer.append("DEEBII DOGOGGORAA = " + EngThreeTestThree.wrong + "\n\n");
        result.setText(buffer);
    }
}
