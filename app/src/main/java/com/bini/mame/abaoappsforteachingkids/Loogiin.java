package com.bini.mame.abaoappsforteachingkids;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Mame on 5/23/2016.
 */
public class Loogiin extends AppCompatActivity
{
    private EditText USERNAME;
    private EditText PASSWORD;
    private String UserName;
    private String password;
    private final Context cxt = this;
    public static String USERNAME1, PASSWORD1;
    private int level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loogiin);
        USERNAME = (EditText) findViewById(R.id.user);
        PASSWORD = (EditText) findViewById(R.id.pass4);
    }

    public void login(View logi) {
        switch (logi.getId()) {
            case R.id.seni1:
                UserName = USERNAME.getText().toString();
                password = PASSWORD.getText().toString();
                if(UserName.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "MAALOO ITTI FAYYADAMA MAQAA KEETII GUUTAA!", Toast.LENGTH_SHORT).show();
                    USERNAME.setText("");
                }
                else if (password.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "MAALOO JECHA CE'UMSAA KEETII GUUTAA!", Toast.LENGTH_SHORT).show();
                    PASSWORD.setText("");
                }
                else
                {
                    DatabaseOperation bdbo = new DatabaseOperation(cxt);
                    Cursor csr = bdbo.getInformation(bdbo);
                    csr.moveToFirst();
                    boolean status = false;
                    do {
                        if ((UserName.equals(csr.getString(0))) && (password.equals(csr.getString(1))))
                        {
                            level = csr.getInt(2);
                            status = true;
                        }

                    } while (csr.moveToNext());
                    if (status)
                    {
                        switch (level) {
                            case 1:
                                Intent kut1 = new Intent(Loogiin.this, MainChoiceOne.class);
                                startActivity(kut1);
                                USERNAME1 = UserName;
                                PASSWORD1 = password;
                                Log.d("Biinii cs", "your login is successful");
                                Toast.makeText(Loogiin.this, "HAALA GAARIIN MILKOOFTANIITTU! \n BAGA NAGAAN DHUFTAN ISINIIN JEDHA", Toast.LENGTH_SHORT).show();
                                break;

                            case 2:

                                Intent kut2 = new Intent(Loogiin.this, MainChoiceTwo.class);
                                startActivity(kut2);
                                USERNAME1 = UserName;
                                PASSWORD1 = password;
                                Log.d("Biinii cs", "your login is successful");
                                Toast.makeText(Loogiin.this, "HAALA GAARIIN MILKOOFTANIITTU! \n\n BAGA NAGAAN DHUFTAN ISINIIN JEDHA", Toast.LENGTH_SHORT).show();
                                break;

                            case 3:

                                Intent kut3 = new Intent(Loogiin.this, MainChoiceThree.class);
                                startActivity(kut3);
                                USERNAME1 = UserName;
                                PASSWORD1 = password;
                                Log.d("Biinii cs", "your login is successful");
                                Toast.makeText(Loogiin.this, "HAALA GAARIIN MILKOOFTANIITTU! \n\n BAGA NAGAAN DHUFTAN ISINIIN JEDHA", Toast.LENGTH_LONG).show();
                                break;
                        }
                    }
                    else
                    {
                        Toast.makeText(Loogiin.this, "MILKAA'UU HIN DANDEENYE \n\n MAALOO ITTI FAYYADMA MAQAA KEESSAN IRRA DEEBI'UN GUUTAA!", Toast.LENGTH_LONG).show();
                        USERNAME.setText("");
                        PASSWORD.setText("");

                    }
                }
        }
    }
}
