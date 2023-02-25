package com.bini.mame.abaoappsforteachingkids;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
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
public class EngThreeTestThree extends AppCompatActivity
{
    private Button ques;
    private RadioGroup group;
    private RadioButton rba, rbb, rbc;
    private Button next;
    private final int[] question = {R.raw.sodoma, R.raw.sotokko, R.raw.solama, R.raw.sosadii, R.raw.soafur, R.raw.soshan, R.raw.sojaa, R.raw.sotorba, R.raw.sosaddet, R.raw.sosagal, R.raw.afurtama,
            R.raw.aftokko, R.raw.aflama, R.raw.afsadii, R.raw.afafur, R.raw.afshan, R.raw.afjaa, R.raw.aftorba, R.raw.afsaddet, R.raw.afsagal, R.raw.shantama};
    private String [] answer = {"30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50"};
    private String [][] option = {{"31", "30", "37"}, {"31", "26", "32"}, {"29", "32", "31"}, {"34", "32", "33"}, {"35", "30", "34"}, {"37", "36", "35"},
            {"37", "36", "37"}, {"34", "37", "38"}, {"37", "38", "39"}, {"40", "39", "35"}, {"40", "39", "35"}, {"35", "42", "41"}, {"42", "41", "45"},
            {"42", "43", "49"}, {"42", "47", "43"}, {"48", "34", "44"}, {"45", "46", "35"}, {"24", "36", "47"}, {"48", "34", "44"}, {"45", "46", "49"}, {"24", "36", "50"}};

    public static int correct, wrong, point, inexact;
    private int flag = 0;
    private HashMap list = new HashMap<Integer, String>();

    private String ch[];
    String answ;
    private String MARKS;
    private String NAMES;
    private final Context cxt1 = this;
    private MediaPlayer mp;
    public static String CHALA2;

    //int index;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_three_ques_three);

        // variable initialization

        ques = (Button) findViewById(R.id.bny23);
        group = (RadioGroup) findViewById(R.id.bnp23);
        rba = (RadioButton) findViewById(R.id.bna23);
        rbb = (RadioButton) findViewById(R.id.bnb23);
        rbc = (RadioButton) findViewById(R.id.bnc23);
        next = (Button) findViewById(R.id.bnn23);
        flag = (int) Math.floor((Math.random() * 21));
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
                flag = (int) (Math.random() * 21);
                while(list.containsKey(flag)) {
                    flag = (int)Math.floor((Math.random() * 21));
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
                    CHALA2 = EngThreeTest.JIMMA1;
                    NAMES = CHALA2;
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = new Date();
                    String DATE = dateFormat.format(date);
                    Log.d("MAQAA IS", "" +NAMES );
                    Log.d("QABXII IS", "" +correct );
                    Log.d("CURRENT DATE", "TODAY IS" +DATE);
                    MARKS = String.valueOf(correct);
                    EngThreeDatabaseThree bini = new EngThreeDatabaseThree(cxt1);
                    bini.saveEng33(bini, NAMES, MARKS, DATE);
                    Toast.makeText(getApplicationContext(), "BAGA GAMMADDE HAALA GAARIIN QABXIIN KEE KUUFAMEERA", Toast.LENGTH_LONG).show();
                    finish();
                }
                if (list.size() >= question.length) {
                    Intent intent = new Intent(EngThreeTestThree.this, EngThreeCorrectionThree.class);
                    startActivity(intent);
                }
            }
        });
    }
}
