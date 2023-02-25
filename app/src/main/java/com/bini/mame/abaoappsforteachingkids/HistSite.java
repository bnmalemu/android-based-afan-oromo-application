package com.bini.mame.abaoappsforteachingkids;


import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Mame on 3/18/2016.
 */
public class HistSite extends TabActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_tab_host_activity);

        // create the TabHost that will contain the Tabs


        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);

        TabHost.TabSpec tab1 = tabHost.newTabSpec("FIRST TAB");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("SECOND TAB");
        TabHost.TabSpec tab3 = tabHost.newTabSpec("THIRD TAB TAB");
        TabHost.TabSpec tab4 = tabHost.newTabSpec("FOURTH TAB TAB");

        // Set the Tab name and Activity
        // that will be opened when particular Tab will be selected

        tab1.setIndicator("WALAGGA");
        tab1.setContent(new Intent(this, WoHistPict.class));

        tab2.setIndicator("BAALEE");
        tab2.setContent(new Intent(this, BaleHistPict.class));

        tab3.setIndicator("JIMMAA");
        tab3.setContent(new Intent(this, JimHistPict.class));

        tab4.setIndicator("HARAR");
        tab4.setContent(new Intent(this, HarHistPict.class));

        /** Add the tabs  to the TabHost to display. */

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);
        tabHost.addTab(tab4);
    }
}
