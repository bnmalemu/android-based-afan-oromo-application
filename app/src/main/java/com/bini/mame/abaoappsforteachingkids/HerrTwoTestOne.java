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
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by Mame on 5/11/2016.
 */
public class HerrTwoTestOne extends AppCompatActivity
{
    private Button ques;
    private RadioGroup group;
    private RadioButton rba, rbb, rbc;
    private Button next;
    private final String [] question = {"1+1", "1+2", "2+2", "2+1", "3+2", "3+4", "3+3", "4+4", "5+5", "6+6", "4+5",
                                        "3+5", "4+6", "7+3", "8+1", "6+2", "4+1", "5+4", "5+2", "3+1", "4+2", "4+4", "5+7", "5+8", "3+9", "9+2"};
    private String [] answer = {"2", "3", "4", "3", "5", "7", "6", "8", "10", "12", "9", "8", "10", "10", "9", "8",
                                "5", "9", "7", "4", "6", "8", "12", "13", "12", "11"};
    private String [][] option = {{"1", "2", "3"}, {"4", "2", "3"}, {"4", "6", "2"}, {"9", "3", "11"}, {"5", "12", "6"}, {"5", "10", "7"}, {"7", "8", "6"},
            {"14", "8", "7"}, {"10", "8", "5"}, {"10", "12", "11"}, {"15", "10", "9"}, {"8", "11", "15"},
            {"12", "14", "10"}, {"10", "7", "13"}, {"12", "14", "9"}, {"8", "16", "15"}, {"14", "5", "10"},
            {"9", "8", "7"}, {"10", "8", "7"}, {"14", "4", "13"}, {"6", "10", "9"}, {"8", "11", "15"},
            {"12", "14", "10"}, {"10", "7", "13"}, {"12", "14", "9"}, {"11", "16", "15"}};

    public static int correct, wrong, point, inexact;
    private int flag = 0;
    private HashMap list = new HashMap<Integer, String>();

    private String ch[];
    String answ;
    private String MARKS;
    private String NAMES;
    private final Context cxt1 = this;
    public static String COME2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herr_two_ques_one);

        // variable initialization

        ques = (Button) findViewById(R.id.gaf11);
        group = (RadioGroup) findViewById(R.id.gbp11);
        rba = (RadioButton) findViewById(R.id.gaa11);
        rbb = (RadioButton) findViewById(R.id.gab11);
        rbc = (RadioButton) findViewById(R.id.gac11);
        next = (Button) findViewById(R.id.gan11);
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
                    COME2 = HerrTwoTest.COME1;
                    NAMES = COME2;
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = new Date();
                    String DATE = dateFormat.format(date);
                    Log.d("MAQAA IS", "" +NAMES );
                    Log.d("QABXII IS", "" +correct );
                    Log.d("CURRENT DATE", "TODAY IS" +DATE);
                    MARKS = String.valueOf(correct);
                    HerrTwoDatabaseOne bini = new HerrTwoDatabaseOne(cxt1);
                    bini.saveMaths21(bini, NAMES, MARKS, DATE);
                    Toast.makeText(getApplicationContext(), "BAGA GAMMADDE HAALA GAARIIN QABXIIN KEE KUUFAMEERA", Toast.LENGTH_LONG).show();
                    finish();
                }
                if (list.size() >= question.length) {
                    Intent intent = new Intent(HerrTwoTestOne.this, HerrTwoCorrectionOne.class);
                    startActivity(intent);
                }
            }
        });
    }
}
