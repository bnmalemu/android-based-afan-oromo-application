package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Mame on 4/18/2016.
 */
public class HerrOneGameTwo extends AppCompatActivity
{
    private Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herr_one_game_two);
        button1 = (Button) findViewById(R.id.ea15);
        button2 = (Button) findViewById(R.id.ea25);
        button3 = (Button) findViewById(R.id.ea35);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent adu1 = new Intent(getApplicationContext(), HerrOneDragAndDropOne.class);
                startActivity(adu1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent adu2 = new Intent(getApplicationContext(), HerrOneDragAndDropTwo.class);
                startActivity(adu2);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent adu3 = new Intent(getApplicationContext(), HerrOneDragAndDropThree.class);
                startActivity(adu3);
            }
        });
    }
}
