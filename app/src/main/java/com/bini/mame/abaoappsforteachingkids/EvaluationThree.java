package com.bini.mame.abaoappsforteachingkids;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Mame on 3/16/2016.
 */
public class EvaluationThree extends TabActivity
{
    public static String COMPUTER;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_tab_host_activity);

        TabHost bini = (TabHost) findViewById(android.R.id.tabhost);
        TabHost.TabSpec am = bini.newTabSpec("");
        TabHost.TabSpec stud = bini.newTabSpec("");
        TabHost.TabSpec cs = bini.newTabSpec("");

        am.setIndicator("AFAAN OROMOO");
        am.setContent(new Intent(this, AfanThreeTest.class));
        COMPUTER = MainChoiceThree.NAMING;

        stud.setIndicator("HERREGA");
        stud.setContent(new Intent(this, HerrThreeTest.class));
        COMPUTER = MainChoiceThree.NAMING;

        cs.setIndicator("INGILIFFA");
        cs.setContent(new Intent(this, EngThreeTest.class));
        COMPUTER = MainChoiceThree.NAMING;

        bini.addTab(am);
        bini.addTab(stud);
        bini.addTab(cs);
    }
}
