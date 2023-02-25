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
 * Created by Mame on 4/5/2016.
 */
public class AfanOneTestOne extends AppCompatActivity
{

    private Button ques;
    private RadioGroup group;
    private RadioButton rba, rbb, rbc;
    private Button next;
    private final int[] question = {R.raw.b, R.raw.i, R.raw.n, R.raw.y, R.raw.a, R.raw.m, R.raw.e, R.raw.t, R.raw.k, R.raw.o, R.raw.w,
            R.raw.c, R.raw.f, R.raw.j, R.raw.l, R.raw.p, R.raw.r, R.raw.q, R.raw.s, R.raw.u, R.raw.x, R.raw.z, R.raw.g, R.raw.d, R.raw.h, R.raw.v};
    private String [] answer = {"B", "I", "N", "Y", "A", "M", "E", "T", "K", "O", "W", "C", "F", "J", "L", "P", "R", "Q", "S", "U", "X", "Z", "G", "D", "H", "V",};
    private String [][] option = {{"A", "C", "B"}, {"I", "J", "S"}, {"D", "N", "M"}, {"A", "Y", "B"}, {"A", "C", "B"}, {"M", "Z", "X"},
            {"R", "E", "G"}, {"T", "H", "U"}, {"S", "Q", "K"}, {"P", "O", "L"}, {"W", "O", "L"},
            {"A", "C", "B"}, {"I", "J", "F"}, {"J", "N", "M"}, {"A", "L", "B"}, {"M", "P", "X"},
            {"R", "E", "G"}, {"Q", "H", "U"}, {"S", "Q", "K"}, {"P", "U", "L"}, {"W", "O", "X"},
            {"Z", "E", "G"}, {"Q", "G", "U"}, {"S", "D", "K"}, {"H", "B", "L"}, {"W", "O", "V"}};
    private MediaPlayer mp;
    public static int correct, wrong;
    private int flag = 0;
    private HashMap list = new HashMap<Integer, String>();

    String ch[];
    String answ;
    public static String USERNAME5;
    private String MARKS;
    private String NAMES;
    private final Context cxt1 = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_one_ques_one);

        // variable initialization

        ques = (Button) findViewById(R.id.qus11);
        group = (RadioGroup) findViewById(R.id.rgb11);
        rba = (RadioButton) findViewById(R.id.rba11);
        rbb = (RadioButton) findViewById(R.id.rbb11);
        rbc = (RadioButton) findViewById(R.id.rbc11);
        next = (Button) findViewById(R.id.ntx11);

        flag = (int)Math.floor((Math.random() * 26));
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
                flag = (int) (Math.random() * 26);
                while(list.containsKey(flag)) {
                    flag = (int)Math.floor((Math.random() * 26));
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
                    USERNAME5 = AfanOneTest.USERNAME4;
                    NAMES = USERNAME5;
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = new Date();
                    String DATE = dateFormat.format(date);
                    Log.d("MAQAA IS", "" +NAMES );
                    Log.d("QABXII IS", "" +correct );
                    Log.d("CURRENT DATE", "TODAY IS" +DATE);
                    MARKS = String.valueOf(correct);
                    AfanOneDatabaseOne bini = new AfanOneDatabaseOne(cxt1);
                    bini.saved(bini, NAMES, MARKS, DATE);
                    Toast.makeText(getApplicationContext(), "BAGA GAMMADDE HAALA GAARIIN QABXIIN KEE KUUFAMEERA", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if (list.size() >= question.length) {
                    Intent intent = new Intent(AfanOneTestOne.this, AfanOneCorrectionOne.class);
                    startActivity(intent);
                }
            }
        });
    }
}
