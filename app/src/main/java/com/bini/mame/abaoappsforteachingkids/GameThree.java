package com.bini.mame.abaoappsforteachingkids;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Mame on 3/16/2016.
 */
public class GameThree extends TabActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_tab_host_activity);
        TabHost fayisaa = (TabHost) findViewById(android.R.id.tabhost);

        TabHost.TabSpec fay1 = fayisaa.newTabSpec("TAB 1FFAA");
        TabHost.TabSpec fay2 = fayisaa.newTabSpec("TAB 2FFAA");
        TabHost.TabSpec fay3 = fayisaa.newTabSpec("TAB 3FFAA");


        fay1.setIndicator("AFAAN OROMOO");
        fay1.setContent(new Intent(this, AfanThreeGame.class));

        fay2.setIndicator("HERREGAA");
        fay2.setContent(new Intent(this, HerrThreeGame.class));

        fay3.setIndicator("INGILIFFAA");
        fay3.setContent(new Intent(this, EngThreeGame.class));


        fayisaa.addTab(fay1);
        fayisaa.addTab(fay2);
        fayisaa.addTab(fay3);
    }
}
