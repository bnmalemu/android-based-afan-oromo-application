package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Mame on 4/18/2016.
 */
public class HerrTwoResult extends AppCompatActivity
{
    private Button result1, result2, result3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herr_two_result);
        result1 = (Button) findViewById(R.id.man4);
        result2 = (Button) findViewById(R.id.man5);
        result3 = (Button) findViewById(R.id.man6);
        result1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one = new Intent(getApplicationContext(), HerrTwoResultOne.class);
                startActivity(one);
            }
        });
        result2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one = new Intent(getApplicationContext(), HerrTwoResultTwo.class);
                startActivity(one);
            }
        });
        result3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one = new Intent(getApplicationContext(), HerrTwoResultThree.class);
                startActivity(one);
            }
        });
    }
}
