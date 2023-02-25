package com.bini.mame.abaoappsforteachingkids;


import android.app.*;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Mame on 4/15/2016.
 */
public class MainChoiceThree extends TabActivity
{
    public static String NAMING;
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
        TabHost.TabSpec tab5 = tabHost.newTabSpec("FIFTH TAB");

        // Set the Tab name and Activity
        // that will be opened when particular Tab will be selected

        tab1.setIndicator("BARNOOTA");
        tab1.setContent(new Intent(this, CourseThree.class));

        tab2.setIndicator("QORMAATA");
        tab2.setContent(new Intent(this, EvaluationThree.class));
        NAMING = Loogiin.USERNAME1;

        tab3.setIndicator("TAPHOOTA");
        tab3.setContent(new Intent(this, GameThree.class));

        tab4.setIndicator("OROMIYAA");
        tab4.setContent(new Intent(this, Oromia.class));

        tab5.setIndicator("QABXII");
        tab5.setContent(new Intent(this, ResultThree.class));

        /** Add the tabs  to the TabHost to display. */

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);
        tabHost.addTab(tab4);
        tabHost.addTab(tab5);

    }
}
