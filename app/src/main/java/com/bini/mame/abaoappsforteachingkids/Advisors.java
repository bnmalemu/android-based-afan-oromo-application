package com.bini.mame.abaoappsforteachingkids;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Mame on 6/15/2016.
 */
public class Advisors extends TabActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_tab_host_activity);

        TabHost tase1 = (TabHost) findViewById(android.R.id.tabhost);

        TabHost.TabSpec abc = tase1.newTabSpec("1st");
        TabHost.TabSpec def = tase1.newTabSpec("2nd");

        abc.setIndicator("GORSAA 1FFAA");
        abc.setContent(new Intent(this, Tafarry.class));

        def.setIndicator("GORSAA 2FFAA");
        def.setContent(new Intent(this, Gaashaaw.class));

        tase1.addTab(abc);
        tase1.addTab(def);
    }
}
