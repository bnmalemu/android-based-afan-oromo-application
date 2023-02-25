package com.bini.mame.abaoappsforteachingkids;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Mame on 6/15/2016.
 */
public class AboutUs extends TabActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_tab_host_activity);

        TabHost tasew = (TabHost) findViewById(android.R.id.tabhost);
        TabHost.TabSpec bin1 = tasew.newTabSpec("Advisors");
        TabHost.TabSpec bin2 = tasew.newTabSpec("Developers");

        bin1.setIndicator("GORSOOTA");
        bin1.setContent(new Intent(this, Advisors.class));

        bin2.setIndicator("BAR. HOJJETAN");
        bin2.setContent(new Intent(this, Developers.class));

        tasew.addTab(bin1);
        tasew.addTab(bin2);
    }
}
