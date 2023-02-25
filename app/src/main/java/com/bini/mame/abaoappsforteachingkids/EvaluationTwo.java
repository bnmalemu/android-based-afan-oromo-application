package com.bini.mame.abaoappsforteachingkids;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Mame on 3/16/2016.
 */
public class EvaluationTwo extends TabActivity
{
    public static String LENSA1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_tab_host_activity);

        TabHost mame = (TabHost) findViewById(android.R.id.tabhost);
        TabHost.TabSpec meti = mame.newTabSpec("");
        TabHost.TabSpec meqk = mame.newTabSpec("");
        TabHost.TabSpec gat = mame.newTabSpec("");

        meti.setIndicator("AFAAN OROMOO");
        meti.setContent(new Intent(this, AfanTwoTest.class));
        LENSA1 = MainChoiceTwo.LENSA;

        meqk.setIndicator("HERREGA");
        meqk.setContent(new Intent(this, HerrTwoTest.class));
        LENSA1 = MainChoiceTwo.LENSA;

        gat.setIndicator("INGILIFFA");
        gat.setContent(new Intent(this, EngTwoTest.class));
        LENSA1 = MainChoiceTwo.LENSA;

        mame.addTab(meti);
        mame.addTab(meqk);
        mame.addTab(gat);
    }
}
