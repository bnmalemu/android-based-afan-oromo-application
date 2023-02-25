package com.bini.mame.abaoappsforteachingkids;

import android.content.Context;
import android.content.Intent;
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
public class HerrTwoTestTwo extends AppCompatActivity
{
    private Button ques;
    private RadioGroup group;
    private RadioButton rba, rbb, rbc;
    private Button next;
    private final String [] question = {"2-1", "4-2", "5-2", "5-1", "7-2", "8-4", "6-3", "6-4", "10-5", "12-6", "9-5",
                                        "11-5", "8-6", "7-3", "8-1", "6-2", "4-1", "5-4", "5-2", "3-1", "4-2", "12-2", "10-7", "10-8", "13-9", "3-2"};
    private String [] answer = {"1", "2", "3", "4", "5", "4", "3", "2", "5", "6", "4", "6", "2", "4", "7", "4",
            "3", "1", "3", "2", "2", "10", "3", "2", "4", "1"};
    private String [][] option = {{"1", "2", "3"}, {"4", "2", "3"}, {"3", "6", "2"}, {"9", "4", "11"}, {"5", "12", "6"}, {"4", "1", "7"},
            {"3", "8", "7"}, {"2", "8", "5"}, {"4", "5", "1"}, {"6", "10", "9"}, {"4", "11", "15"},
            {"6", "5", "7"}, {"1", "2", "3"}, {"1", "4", "9"}, {"8", "7", "5"}, {"4", "5", "1"},
            {"3", "8", "7"}, {"1", "8", "7"}, {"1", "4", "3"}, {"6", "3", "2"}, {"2", "4", "3"},
            {"12", "14", "10"}, {"1", "2", "3"}, {"2", "1", "9"}, {"1", "4", "2"}, {"1", "4", "2"}};

    public static int correct, wrong;
    private int flag = 0;
    private HashMap list = new HashMap<Integer, String>();

    private String ch[];
    String answ;
    private String MARKS;
    private String NAMES;
    private final Context cxt1 = this;
    public static String COME3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herr_two_ques_two);

        // variable initialization

        ques = (Button) findViewById(R.id.gaf12);
        group = (RadioGroup) findViewById(R.id.gbp12);
        rba = (RadioButton) findViewById(R.id.gaa12);
        rbb = (RadioButton) findViewById(R.id.gab12);
        rbc = (RadioButton) findViewById(R.id.gac12);
        next = (Button) findViewById(R.id.gan12);
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
                    COME3 = HerrTwoTest.COME1;
                    NAMES = COME3;
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = new Date();
                    String DATE = dateFormat.format(date);
                    Log.d("MAQAA IS", "" +NAMES );
                    Log.d("QABXII IS", "" +correct );
                    Log.d("CURRENT DATE", "TODAY IS" +DATE);
                    MARKS = String.valueOf(correct);
                    HerrTwoDatabaseTwo bini = new HerrTwoDatabaseTwo(cxt1);
                    bini.saveMaths22(bini, NAMES, MARKS, DATE);
                    Toast.makeText(getApplicationContext(), "BAGA GAMMADDE HAALA GAARIIN QABXIIN KEE KUUFAMEERA", Toast.LENGTH_LONG).show();
                    finish();
                }
                if (list.size() >= question.length) {
                    Intent intent = new Intent(HerrTwoTestTwo.this, HerrTwoCorrectionTwo.class);
                    startActivity(intent);
                }
            }
        });
    }
}
