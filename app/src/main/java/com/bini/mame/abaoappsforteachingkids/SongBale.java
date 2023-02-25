package com.bini.mame.abaoappsforteachingkids;

import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 *
 */
public class SongBale extends AppCompatActivity
{

    ProgressDialog dialog;

    VideoView video;

    String VideoURL = "android.resource://com.bini.mame.abaoappsforteachingkids/"+R.raw.bale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sirba_bale);

        video = (VideoView) findViewById(R.id.bav);

        dialog = new ProgressDialog(SongBale.this);

        dialog.setTitle("VIIDIYOO DAAWWACHUUN");

        dialog.setMessage("BARBAADAA JIRA...");

        dialog.setCancelable(false);

        dialog.setIndeterminate(false);

        dialog.show();
        //video.start();

        try {

            MediaController controller = new MediaController(SongBale.this);

            Uri player = Uri.parse(VideoURL);

            controller.setAnchorView(video);

            video.setMediaController(controller);

            video.setVideoURI(player);


        } catch (Exception e) {

            Log.e("ERROR", e.getMessage());

            e.printStackTrace();

        }

        video.requestFocus();

        video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {

                dialog.dismiss();

                video.start();


            }
        });

    }
}
