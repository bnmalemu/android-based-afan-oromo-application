package com.bini.mame.abaoappsforteachingkids;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Mame on 4/8/2016.
 */
public class HerrLamaLessThree extends AppCompatActivity
{
    private EditText res;
    private Button bzer, bon, btw, bthre, bfou, bfiv, bsi, bseve, beigh, bnin, clea, bad, bsub, bequa;
    private String signs = "";
    private int number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herr_kuta_lama_bar_sadi);

        res = (EditText) findViewById(R.id.yes);
        bzer = (Button) findViewById(R.id.bzer);
        bon = (Button) findViewById(R.id.bon);
        btw = (Button) findViewById(R.id.btw);
        bthre = (Button) findViewById(R.id.bthre);
        bfou = (Button) findViewById(R.id.bfou);
        bfiv = (Button) findViewById(R.id.bfiv);
        bsi = (Button) findViewById(R.id.bsi);
        bseve = (Button) findViewById(R.id.bseve);
        beigh = (Button) findViewById(R.id.beigh);
        bnin = (Button) findViewById(R.id.bnin);
        clea = (Button) findViewById(R.id.clr);
        bequa = (Button) findViewById(R.id.bequa);
        bad = (Button) findViewById(R.id.ida);
        bsub = (Button) findViewById(R.id.hir);

        //button zero event handler
        bzer.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText zero = (EditText) findViewById(R.id.yes);
                        zero.append("0");

                    }
                }
        );
        bon.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText one = (EditText) findViewById(R.id.yes);
                        one.append("1");
                    }
                }
        );
        btw.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText two = (EditText) findViewById(R.id.yes);
                        two.append("2");
                    }
                }
        );
        bthre.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText three = (EditText) findViewById(R.id.yes);
                        three.append("3");
                    }
                }
        );
        bfou.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText four = (EditText) findViewById(R.id.yes);
                        four.append("4");
                    }
                }
        );
        bfiv.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText five = (EditText) findViewById(R.id.yes);
                        five.append("5");
                    }
                }
        );
        bsi.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText six = (EditText) findViewById(R.id.yes);
                        six.append("6");
                    }
                }
        );
        bseve.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText seven = (EditText) findViewById(R.id.yes);
                        seven.append("7");
                    }
                }
        );
        beigh.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText eight = (EditText) findViewById(R.id.yes);
                        eight.append("8");
                    }
                }
        );
        bnin.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText nine = (EditText) findViewById(R.id.yes);
                        nine.append("9");
                    }
                }
        );
        clea.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText clear = (EditText) findViewById(R.id.yes);
                        clear.setText("");
                    }
                }
        );
        bad.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText add = (EditText) findViewById(R.id.yes);
                        number1 = Integer.parseInt(add.getText().toString());
                        add.setText("");
                        signs = "+";
                    }
                }
        );
        bsub.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText diff = (EditText) findViewById(R.id.yes);
                        number1 = Integer.parseInt(diff.getText().toString());
                        diff.setText("");
                        signs = "-";
                    }
                }
        );
        bequa.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText equal = (EditText) findViewById(R.id.yes);
                        number2 = Integer.parseInt(equal.getText().toString());
                        if (signs == "+")
                        {
                            equal.setText(Integer.toString(number1 + number2));
                        }
                        else if (signs == "-")
                        {
                            if (number1 < number2)
                            {
                                equal.setText("HIN DANDA'AMU");
                            }
                            else
                            {
                                equal.setText(Integer.toString(number1 - number2));
                            }
                        }
                        signs = "";
                    }
                }
        );
    }
}
