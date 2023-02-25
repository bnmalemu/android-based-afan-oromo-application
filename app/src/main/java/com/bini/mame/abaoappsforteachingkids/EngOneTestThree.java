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
public class EngOneTestThree extends AppCompatActivity
{
    private Button ques;
    private RadioGroup group;
    private RadioButton rba, rbb, rbc;
    private Button next;
    private final int[] question = {R.raw.bb, R.raw.ii, R.raw.nn, R.raw.yy, R.raw.aa, R.raw.mm, R.raw.ee, R.raw.tt, R.raw.kk, R.raw.oo, R.raw.ww,
            R.raw.cc, R.raw.ff, R.raw.jj, R.raw.ll, R.raw.pp, R.raw.rr, R.raw.qq, R.raw.ss, R.raw.uu, R.raw.xx, R.raw.zz, R.raw.gg, R.raw.dd, R.raw.hh, R.raw.vv};
    private String [] answer = {"B", "i", "N", "y", "A", "m", "E", "t", "K", "o", "W", "c", "F", "j", "L", "p", "R", "q", "S", "u", "X", "z", "G", "d", "H", "v"};
    private String [][] option = {{"A", "C", "B"}, {"i", "j", "s"}, {"D", "N", "M"}, {"a", "y", "b"}, {"A", "C", "B"}, {"m", "z", "x"},
            {"R", "E", "G"}, {"t", "h", "u"}, {"S", "Q", "K"}, {"p", "o", "l"}, {"W", "O", "L"},
            {"a", "c", "b"}, {"I", "J", "F"}, {"j", "n", "m"}, {"A", "L", "B"}, {"m", "p", "x"},
            {"R", "E", "G"}, {"q", "h", "u"}, {"S", "Q", "K"}, {"p", "u", "l"}, {"W", "O", "X"},
            {"z", "e", "g"}, {"Q", "G", "U"}, {"s", "d", "k"}, {"H", "B", "L"}, {"w", "o", "v"}};
    private MediaPlayer mp;
    public static int correct, wrong, point, inexact;
    private int flag = 0;
    private HashMap list = new HashMap<Integer, String>();

    String ch[];
    String answ;
    public static String MAQAA4;
    private String MARKS;
    private String NAMES;
    private final Context cxt3 = this;
    //int index;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_one_ques_three);

        // variable initialization

        ques = (Button) findViewById(R.id.qus23);
        group = (RadioGroup) findViewById(R.id.rgb23);
        rba = (RadioButton) findViewById(R.id.rba23);
        rbb = (RadioButton) findViewById(R.id.rbb23);
        rbc = (RadioButton) findViewById(R.id.rbc23);
        next = (Button) findViewById(R.id.ntx23);

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
                    MAQAA4 = EngOneTest.MAQAA1;
                    NAMES = MAQAA4;
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = new Date();
                    String DATE = dateFormat.format(date);
                    Log.d("MAQAA IS", "" +NAMES );
                    Log.d("QABXII IS", "" +correct );
                    Log.d("CURRENT DATE", "TODAY IS" +DATE);
                    MARKS = String.valueOf(correct);
                    EngOneDatabaseThree biinii = new EngOneDatabaseThree(cxt3);
                    biinii.saveEng(biinii, NAMES, MARKS,DATE);
                    Toast.makeText(getApplicationContext(), "BAGA GAMMADDE HAALA GAARIIN QABXIIN KEE KUUFAMEERA", Toast.LENGTH_LONG).show();
                    finish();
                }
                if (list.size() >= question.length) {
                    Intent intent = new Intent(EngOneTestThree.this, EngOneCorrectionThree.class);
                    startActivity(intent);
                }
            }
        });
    }
}
