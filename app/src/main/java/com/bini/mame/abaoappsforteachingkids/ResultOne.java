package com.bini.mame.abaoappsforteachingkids;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Mame on 3/16/2016.
 */
public class ResultOne extends TabActivity
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
        TabHost.TabSpec tab3 = tabHost.newTabSpec("THIRD TAB");

        // Set the Tab name and Activity
        // that will be opened when particular Tab will be selected

        tab1.setIndicator("AFAAN OROMOO");
        tab1.setContent(new Intent(this, AfanOneResult.class));

        tab2.setIndicator("HERREGAA");
        tab2.setContent(new Intent(this, HerrOneResult.class));

        tab3.setIndicator("INGILIFFA");
        tab3.setContent(new Intent(this, EngOneResult.class));

        /** Add the tabs  to the TabHost to display. */

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);
    }
}
