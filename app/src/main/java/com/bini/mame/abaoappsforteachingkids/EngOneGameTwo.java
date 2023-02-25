package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Mame on 4/18/2016.
 */
public class EngOneGameTwo extends AppCompatActivity
{
    private Button game1, game2, game3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_one_game_two);
        game1 = (Button) findViewById(R.id.ea1);
        game2 = (Button) findViewById(R.id.ea2);
        game3 = (Button) findViewById(R.id.ea3);
        game1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gam1 = new Intent(getApplicationContext(), EngOneDragAndDropOne.class);
                startActivity(gam1);
            }
        });
        game2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gam2 = new Intent(getApplicationContext(), EngOneDragAndDropTwo.class);
                startActivity(gam2);
            }
        });
        game3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gam3 = new Intent(getApplicationContext(), EngOneDragAndDropThree.class);
                startActivity(gam3);
            }
        });

    }
}
