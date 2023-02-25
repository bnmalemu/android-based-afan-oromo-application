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
public class AfanThreeTestThree extends AppCompatActivity
{
    private Button ques;
    private RadioGroup group;
    private RadioButton rba, rbb, rbc;
    private Button next;
    private final int[] question = {R.raw.aannan, R.raw.baddaa, R.raw.ballaa, R.raw.cabbii, R.raw.damma, R.raw.qawwee, R.raw.ganna, R.raw.onnee, R.raw.madda, R.raw.jabbii, R.raw.harree};
    private String [] answer = {"AANNAN", "BADDAA", "BALLAA", "CABBII", "DAMMA", "QAWWEE", "GANNA", "ONNEE", "MADDA", "JABBII", "HARREE"};
    private String [][] option = {{"ANAN", "ANNAN", "AANNAN"}, {"BADAA", "BADDAA", "BADA"}, {"BALLAA", "BALAA", "BAALA"}, {"CABI", "CABBI", "CABBII"}, {"DAMA", "DAMMA", "DAAMAA"},
            {"QAWWEE", "QAWE", "QAWWE"}, {"GANA", "GANNAA", "GANNA"}, {"ONEE", "ONNEE", "ONE"}, {"MADAA", "MADDA", "MADA"}, {"JABI", "JABBII", "JABII"}, {"HARREE", "HAREE", "HARE"}};
    private MediaPlayer mp;
    public static int correct, wrong, point, inexact;
    private int flag = 0;
    private HashMap list = new HashMap<Integer, String>();

    String ch[];
    String answ;
    public static String OBSANI3;
    private String MARKS;
    private String NAMES;
    private final Context cxt1 = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_three_ques_three);

        // variable initialization

        ques = (Button) findViewById(R.id.um3);
        group = (RadioGroup) findViewById(R.id.rgu3);
        rba = (RadioButton) findViewById(R.id.rua3);
        rbb = (RadioButton) findViewById(R.id.rub3);
        rbc = (RadioButton) findViewById(R.id.ruc3);
        next = (Button) findViewById(R.id.nut3);

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
                    OBSANI3 = AfanThreeTest.KOOTI;
                    NAMES = OBSANI3;
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = new Date();
                    String DATE = dateFormat.format(date);
                    Log.d("MAQAA IS", "" +NAMES );
                    Log.d("QABXII IS", "" +correct );
                    Log.d("CURRENT DATE", "TODAY IS" +DATE);
                    MARKS = String.valueOf(correct);
                    AfanThreeDatabaseThree bini = new AfanThreeDatabaseThree(cxt1);
                    bini.saveAfan33(bini, NAMES, MARKS, DATE);
                    Toast.makeText(getApplicationContext(), "BAGA GAMMADDE HAALA GAARIIN QABXIIN KEE KUUFAMEERA", Toast.LENGTH_LONG).show();
                    finish();
                }
                if (list.size() >= question.length) {
                    Intent intent = new Intent(AfanThreeTestThree.this, AfanThreeCorrectionThree.class);
                    startActivity(intent);
                }
            }
        });
    }
}
