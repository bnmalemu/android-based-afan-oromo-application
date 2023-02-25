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
public class AfanOneTestThree extends AppCompatActivity
{
    private Button ques;
    private RadioGroup group;
    private RadioButton rba, rbb, rbc;
    private Button next;
    private final int[] question = {R.raw.b, R.raw.i, R.raw.n, R.raw.y, R.raw.a, R.raw.m, R.raw.e, R.raw.t, R.raw.k, R.raw.o, R.raw.w,
            R.raw.c, R.raw.f, R.raw.j, R.raw.l, R.raw.p, R.raw.r, R.raw.q, R.raw.s, R.raw.u, R.raw.x, R.raw.z, R.raw.g, R.raw.d, R.raw.h, R.raw.v};
    private String [] answer = {"B", "i", "N", "y", "A", "m", "E", "t", "K", "o", "W", "c", "F", "j", "L", "p", "R", "q", "S", "u", "X", "z", "G", "d", "H", "v",};
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
    public static String USERNAME7;
    private String MARKS;
    private String NAMES;
    private final Context cxt3 = this;

    //int index;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_one_ques_three);

        // variable initialization

        ques = (Button) findViewById(R.id.qus13);
        group = (RadioGroup) findViewById(R.id.rgb13);
        rba = (RadioButton) findViewById(R.id.rba13);
        rbb = (RadioButton) findViewById(R.id.rbb13);
        rbc = (RadioButton) findViewById(R.id.rbc13);
        next = (Button) findViewById(R.id.ntx13);

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
                    USERNAME7 = AfanOneTest.USERNAME4;
                    NAMES = USERNAME7;
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = new Date();
                    String DATE = dateFormat.format(date);
                    Log.d("MAQAA IS", "" +NAMES );
                    Log.d("QABXII IS", "" +correct );
                    Log.d("CURRENT DATE", "TODAY IS" +DATE);
                    MARKS = String.valueOf(correct);
                    AfanOneDatabaseThree biinii = new AfanOneDatabaseThree(cxt3);
                    biinii.savedTwo(biinii, NAMES, MARKS, DATE);
                    Toast.makeText(getApplicationContext(), "BAGA GAMMADDE HAALA GAARIIN QABXIIN KEE KUUFAMEERA", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if (list.size() >= question.length) {
                    Intent intent = new Intent(AfanOneTestThree.this, AfanOneCorrectionThree.class);
                    startActivity(intent);
                }
            }
        });
    }
}
