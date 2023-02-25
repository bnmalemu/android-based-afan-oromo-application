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
public class VowelUuu extends AppCompatActivity
{
    private ImageView vee;
    private MediaPlayer rihana;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vowel_uu);

        vee = (ImageView) findViewById(R.id.vowu);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.one_letter_anim_one);
        vee.setAnimation(animation);

        // implement listener to this animation activity

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                rihana = MediaPlayer.create(getApplicationContext(), R.raw.uu);
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