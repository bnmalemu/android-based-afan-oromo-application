package com.bini.mame.abaoappsforteachingkids;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Mame on 5/23/2016.
 */
public class Registered extends AppCompatActivity
{
    private EditText USERNAME;
    private EditText PASSWORD;
    private EditText CONFIRM;
    private String username, password, confirm, saved;
    private Button REGISTER;
    private RadioGroup radioGroup;
    private RadioButton radioButtonOne;
    private RadioButton radioButtonTwo;
    private RadioButton radioButtonThree;
    private RadioButton save;
    private String level [] = {"1", "2", "3"};
    private final Context ctx = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registered);

        // Get Refferences of Views

        USERNAME = (EditText) findViewById(R.id.mt);
        PASSWORD = (EditText) findViewById(R.id.pass2);
        CONFIRM = (EditText) findViewById(R.id.pass5);
        radioGroup = (RadioGroup) findViewById(R.id.mt1);
        radioButtonOne = (RadioButton) findViewById(R.id.mt2);
        radioButtonTwo = (RadioButton) findViewById(R.id.mt3);
        radioButtonThree = (RadioButton) findViewById(R.id.mt4);
        REGISTER = (Button) findViewById(R.id.mt5);
        radioButtonOne.setText(level[0]);
        radioButtonTwo.setText(level[1]);
        radioButtonThree.setText(level[2]);
        REGISTER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
                saved = save.getText().toString();
                username = USERNAME.getText().toString();
                password = PASSWORD.getText().toString();
                confirm = CONFIRM.getText().toString();
                if (!(password.equals(confirm)))
                {
                    Toast.makeText(getApplicationContext(), "JECHI CE'UMSAA FAYYADAMTAN WAL QIXA MITI, IRRA DEEBI'AA GUUTAA", Toast.LENGTH_LONG).show();
                    PASSWORD.setText("");
                    CONFIRM.setText("");
                }
                else if(username.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "MAALOO ITTI FAYYADAMA MAQAA GUUTAA!", Toast.LENGTH_LONG).show();
                    USERNAME.setText("");
                }
                else if (password.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "MAALOO JECHA CE'UMSAA GUUTAA!", Toast.LENGTH_LONG).show();
                    PASSWORD.setText("");
                }

                else {
                    DatabaseOperation bdbo = new DatabaseOperation(ctx);
                    bdbo.regStudent(bdbo, username, password, saved);
                    Toast.makeText(getApplicationContext(), "BAGA GAMMADDAN HAALA GAARIIN GALMOOFTANIITTU!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(), MainTabActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}
