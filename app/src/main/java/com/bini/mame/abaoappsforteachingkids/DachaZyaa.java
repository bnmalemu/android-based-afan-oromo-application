package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by Mame on 5/28/2016.
 */
public class DachaZyaa extends AppCompatActivity
{
    private ImageView waa;
    private MediaPlayer rihana;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dacha_seven);

        waa = (ImageView) findViewById(R.id.shal4);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.one_letter_anim_one);
        waa.setAnimation(animation);

        // implement listener to this animation activity

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                rihana = MediaPlayer.create(getApplicationContext(), R.raw.zy);
                rihana.start();
            }

            @Override
            public void onAnimationEnd(Animation animation) {

                finish();
                Intent intent = new Intent(getApplicationContext(), MainChoiceTwo.class);
                startActivity(intent);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}