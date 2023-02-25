package com.bini.mame.abaoappsforteachingkids;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by Mame on 5/11/2016.
 */
public class AfanThreeTestOne extends AppCompatActivity
{
    private Button ques;
    private RadioGroup group;
    private RadioButton rba, rbb, rbc;
    private Button next;
    private final int[] question = {R.raw.aanaa, R.raw.baaduu, R.raw.deemuu, R.raw.diimaa, R.raw.caasaa, R.raw.jaamaa, R.raw.seenaa, R.raw.yaabuu, R.raw.reebuu, R.raw.laafaa, R.raw.hoolaa};
    private String [] answer = {"AANAA", "BAADUU", "DEEMUU", "DIIMAA", "CAASAA", "JAAMAA", "SEENAA", "YAABUU", "REEBUU", "LAAFAA", "HOOLAA"};
    private String [][] option = {{"ANA", "AANAA", "AANA"}, {"BADUU", "BAADU", "BAADUU"}, {"DEMU", "DEEMUU", "DEEMU"}, {"DIIMAA", "DIMA", "DIMAA"}, {"CASA", "CAASA", "CAASAA"},
            {"JAMA", "JAMAA", "JAAMAA"}, {"SEENAA", "SEENA", "SENA"}, {"YAABU", "YAABUU", "YABU"}, {"REEBUU", "REBU", "REEBU"}, {"LAFA", "LAAFAA", "LAFAA"}, {"HOLA", "HOOLA", "HOOLAA"}};
    private MediaPlayer mp;
    public static int correct, wrong, point, inexact;
    private int flag = 0;
    private HashMap list = new HashMap<Integer, String>();

    String ch[];
    String answ;
    public static String OBSANI1;
    private String MARKS;
    private String NAMES;
    private final Context cxt1 = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_three_ques_one);

        // variable initialization

        ques = (Button) findViewById(R.id.um1);
        group = (RadioGroup) findViewById(R.id.rgu1);
        rba = (RadioButton) findViewById(R.id.rua1);
        rbb = (RadioButton) findViewById(R.id.rub1);
        rbc = (RadioButton) findViewById(R.id.ruc1);
        next = (Button) findViewById(R.id.nut1);

        flag = (int)Math.floor((Math.random() * 11));
        list.put(flag, "");

        ch = option[flag];
        answ = answer[flag];
        Log.d("Index: ", "" + flag);

        ques.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(getApplicationContext(), question[flag]);
                mp.start();
            }
        });

        ques.setText(question[flag]);
        rba.setText(ch[0]);
        rbb.setText(ch[1]);
        rbc.setText(ch[2]);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton ans = (RadioButton) findViewById(group.getCheckedRadioButtonId());
                String deebii = ans.getText().toString();

                if (deebii.equalsIgnoreCase(answ)) {
                    correct++;
                }
                else{
                    wrong++;
                }
                flag = (int) (Math.random() * 11);
                while(list.containsKey(flag)) {
                    flag = (int)Math.floor((Math.random() * 11));
                }
                list.put(flag, "");

                ch = option[flag];
                answ = answer[flag];
                Log.d("Index: ", "" + flag);

                if (flag < question.length) {
                    ques.setText(question[flag]);
                    mp = MediaPlayer.create(getApplicationContext(), question[flag]);
                    mp.start();
                    rba.setText(ch[0]);
                    rbb.setText(ch[1]);
                    rbc.setText(ch[2]);
                }
                if (list.size() == question.length){
                    OBSANI1 = AfanThreeTest.KOOTI;
                    NAMES = OBSANI1;
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = new Date();
                    String DATE = dateFormat.format(date);
                    Log.d("MAQAA IS", "" +NAMES );
                    Log.d("QABXII IS", "" +correct );
                    Log.d("CURRENT DATE", "TODAY IS" +DATE);
                    MARKS = String.valueOf(correct);
                    AfanThreeDatabaseOne bini = new AfanThreeDatabaseOne(cxt1);
                    bini.saveAfan31(bini, NAMES, MARKS, DATE);
                    Toast.makeText(getApplicationContext(), "BAGA GAMMADDE HAALA GAARIIN QABXIIN KEE KUUFAMEERA", Toast.LENGTH_LONG).show();
                    finish();
                }
                if (list.size() >= question.length) {
                    Intent intent = new Intent(AfanThreeTestOne.this, AfanThreeCorrectionOne.class);
                    startActivity(intent);
                }
            }
        });
    }
}
