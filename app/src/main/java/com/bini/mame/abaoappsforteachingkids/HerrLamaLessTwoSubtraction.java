package com.bini.mame.abaoappsforteachingkids;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Mame on 4/9/2016.
 */
public class HerrLamaLessTwoSubtraction extends AppCompatActivity
{
    private EditText first, second, third;
    private Button number1, number2, result, clear;
    private int num1, num2, num3;
    private MediaPlayer justin;
    private String numb1, numb2, numb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subtraction);
        first = (EditText) findViewById(R.id.subt1);
        second = (EditText) findViewById(R.id.subt2);
        third = (EditText) findViewById(R.id.subt3);
        number1 = (Button) findViewById(R.id.subt5);
        number2 = (Button) findViewById(R.id.subt6);
        result = (Button) findViewById(R.id.subt4);
        clear = (Button) findViewById(R.id.subt7);
        number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = (int) (Math.random() * 10);
                if (num1 == 0)
                {
                    justin = MediaPlayer.create(getApplicationContext(), R.raw.zero);
                    justin.start();
                }
                if (num1 == 1)
                {
                    justin = MediaPlayer.create(getApplicationContext(), R.raw.to);
                    justin.start();
                }
                if (num1 == 2)
                {
                    justin = MediaPlayer.create(getApplicationContext(), R.raw.lam);
                    justin.start();
                }
                if (num1 == 3)
                {
                    justin = MediaPlayer.create(getApplicationContext(), R.raw.sadii);
                    justin.start();
                }
                if (num1 == 4)
                {
                    justin = MediaPlayer.create(getApplicationContext(), R.raw.afur);
                    justin.start();
                }
                if (num1 == 5)
                {
                    justin = MediaPlayer.create(getApplicationContext(), R.raw.shan);
                    justin.start();
                }
                if (num1 == 6)
                {
                    justin = MediaPlayer.create(getApplicationContext(), R.raw.jaa);
                    justin.start();
                }
                if (num1 == 7)
                {
                    justin = MediaPlayer.create(getApplicationContext(), R.raw.torba);
                    justin.start();
                }
                if (num1 == 8)
                {
                    justin = MediaPlayer.create(getApplicationContext(), R.raw.sadet);
                    justin.start();
                }
                if (num1 == 9)
                {
                    justin = MediaPlayer.create(getApplicationContext(), R.raw.sagal);
                    justin.start();
                }
                if (num1 == 10)
                {
                    justin = MediaPlayer.create(getApplicationContext(), R.raw.kudhan);
                    justin.start();
                }
                Log.d("yes", "" + num1);
                numb1 = String.valueOf(num1);
                first.setText(numb1);
            }
        });
        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = (int) (Math.random() * 10);
                if (num2 == 0)
                {
                    justin = MediaPlayer.create(getApplicationContext(), R.raw.zero);
                    justin.start();
                }
                if (num2 == 1)
                {
                    justin = MediaPlayer.create(getApplicationContext(), R.raw.to);
                    justin.start();
                }
                if (num2 == 2)
                {
                    justin = MediaPlayer.create(getApplicationContext(), R.raw.lam);
                    justin.start();
                }
                if (num2 == 3)
                {
                    justin = MediaPlayer.create(getApplicationContext(), R.raw.sadii);
                    justin.start();
                }
                if (num2 == 4)
                {
                    justin = MediaPlayer.create(getApplicationContext(), R.raw.afur);
                    justin.start();
                }
                if (num2 == 5)
                {
                    justin = MediaPlayer.create(getApplicationContext(), R.raw.shan);
                    justin.start();
                }
                if (num2 == 6)
                {
                    justin = MediaPlayer.create(getApplicationContext(), R.raw.jaa);
                    justin.start();
                }
                if (num2 == 7)
                {
                    justin = MediaPlayer.create(getApplicationContext(), R.raw.torba);
                    justin.start();
                }
                if (num2 == 8)
                {
                    justin = MediaPlayer.create(getApplicationContext(), R.raw.sadet);
                    justin.start();
                }
                if (num2 == 9)
                {
                    justin = MediaPlayer.create(getApplicationContext(), R.raw.sagal);
                    justin.start();
                }
                if (num2 == 10)
                {
                    justin = MediaPlayer.create(getApplicationContext(), R.raw.kudhan);
                    justin.start();
                }
                Log.d("yes", ""+num2);
                numb2 = String.valueOf(num2);
                second.setText(numb2);
            }
        });
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1 < num2)
                {
                    justin = MediaPlayer.create(getApplicationContext(), R.raw.hin);
                    justin.start();
                    third.setText("XXXXX");
                }
                else {
                    num3 = num1 - num2;
                    if (num3 == 0)
                    {
                        justin = MediaPlayer.create(getApplicationContext(), R.raw.zero);
                        justin.start();
                    }
                    if (num3 == 1)
                    {
                        justin = MediaPlayer.create(getApplicationContext(), R.raw.to);
                        justin.start();
                    }
                    if (num3 == 2)
                    {
                        justin = MediaPlayer.create(getApplicationContext(), R.raw.lam);
                        justin.start();
                    }
                    if (num3 == 3)
                    {
                        justin = MediaPlayer.create(getApplicationContext(), R.raw.sadii);
                        justin.start();
                    }
                    if (num3 == 4)
                    {
                        justin = MediaPlayer.create(getApplicationContext(), R.raw.afur);
                        justin.start();
                    }
                    if (num3 == 5)
                    {
                        justin = MediaPlayer.create(getApplicationContext(), R.raw.shan);
                        justin.start();
                    }
                    if (num3 == 6)
                    {
                        justin = MediaPlayer.create(getApplicationContext(), R.raw.jaa);
                        justin.start();
                    }
                    if (num3 == 7)
                    {
                        justin = MediaPlayer.create(getApplicationContext(), R.raw.torba);
                        justin.start();
                    }
                    if (num3 == 8)
                    {
                        justin = MediaPlayer.create(getApplicationContext(), R.raw.sadet);
                        justin.start();
                    }
                    if (num3 == 9)
                    {
                        justin = MediaPlayer.create(getApplicationContext(), R.raw.sagal);
                        justin.start();
                    }
                    if (num3 == 10)
                    {
                        justin = MediaPlayer.create(getApplicationContext(), R.raw.kudhan);
                        justin.start();
                    }
                    Log.d("yes", ""+num3);
                    numb3 = String.valueOf(num3);
                    third.setText(numb3);
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setText("");
                second.setText("");
                third.setText("");
            }
        });
    }
}
