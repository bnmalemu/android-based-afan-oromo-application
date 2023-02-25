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
public class EngThreeTestOne extends AppCompatActivity
{
    private Button ques;
    private RadioGroup group;
    private RadioButton rba, rbb, rbc;
    private Button next;
    private final int[] question = {R.raw.to, R.raw.lam, R.raw.sadii, R.raw.afur, R.raw.shan, R.raw.jaa, R.raw.torba, R.raw.sadet, R.raw.sagal, R.raw.kudhan, R.raw.kutokko,
            R.raw.kulama, R.raw.kusadi, R.raw.kuafur, R.raw.kushan, R.raw.kujaa};
    private String [] answer = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"};
    private String [][] option = {{"1", "3", "7"}, {"4", "6", "2"}, {"9", "3", "11"}, {"4", "12", "6"}, {"5", "10", "16"}, {"7", "8", "6"},
            {"14", "4", "7"}, {"7", "8", "5"}, {"14", "9", "13"}, {"15", "10", "8"}, {"12", "11", "15"},
            {"12", "14", "9"}, {"2", "7", "13"}, {"12", "14", "10"}, {"4", "16", "15"}, {"14", "16", "10"}};

    public static int correct, wrong, point, inexact;
    private int flag = 0;
    private HashMap list = new HashMap<Integer, String>();

    private String ch[];
    String answ;
    private String MARKS;
    private String NAMES;
    private final Context cxt1 = this;
    private MediaPlayer mp;
    public static String CHALA;

    //int index;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_three_ques_one);

        // variable initialization

        ques = (Button) findViewById(R.id.bny21);
        group = (RadioGroup) findViewById(R.id.bnp21);
        rba = (RadioButton) findViewById(R.id.bna21);
        rbb = (RadioButton) findViewById(R.id.bnb21);
        rbc = (RadioButton) findViewById(R.id.bnc21);
        next = (Button) findViewById(R.id.bnn21);
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
                    CHALA = EngThreeTest.JIMMA1;
                    NAMES = CHALA;
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = new Date();
                    String DATE = dateFormat.format(date);
                    Log.d("MAQAA IS", "" +NAMES );
                    Log.d("QABXII IS", "" +correct );
                    Log.d("CURRENT DATE", "TODAY IS" +DATE);
                    MARKS = String.valueOf(correct);
                    EngThreeDatabaseOne bini = new EngThreeDatabaseOne(cxt1);
                    bini.saveEng31(bini, NAMES, MARKS, DATE);
                    Toast.makeText(getApplicationContext(), "BAGA GAMMADDE HAALA GAARIIN QABXIIN KEE KUUFAMEERA", Toast.LENGTH_LONG).show();
                    finish();
                }
                if (list.size() >= question.length) {
                    Intent bini1 = new Intent(EngThreeTestOne.this, EngThreeCorrectionOne.class);
                    startActivity(bini1);
                }
            }
        });
    }
}
