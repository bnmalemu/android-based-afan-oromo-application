package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Mame on 4/18/2016.
 */
public class AfanTwoGameTwo extends AppCompatActivity
{
    private Button bni, best;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_two_game_two);
        bni = (Button) findViewById(R.id.hay);
        best = (Button) findViewById(R.id.tap4);
        bni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bnim = new Intent(getApplicationContext(), AfanTwoDragAndDropOne.class);
                startActivity(bnim);
            }
        });
        best.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yam = new Intent(getApplicationContext(), AfanTwoDragAndDropTwo.class);
                startActivity(yam);
            }
        });
    }
}
