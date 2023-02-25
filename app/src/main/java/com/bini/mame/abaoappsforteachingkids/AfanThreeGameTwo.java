package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Mame on 6/15/2016.
 */
public class AfanThreeGameTwo extends AppCompatActivity
{
    private Button game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_three_game_two);
        game = (Button) findViewById(R.id.rab2);
        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent bnyam = new Intent(getApplicationContext(), AfanTwoDragAndDropOne.class);
                startActivity(bnyam);
            }
        });
    }
}
