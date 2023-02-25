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
public class HerrThreeTestThree extends AppCompatActivity
{
    private Button ques;
    private RadioGroup group;
    private RadioButton rba, rbb, rbc;
    private Button next;
    private final String [] question = {"7*3", "8*1", "6*2", "1*0", "5*4", "7*2", "3*1", "6*2", "4*1", "1*3", "5*3", "3*4", "4*2",
            "3/3", "8/1", "14/2", "4/1", "12/4", "10/2", "3/1", "12/2", "12/4", "12/3", "18/3", "14/7", "18/2"};
    private String [] answer = {"21", "8", "12", "0", "20", "14", "3", "12", "4", "3", "15", "12", "8",
            "1", "8", "7", "4", "3", "5", "3", "6", "3", "4", "6", "2", "9"};
    private String [][] option = {{"10", "21", "13"}, {"8", "14", "9"}, {"8", "12", "15"}, {"0", "2", "1"},
            {"20", "10", "15"}, {"10", "14", "17"}, {"3", "4", "13"}, {"12", "10", "9"}, {"8", "4", "6"},
            {"1", "3", "2"}, {"10", "15", "13"}, {"12", "14", "9"}, {"6", "8", "9"}, {"1", "4", "9"}, {"8", "7", "5"}, {"4", "5", "7"},
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
    public static String WELL4;

    //int index;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herr_three_ques_three);

        // variable initialization

        ques = (Button) findViewById(R.id.gaf23);
        group = (RadioGroup) findViewById(R.id.gbp23);
        rba = (RadioButton) findViewById(R.id.gaa23);
        rbb = (RadioButton) findViewById(R.id.gab23);
        rbc = (RadioButton) findViewById(R.id.gac23);
        next = (Button) findViewById(R.id.gan33);
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
                if (list.size() == question.length){
                    WELL4 = HerrThreeTest.WEL1;
                    NAMES = WELL4;
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = new Date();
                    String DATE = dateFormat.format(date);
                    Log.d("MAQAA IS", "" +NAMES );
                    Log.d("QABXII IS", "" +correct );
                    Log.d("CURRENT DATE", "TODAY IS" +DATE);
                    MARKS = String.valueOf(correct);
                    HerrThreeDatabaseThree bini = new HerrThreeDatabaseThree(cxt1);
                    bini.saveMaths33(bini, NAMES, MARKS, DATE);
                    Toast.makeText(getApplicationContext(), "BAGA GAMMADDE QABXIIN KEE HAALA GAARIIN KUUFAMEERA", Toast.LENGTH_LONG).show();
                    finish();
                }
                if (list.size() >= question.length) {
                    Intent intent = new Intent(HerrThreeTestThree.this, HerrThreeCorrectionThree.class);
                    startActivity(intent);
                }
            }
        });
    }
}
