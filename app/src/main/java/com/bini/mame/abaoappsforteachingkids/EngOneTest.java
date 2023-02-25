package com.bini.mame.abaoappsforteachingkids;


import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Mame on 4/5/2016.
 */
public class EngOneTest extends TabActivity
{
    public static String MAQAA1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_tab_host_activity);

        // create tab host activity that contains the tabs

        TabHost bini = (TabHost) findViewById(android.R.id.tabhost);

        TabHost.TabSpec abc1 = bini.newTabSpec("TAB 1FFAA");
        TabHost.TabSpec abc2 = bini.newTabSpec("TAB 1FFAA");
        TabHost.TabSpec abc3 = bini.newTabSpec("TAB 1FFAA");

        abc1.setIndicator("QORMAATA 1FFAA");
        abc1.setContent(new Intent(this, EngOneTestOne.class));
        MAQAA1 = EvaluationOne.USERNAME3;

        abc2.setIndicator("QORMAATA 1FFAA");
        abc2.setContent(new Intent(this, EngOneTestTwo.class));
        MAQAA1 = EvaluationOne.USERNAME3;

        abc3.setIndicator("QORMAATA 1FFAA");
        abc3.setContent(new Intent(this, EngOneTestThree.class));
        MAQAA1 = EvaluationOne.USERNAME3;


        bini.addTab(abc1);
        bini.addTab(abc2);
        bini.addTab(abc3);

    }
}
