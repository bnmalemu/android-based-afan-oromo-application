package com.bini.mame.abaoappsforteachingkids;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Mame on 4/8/2016.
 */
public class HerrSadiLessThree extends AppCompatActivity
{
    private EditText result;
    private Button bzero, bone, btwo, bthree, bfour, bfive, bsix, bseven, beight, bnine, clear, badd, bsubt, bequal, bmult, bdivi;
    private String sign = "";
    private int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herr_kuta_sadi_bar_sadi);

        result = (EditText) findViewById(R.id.debi);
        bzero = (Button) findViewById(R.id.bzero);
        bone = (Button) findViewById(R.id.bone);
        btwo = (Button) findViewById(R.id.btwo);
        bthree = (Button) findViewById(R.id.bthree);
        bfour = (Button) findViewById(R.id.bfour);
        bfive = (Button) findViewById(R.id.bfive);
        bsix = (Button) findViewById(R.id.bsix);
        bseven = (Button) findViewById(R.id.bseven);
        beight = (Button) findViewById(R.id.beight);
        bnine = (Button) findViewById(R.id.bnine);
        clear = (Button) findViewById(R.id.clear);
        bequal = (Button) findViewById(R.id.bequal);
        badd = (Button) findViewById(R.id.pls);
        bsubt = (Button) findViewById(R.id.sbt);
        bmult = (Button) findViewById(R.id.mlt);
        bdivi = (Button) findViewById(R.id.dvi);

        //button zero event handler
        bzero.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText zero = (EditText) findViewById(R.id.debi);
                        zero.append("0");
                    }
                }
        );
        bone.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText one = (EditText) findViewById(R.id.debi);
                        one.append("1");
                    }
                }
        );
        btwo.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText two = (EditText) findViewById(R.id.debi);
                        two.append("2");
                    }
                }
        );
        bthree.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText three = (EditText) findViewById(R.id.debi);
                        three.append("3");
                    }
                }
        );
        bfour.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText four = (EditText) findViewById(R.id.debi);
                        four.append("4");
                    }
                }
        );
        bfive.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText five = (EditText) findViewById(R.id.debi);
                        five.append("5");
                    }
                }
        );
        bsix.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText six = (EditText) findViewById(R.id.debi);
                        six.append("6");
                    }
                }
        );
        bseven.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText seven = (EditText) findViewById(R.id.debi);
                        seven.append("7");
                    }
                }
        );
        beight.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText eight = (EditText) findViewById(R.id.debi);
                        eight.append("8");
                    }
                }
        );
        bnine.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText nine = (EditText) findViewById(R.id.debi);
                        nine.append("9");
                    }
                }
        );
        clear.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText clear = (EditText) findViewById(R.id.debi);
                        clear.setText("");
                    }
                }
        );
        badd.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText add = (EditText) findViewById(R.id.debi);
                        num1 = Integer.parseInt(add.getText().toString());
                        add.setText("");
                        sign = "+";
                    }
                }
        );
        bsubt.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText diff = (EditText) findViewById(R.id.debi);
                        num1 = Integer.parseInt(diff.getText().toString());
                        diff.setText("");
                        sign = "-";
                    }
                }
        );
        bmult.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText add = (EditText) findViewById(R.id.debi);
                        num1 = Integer.parseInt(add.getText().toString());
                        add.setText("");
                        sign = "*";
                    }
                }
        );
        bdivi.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View view) {
                        EditText diff = (EditText) findViewById(R.id.debi);
                        num1 = Integer.parseInt(diff.getText().toString());
                        diff.setText("");
                        sign = "/";
                    }
                }
        );
        bequal.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText equal = (EditText) findViewById(R.id.debi);
                        num2 = Integer.parseInt(equal.getText().toString());
                        if (sign == "+")
                        {
                            equal.setText(Integer.toString(num1 + num2));
                        }
                        else if (sign == "-")
                        {
                            if (num1 < num2)
                            {
                                equal.setText("HIN DANDA'AMU");
                            }
                            else
                            {
                                equal.setText(Integer.toString(num1 - num2));
                            }
                        }
                        if (sign == "*")
                        {
                            equal.setText(Integer.toString(num1 * num2));
                        }
                        else if (sign == "/")
                        {
                            if ((num2 == 0) && (num1 < num2))
                            {
                                equal.setText("HIN DANDA'AMU");
                            }
                            else
                            {
                                equal.setText(Integer.toString(num1 / num2));
                            }
                        }
                        sign = "";
                    }
                }
        );
    }
}
