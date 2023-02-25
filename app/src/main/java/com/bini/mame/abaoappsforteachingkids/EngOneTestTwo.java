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
public class EngOneTestTwo extends AppCompatActivity
{
    private Button ques;
    private RadioGroup group;
    private RadioButton rba, rbb, rbc;
    private Button next;
    private final int[] question = {R.raw.bb, R.raw.ii, R.raw.nn, R.raw.yy, R.raw.aa, R.raw.mm, R.raw.ee, R.raw.tt, R.raw.kk, R.raw.oo, R.raw.ww,
            R.raw.cc, R.raw.ff, R.raw.jj, R.raw.ll, R.raw.pp, R.raw.rr, R.raw.qq, R.raw.ss, R.raw.uu, R.raw.xx, R.raw.zz, R.raw.gg, R.raw.dd, R.raw.hh, R.raw.vv};
    private String [] answer = {"b", "i", "n", "y", "a", "m", "e", "t", "k", "o", "w", "c", "f", "j", "l", "p", "r", "q", "s", "u", "x", "z", "g", "d", "h", "v"};
    private String [][] option = {{"a", "c", "b"}, {"i", "j", "s"}, {"d", "n", "m"}, {"a", "y", "b"}, {"a", "c", "b"}, {"m", "z", "x"},
            {"r", "e", "g"}, {"t", "h", "u"}, {"s", "q", "k"}, {"p", "o", "l"}, {"w", "o", "l"},
            {"a", "c", "b"}, {"i", "j", "f"}, {"j", "n", "m"}, {"a", "l", "b"}, {"m", "p", "x"},
            {"r", "e", "g"}, {"q", "h", "u"}, {"s", "q", "k"}, {"p", "u", "l"}, {"w", "o", "x"},
            {"z", "e", "g"}, {"q", "g", "u"}, {"s", "d", "k"}, {"h", "c", "l"}, {"w", "o", "V"}};
    private MediaPlayer mp;
    public static int correct, wrong, point, inexact;
    private int flag = 0;
    private HashMap list = new HashMap<Integer, String>();

    String ch[];
    String answ;
    public static String MAQAA3;
    private String MARKS;
    private String NAMES;
    private final Context cxt2 = this;
    //int index;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_one_ques_two);

        // variable initialization

        ques = (Button) findViewById(R.id.qus22);
        group = (RadioGroup) findViewById(R.id.rgb22);
        rba = (RadioButton) findViewById(R.id.rba22);
        rbb = (RadioButton) findViewById(R.id.rbb22);
        rbc = (RadioButton) findViewById(R.id.rbc22);
        next = (Button) findViewById(R.id.ntx22);

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
                    MAQAA3 = EngOneTest.MAQAA1;
                    NAMES = MAQAA3;
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = new Date();
                    String DATE = dateFormat.format(date);
                    Log.d("MAQAA IS", "" +NAMES );
                    Log.d("QABXII IS", "" +correct );
                    Log.d("CURRENT DATE", "TODAY IS" +DATE);
                    MARKS = String.valueOf(correct);
                    EngOneDatabaseTwo bini = new EngOneDatabaseTwo(cxt2);
                    bini.saveEngTwo(bini, NAMES, MARKS, DATE);
                    Toast.makeText(getApplicationContext(), "BAGA GAMMADDE HAALA GAARIIN QABXIIN KEE KUUFAMEERA", Toast.LENGTH_LONG).show();
                    finish();
                }
                if (list.size() >= question.length) {
                    Intent intent = new Intent(EngOneTestTwo.this, EngOneCorrectionTwo.class);
                    startActivity(intent);
                }
            }
        });
    }
}
