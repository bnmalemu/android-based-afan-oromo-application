package com.bini.mame.abaoappsforteachingkids;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Mame on 3/16/2016.
 */
public class Oromia extends TabActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_tab_host_activity);

        // create the TabHost that will contain the Tabs


        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);

        TabHost.TabSpec tab1 = tabHost.newTabSpec("FIRST TAB");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("SECOND TAB");
        TabHost.TabSpec tab3 = tabHost.newTabSpec("THIRD TAB TAB");
        TabHost.TabSpec tab5 = tabHost.newTabSpec("FIFTH TAB");

        // Set the Tab name and Activity
        // that will be opened when particular Tab will be selected

        tab1.setIndicator("AADAA SIRBAA");
        tab1.setContent(new Intent(this, SongStyle.class));

        tab2.setIndicator("AADAA UFFATAA");
        tab2.setContent(new Intent(this, WearStyle.class));

        tab3.setIndicator("AADAA NYAATAA");
        tab3.setContent(new Intent(this, EatStyle.class));

        tab5.setIndicator("BAKKE SEENAA");
        tab5.setContent(new Intent(this, HistSite.class));

        /** Add the tabs  to the TabHost to display. */

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);
        tabHost.addTab(tab5);
    }
}
