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
public class AfanThreeTestTwo extends AppCompatActivity
{
    private Button ques;
    private RadioGroup group;
    private RadioButton rba, rbb, rbc;
    private Button next;
    private final int[] question = {R.raw.bara, R.raw.fala, R.raw.lama, R.raw.lafa, R.raw.nama, R.raw.mana, R.raw.sona, R.raw.bira, R.raw.bade, R.raw.gama, R.raw.hare};
    private String [] answer = {"BARA", "FALA", "LAMA", "LAFA", "NAMA", "MANA", "SONA", "BIRA", "BADE", "GAMA", "HARE"};
    private String [][] option = {{"BARA", "BARRA", "BAARAA"}, {"FAALAA", "FALA", "LAFA"}, {"LAMMA", "LAAMAA", "LAMA"}, {"LAAFAA", "LAFA", "LAAFA"}, {"NAMA", "MANA", "ANA"},
            {"NAMA", "MANA", "AANAA"}, {"SOONA", "SONAA", "SONA"}, {"BIRA", "BIIRAA", "BIRRAA"}, {"BADDE", "BADEE", "BADE"}, {"GANNA", "GAMA", "GAAMMAA"}, {"HARREE", "HAREE", "HARE"}};
    private MediaPlayer mp;
    public static int correct, wrong;
    private int flag = 0;
    private HashMap list = new HashMap<Integer, String>();

    String ch[];
    String answ;
    public static String OBSANI2;
    private String MARKS;
    private String NAMES;
    private final Context cxt1 = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_three_ques_two);

        // variable initialization

        ques = (Button) findViewById(R.id.um2);
        group = (RadioGroup) findViewById(R.id.rgu2);
        rba = (RadioButton) findViewById(R.id.rua2);
        rbb = (RadioButton) findViewById(R.id.rub2);
        rbc = (RadioButton) findViewById(R.id.ruc2);
        next = (Button) findViewById(R.id.nut2);

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
                    OBSANI2 = AfanThreeTest.KOOTI;
                    NAMES = OBSANI2;
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = new Date();
                    String DATE = dateFormat.format(date);
                    Log.d("MAQAA IS", "" +NAMES );
                    Log.d("QABXII IS", "" +correct );
                    Log.d("CURRENT DATE", "TODAY IS" +DATE);
                    MARKS = String.valueOf(correct);
                    AfanThreeDatabaseTwo bini = new AfanThreeDatabaseTwo(cxt1);
                    bini.saveAfan32(bini, NAMES, MARKS, DATE);
                    Toast.makeText(getApplicationContext(), "BAGA GAMMADDE HAALA GAARIIN QABXIIN KEE KUUFAMEERA", Toast.LENGTH_LONG).show();
                    finish();
                }
                if (list.size() >= question.length) {
                    Intent intent = new Intent(AfanThreeTestTwo.this, AfanThreeCorrectionTwo.class);
                    startActivity(intent);
                }
            }
        });
    }
}
