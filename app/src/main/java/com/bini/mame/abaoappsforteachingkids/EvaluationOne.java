package com.bini.mame.abaoappsforteachingkids;


import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Mame on 3/18/2016.
 */
public class EvaluationOne extends TabActivity
{
    public static String USERNAME3, PASSWORD3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_tab_host_activity);

        TabHost mam = (TabHost) findViewById(android.R.id.tabhost);
        TabHost.TabSpec dad = mam.newTabSpec("TAB 1FAA");
        TabHost.TabSpec bro = mam.newTabSpec("TAB 2FFAA");
        TabHost.TabSpec sis = mam.newTabSpec("TAB 3FFAA");

        dad.setIndicator("AFAAN OROMOO");
        dad.setContent(new Intent(this, AfanOneTest.class));
        USERNAME3 = MainChoiceOne.USERNAME2;
        PASSWORD3 = MainChoiceOne.PASSWORD2;
        bro.setIndicator("INGILIFFA");
        bro.setContent(new Intent(this, EngOneTest.class));
        USERNAME3 = MainChoiceOne.USERNAME2;
        PASSWORD3 = MainChoiceOne.PASSWORD2;
        sis.setIndicator("HERREGA");
        sis.setContent(new Intent(this, HerrOneTest.class));
        USERNAME3 = MainChoiceOne.USERNAME2;
        PASSWORD3 = MainChoiceOne.PASSWORD2;
        mam.addTab(dad);
        mam.addTab(bro);
        mam.addTab(sis);
    }
}
