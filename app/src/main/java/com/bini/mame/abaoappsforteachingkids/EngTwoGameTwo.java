package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Mame on 4/18/2016.
 */
public class EngTwoGameTwo extends AppCompatActivity
{
    private Button drag1, drag2, drag3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_two_game_two);
        drag1 = (Button) findViewById(R.id.gamm1);
        drag2 = (Button) findViewById(R.id.gamm2);
        drag3 = (Button) findViewById(R.id.gamm3);
        drag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mam1 = new Intent(getApplicationContext(), EngTwoDragAndDropOne.class);
                startActivity(mam1);
            }
        });
        drag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mam2 = new Intent(getApplicationContext(), EngOneDragAndDropTwo.class);
                startActivity(mam2);
            }
        });
        drag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mam3 = new Intent(getApplicationContext(), EngOneDragAndDropThree.class);
                startActivity(mam3);
            }
        });
    }
}
