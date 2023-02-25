package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

import com.google.android.gms.tagmanager.TagManager;

/**
 * Created by Mame on 4/15/2016.
 */
public class MainTabActivity extends android.app.TabActivity
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
        TabHost.TabSpec tab4 = tabHost.newTabSpec("Abou us");

        // Set the Tab name and Activity
        // that will be opened when particular Tab will be selected

        tab1.setIndicator("BAKKA GALMEE");
        tab1.setContent(new Intent(this, Registered.class));
        tab1.getTag();

        tab2.setIndicator("KARAA SEENAN");
        tab2.setContent(new Intent(this, Loogiin.class));

        tab3.setIndicator("GARGAARSA");
        tab3.setContent(new Intent(this, Help.class));

        tab4.setIndicator("WAA'EE KEENYA");
        tab4.setContent(new Intent(this, AboutUs.class));

        /** Add the tabs  to the TabHost to display. */

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);
        tabHost.addTab(tab4);
    }

}
