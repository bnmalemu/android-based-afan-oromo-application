package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Mame on 6/15/2016.
 */
public class HerrThreeGameOne extends AppCompatActivity
{
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herr_three_game_one);
        button = (Button) findViewById(R.id.mety1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bnma = new Intent(getApplicationContext(), HerrThreeDragAndDropOne.class);
                startActivity(bnma);
            }
        });
    }

}
