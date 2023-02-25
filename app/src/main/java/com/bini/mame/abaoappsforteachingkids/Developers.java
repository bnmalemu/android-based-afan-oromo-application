package com.bini.mame.abaoappsforteachingkids;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Mame on 6/15/2016.
 */
public class Developers extends TabActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_tab_host_activity);

        TabHost yesyes = (TabHost) findViewById(android.R.id.tabhost);
        TabHost.TabSpec nono1 = yesyes.newTabSpec("Biniam");
        TabHost.TabSpec nono2 = yesyes.newTabSpec("Robika");
        TabHost.TabSpec nono3 = yesyes.newTabSpec("Jarso");
        TabHost.TabSpec nono4 = yesyes.newTabSpec("Keria");

        nono1.setIndicator("BIINIYAAM");
        nono1.setContent(new Intent(this, Biniyam.class));

        nono2.setIndicator("ROOBIKAA");
        nono2.setContent(new Intent(this, Robika.class));

        nono3.setIndicator("JAARSOO");
        nono3.setContent(new Intent(this, Jarso.class));

        nono4.setIndicator("KEERIYAA");
        nono4.setContent(new Intent(this, Keria.class));

        yesyes.addTab(nono1);
        yesyes.addTab(nono2);
        yesyes.addTab(nono3);
        yesyes.addTab(nono4);
    }
}
