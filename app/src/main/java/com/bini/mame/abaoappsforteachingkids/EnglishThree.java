package com.bini.mame.abaoappsforteachingkids;


import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Mame on 4/8/2016.
 */
public class EnglishThree extends TabActivity
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
        TabHost.TabSpec tab4 = tabHost.newTabSpec("FOURTH TAB");

        // Set the Tab name and Activity
        // that will be opened when particular Tab will be selected

        tab1.setIndicator("1ST LESS");
        tab1.setContent(new Intent(this, EngThreeLessOneAudio.class));

        tab2.setIndicator("2ND LESS");
        tab2.setContent(new Intent(this, EngThreeLessTwoAudioOne.class));

        tab3.setIndicator("3ND LESS");
        tab3.setContent(new Intent(this, EngThreeLessThreeAudio.class));

        tab4.setIndicator("4ND LESS");
        tab4.setContent(new Intent(this, EngThreeLessFourAudio.class));

        /** Add the tabs  to the TabHost to display. */

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);
        tabHost.addTab(tab4);

    }
}
