package com.bini.mame.abaoappsforteachingkids;


import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Mame on 4/18/2016.
 */
public class AfanTwoGame extends TabActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_tab_host_activity);

        TabHost just = (TabHost) findViewById(android.R.id.tabhost);
        TabHost.TabSpec bnm1 = just.newTabSpec("");
        TabHost.TabSpec bnm2 = just.newTabSpec("");

        bnm1.setIndicator("TAPHA 1FFAA");
        bnm1.setContent(new Intent(this, AfanTwoGameOne.class));

        bnm2.setIndicator("TAPHA 2FFAA");
        bnm2.setContent(new Intent(this, AfanTwoGameTwo.class));

        just.addTab(bnm1);
        just.addTab(bnm2);
    }
}
