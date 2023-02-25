package com.bini.mame.abaoappsforteachingkids;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Mame on 5/11/2016.
 */
public class HerrTwoTest extends TabActivity
{
    public static String COME1;
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

        // Set the Tab name and Activity
        // that will be opened when particular Tab will be selected

        tab1.setIndicator("QORUMSA 1FFAA");
        tab1.setContent(new Intent(this, HerrTwoTestOne.class));
        COME1 = EvaluationTwo.LENSA1;

        tab2.setIndicator("QORUMSA 2FFAA");
        tab2.setContent(new Intent(this, HerrTwoTestTwo.class));
        COME1 = EvaluationTwo.LENSA1;

        tab3.setIndicator("QORUMSA 3FFAA");
        tab3.setContent(new Intent(this, HerrTwoTestThree.class));
        COME1 = EvaluationTwo.LENSA1;

        /** Add the tabs  to the TabHost to display. */

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);
    }
}
