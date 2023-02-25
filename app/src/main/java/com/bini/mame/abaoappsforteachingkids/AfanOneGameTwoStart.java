package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Mame on 5/7/2016.
 */
public class AfanOneGameTwoStart extends AppCompatActivity
{
    private Button button1;
    private Button button2;
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_one_game_two);
        button1 = (Button) findViewById(R.id.merry1);
        button2 = (Button) findViewById(R.id.merry2);
        button3 = (Button) findViewById(R.id.merry3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(getApplicationContext(), AfanOneDragAndDropOne.class);
                startActivity(start);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent binko = new Intent(getApplicationContext(), AfanOneDragAndDropTwo.class);
                startActivity(binko);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent star = new Intent(getApplicationContext(), AfanOneDragAndDropThree.class);
                startActivity(star);
            }
        });
    }
}
