package com.bini.mame.abaoappsforteachingkids;


import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Mame on 3/18/2016.
 */
public class AfanOneTest extends TabActivity
{
    public static String USERNAME4, PASSWORD4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_tab_host_activity);

        TabHost bini = (TabHost) findViewById(android.R.id.tabhost);

        TabHost.TabSpec abc1 = bini.newTabSpec("TAB 1FFAA");
        TabHost.TabSpec abc2 = bini.newTabSpec("TAB 2FFAA");
        TabHost.TabSpec abc3 = bini.newTabSpec("TAB 3FFAA");

        abc1.setIndicator("QORMAATA 1FFAA");
        abc1.setContent(new Intent(this, AfanOneTestOne.class));
        USERNAME4 = EvaluationOne.USERNAME3;
        PASSWORD4 = EvaluationOne.PASSWORD3;
        abc2.setIndicator("QORMAATA 2FFAA");
        abc2.setContent(new Intent(this, AfanOneTestTwo.class));
        USERNAME4 = EvaluationOne.USERNAME3;
        PASSWORD4 = EvaluationOne.PASSWORD3;
        abc3.setIndicator("QORMAATA 3FFAA");
        abc3.setContent(new Intent(this, AfanOneTestThree.class));
        USERNAME4 = EvaluationOne.USERNAME3;
        PASSWORD4 = EvaluationOne.PASSWORD3;
        bini.addTab(abc1);
        bini.addTab(abc2);
        bini.addTab(abc3);

    }
}
