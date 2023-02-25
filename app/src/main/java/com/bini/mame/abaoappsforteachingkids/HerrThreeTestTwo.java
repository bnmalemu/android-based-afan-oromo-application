package com.bini.mame.abaoappsforteachingkids;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by Mame on 5/11/2016.
 */
public class HerrThreeTestTwo extends AppCompatActivity
{
    private Button ques;
    private RadioGroup group;
    private RadioButton rba, rbb, rbc;
    private Button next;
    private final String [] question = {"2/1", "4/2", "6/2", "5/1", "8/2", "8/4", "6/3", "18/9", "10/5", "12/6", "9/3",
            "15/5", "8/2", "3/3", "8/1", "14/2", "4/1", "12/4", "10/2", "3/1", "12/2", "12/4", "12/3", "18/3", "14/7", "18/2"};
    private String [] answer = {"2", "2", "3", "5", "4", "2", "2", "2", "2", "2", "3", "3", "4", "1", "8", "7",
            "4", "3", "5", "3", "6", "3", "4", "6", "2", "9"};
    private String [][] option = {{"1", "2", "3"}, {"4", "2", "3"}, {"3", "6", "2"}, {"9", "4", "5"}, {"5", "4", "6"}, {"4", "1", "2"},
            {"3", "2", "7"}, {"2", "8", "5"}, {"1", "2", "3"}, {"6", "2", "4"}, {"4", "3", "6"},
            {"6", "5", "3"}, {"1", "2", "4"}, {"1", "4", "9"}, {"8", "7", "5"}, {"4", "5", "7"},
            {"3", "4", "6"}, {"1", "3", "4"}, {"1", "4", "5"}, {"6", "3", "2"}, {"2", "6", "3"},
            {"3", "4", "2"}, {"4", "2", "3"}, {"2", "6", "9"}, {"1", "4", "2"}, {"9", "6", "8"}};

    public static int correct, wrong, point, inexact;
    private int flag = 0;
    private HashMap list = new HashMap<Integer, String>();

    private String ch[];
    String answ;
    private String MARKS;
    private String NAMES;
    private final Context cxt1 = this;
    private MediaPlayer mp;
    public static String WELL3;

    //int index;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herr_three_ques_two);

        // variable initialization

        ques = (Button) findViewById(R.id.gaf22);
        group = (RadioGroup) findViewById(R.id.gbp22);
        rba = (RadioButton) findViewById(R.id.gaa22);
        rbb = (RadioButton) findViewById(R.id.gab22);
        rbc = (RadioButton) findViewById(R.id.gac22);
        next = (Button) findViewById(R.id.gan22);
        flag = (int)Math.floor((Math.random() * 26));
        list.put(flag, "");

        ch = option[flag];
        answ = answer[flag];
        Log.d("Index: ", "" + flag);

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
                    rba.setText(ch[0]);
                    rbb.setText(ch[1]);
                    rbc.setText(ch[2]);
                }
                point = correct;
                inexact = wrong;
                if (list.size() == question.length){
                    WELL3 = HerrThreeTest.WEL1;
                    NAMES = WELL3;
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = new Date();
                    String DATE = dateFormat.format(date);
                    Log.d("MAQAA IS", "" +NAMES );
                    Log.d("QABXII IS", "" +correct );
                    Log.d("CURRENT DATE", "TODAY IS" +DATE);
                    MARKS = String.valueOf(correct);
                    HerrThreeDatabaseTwo bini = new HerrThreeDatabaseTwo(cxt1);
                    bini.saveMaths32(bini, NAMES, MARKS, DATE);
                    Toast.makeText(getApplicationContext(), "BAGA GAMMADDE HAALA GAARIIN QABXIIN KEE KUUFAMEERA", Toast.LENGTH_LONG).show();
                    finish();
                }
                if (list.size() >= question.length) {
                    Intent intent = new Intent(HerrThreeTestTwo.this, HerrThreeCorrectionTwo.class);
                    startActivity(intent);
                }
            }
        });
    }
}
