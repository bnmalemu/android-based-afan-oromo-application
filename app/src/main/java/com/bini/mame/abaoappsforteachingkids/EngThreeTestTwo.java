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
public class EngThreeTestTwo extends AppCompatActivity
{
    private Button ques;
    private RadioGroup group;
    private RadioButton rba, rbb, rbc;
    private Button next;
    private final int[] question = {R.raw.kushan, R.raw.kujaa, R.raw.kutorba, R.raw.kusadet, R.raw.kusagal, R.raw.didama, R.raw.ditokko, R.raw.dilama, R.raw.disadii, R.raw.diafur, R.raw.dishan,
            R.raw.dijaa, R.raw.ditorba, R.raw.disadet, R.raw.disagal, R.raw.sodoma};
    private String [] answer = {"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
    private String [][] option = {{"15", "3", "7"}, {"4", "16", "2"}, {"9", "3", "17"}, {"4", "18", "6"}, {"5", "19", "16"}, {"20", "18", "6"},
            {"14", "21", "7"}, {"22", "28", "5"}, {"14", "9", "23"}, {"15", "24", "8"}, {"25", "11", "15"},
            {"12", "14", "26"}, {"27", "37", "13"}, {"12", "28", "10"}, {"24", "29", "15"}, {"30", "16", "10"}};

    public static int correct, wrong, point, inexact;
    private int flag = 0;
    private HashMap list = new HashMap<Integer, String>();

    private String ch[];
    String answ;
    private String MARKS;
    private String NAMES;
    private final Context cxt2 = this;
    private MediaPlayer mp;
    public static String CHALA1;

    //int index;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_three_ques_two);

        // variable initialization

        ques = (Button) findViewById(R.id.bny22);
        group = (RadioGroup) findViewById(R.id.bnp22);
        rba = (RadioButton) findViewById(R.id.bna22);
        rbb = (RadioButton) findViewById(R.id.bnb22);
        rbc = (RadioButton) findViewById(R.id.bnc22);
        next = (Button) findViewById(R.id.bnn22);
        flag = (int)Math.floor((Math.random() * 16));
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
                flag = (int) (Math.random() * 16);
                while(list.containsKey(flag)) {
                    flag = (int)Math.floor((Math.random() * 16));
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
                    CHALA1 = EngThreeTest.JIMMA1;
                    NAMES = CHALA1;
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = new Date();
                    String DATE = dateFormat.format(date);
                    Log.d("MAQAA IS", "" +NAMES );
                    Log.d("QABXII IS", "" +correct );
                    Log.d("CURRENT DATE", "TODAY IS" +DATE);
                    MARKS = String.valueOf(correct);
                    EngThreeDatabaseTwo bini = new EngThreeDatabaseTwo(cxt2);
                    bini.saveEng32(bini, NAMES, MARKS, DATE);
                    Toast.makeText(getApplicationContext(), "BAGA GAMMADDE HAALA GAARIIN QABXIIN KEE KUUFAMEERA", Toast.LENGTH_LONG).show();
                    finish();
                }
                if (list.size() >= question.length) {
                    Intent intent = new Intent(EngThreeTestTwo.this, EngThreeCorrectionTwo.class);
                    startActivity(intent);
                }
            }
        });
    }
}
