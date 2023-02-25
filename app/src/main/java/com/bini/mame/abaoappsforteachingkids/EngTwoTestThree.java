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
public class EngTwoTestThree extends AppCompatActivity
{
    private Button ques;
    private RadioGroup group;
    private RadioButton rba, rbb, rbc;
    private Button next;
    private final int[] question = {R.raw.aa, R.raw.ee, R.raw.ii, R.raw.oo, R.raw.uu, R.raw.bb, R.raw.cc, R.raw.dd, R.raw.ff,
            R.raw.gg, R.raw.hh, R.raw.jj, R.raw.kk, R.raw.ll, R.raw.mm, R.raw.nn, R.raw.pp, R.raw.qq, R.raw.rr, R.raw.ss,
            R.raw.tt, R.raw.vv, R.raw.ww, R.raw.xx, R.raw.yy, R.raw.zz};
    private String [] answer = {"A", "E", "I", "O", "U", "B", "C", "D", "F", "G", "H", "J", "K",
            "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"};
    private String [][] option = {{"A", "C", "B"}, {"E", "N", "M"}, {"I", "J", "S"}, {"D", "O", "M"},
            {"A", "Y", "U"}, {"A", "C", "B"},
            {"C", "R", "D"}, {"D", "F", "A"}, {"F", "E", "G"}, {"G", "D", "C"}, {"H", "I", "S"},
            {"R", "E", "J"}, {"T", "H", "K"}, {"S", "L", "K"}, {"P", "M", "L"}, {"W", "O", "N"},
            {"A", "C", "P"}, {"Q", "J", "R"}, {"R", "N", "M"}, {"A", "S", "T"}, {"M", "P", "T"},
            {"Z", "V", "G"}, {"Q", "W", "X"}, {"S", "X", "K"}, {"H", "Y", "L"}, {"Z", "O", "R"}};
    private MediaPlayer mp;
    public static int correct, wrong, point, inexact;
    private int flag = 0;
    private HashMap list = new HashMap<Integer, String>();

    String ch[];
    String answ;
    public static String DARO3;
    private String MARKS;
    private String NAMES;
    private final Context cxt3 = this;
    //int index;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_two_ques_three);

        // variable initialization

        ques = (Button) findViewById(R.id.bny13);
        group = (RadioGroup) findViewById(R.id.bnp13);
        rba = (RadioButton) findViewById(R.id.bna13);
        rbb = (RadioButton) findViewById(R.id.bnb13);
        rbc = (RadioButton) findViewById(R.id.bnc13);
        next = (Button) findViewById(R.id.bnn13);

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
                    DARO3 = EngTwoTest.DARO;
                    NAMES = DARO3;
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = new Date();
                    String DATE = dateFormat.format(date);
                    Log.d("MAQAA IS", "" +NAMES );
                    Log.d("QABXII IS", "" +correct );
                    Log.d("CURRENT DATE", "TODAY IS" +DATE);
                    MARKS = String.valueOf(correct);
                    EngTwoDatabaseThree biinii = new EngTwoDatabaseThree(cxt3);
                    biinii.saveEng23(biinii, NAMES, MARKS, DATE);
                    Toast.makeText(getApplicationContext(), "BAGA GAMMADDE HAALA GAARIIN QABXIIN KEE KUUFAMEERA", Toast.LENGTH_LONG).show();
                    finish();
                }
                if (list.size() >= question.length) {
                    Intent intent = new Intent(EngTwoTestThree.this, EngTwoCorrectionThree.class);
                    startActivity(intent);
                }
            }
        });
    }
}
