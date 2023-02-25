package com.bini.mame.abaoappsforteachingkids;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Mame on 4/9/2016.
 */
public class HerrSadiLessOneAudio extends AppCompatActivity
{
    private String [] numbers = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50",
                                            "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100"};
    private ListView list;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herr_two_list_view_one);
        list = (ListView) findViewById(R.id.bhl2);
        list.setAdapter(new ArrayAdapter<>(this, R.layout.herr_two_single_row_less_one, R.id.bhl1, numbers));
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.to);
                    mediaPlayer.start();
                }

                if (position == 1) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.lam);
                    mediaPlayer.start();
                }

                if (position == 2) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sadii);
                    mediaPlayer.start();
                }

                if (position == 3) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.afur);
                    mediaPlayer.start();
                }

                if (position == 4) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.shan);
                    mediaPlayer.start();
                }

                if (position == 5) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.jaa);
                    mediaPlayer.start();
                }

                if (position == 6) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.torba);
                    mediaPlayer.start();
                }

                if (position == 7) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sadet);
                    mediaPlayer.start();
                }

                if (position == 8) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sagal);
                    mediaPlayer.start();
                }

                if (position == 9) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.kudhan);
                    mediaPlayer.start();
                }

                if (position == 10) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.kutokko);
                    mediaPlayer.start();
                }

                if (position == 11) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.kulama);
                    mediaPlayer.start();
                }

                if (position == 12) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.kusadi);
                    mediaPlayer.start();
                }

                if (position == 13) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.kuafur);
                    mediaPlayer.start();
                }

                if (position == 14) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.kushan);
                    mediaPlayer.start();
                }

                if (position == 15) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.kujaa);
                    mediaPlayer.start();
                }

                if (position == 16) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.kutorba);
                    mediaPlayer.start();
                }

                if (position == 17) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.kusadet);
                    mediaPlayer.start();
                }

                if (position == 18) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.kusagal);
                    mediaPlayer.start();
                }

                if (position == 19) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.didama);
                    mediaPlayer.start();
                }

                if (position == 20) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.ditokko);
                    mediaPlayer.start();
                }

                if (position == 21) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.dilama);
                    mediaPlayer.start();
                }

                if (position == 22) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.disadii);
                    mediaPlayer.start();
                }

                if (position == 23) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.diafur);
                    mediaPlayer.start();
                }

                if (position == 24) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.dishan);
                    mediaPlayer.start();
                }

                if (position == 25) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.dijaa);
                    mediaPlayer.start();
                }

                if (position == 26) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.ditorba);
                    mediaPlayer.start();
                }

                if (position == 27) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.disadet);
                    mediaPlayer.start();
                }

                if (position == 28) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.disagal);
                    mediaPlayer.start();
                }

                if (position == 29) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sodoma);
                    mediaPlayer.start();
                }

                if (position == 30) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sotokko);
                    mediaPlayer.start();
                }

                if (position == 31) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.solama);
                    mediaPlayer.start();
                }

                if (position == 32) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sosadii);
                    mediaPlayer.start();
                }

                if (position == 33) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.soafur);
                    mediaPlayer.start();
                }

                if (position == 34) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.soshan);
                    mediaPlayer.start();
                }

                if (position == 35) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sojaa);
                    mediaPlayer.start();
                }

                if (position == 36) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sotorba);
                    mediaPlayer.start();
                }

                if (position == 37) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sosaddet);
                    mediaPlayer.start();
                }

                if (position == 38) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sosagal);
                    mediaPlayer.start();
                }

                if (position == 39) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.afurtama);
                    mediaPlayer.start();
                }

                if (position == 40) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.aftokko);
                    mediaPlayer.start();
                }

                if (position == 41) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.aflama);
                    mediaPlayer.start();
                }

                if (position == 42) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.afsadii);
                    mediaPlayer.start();
                }

                if (position == 43) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.afafur);
                    mediaPlayer.start();
                }

                if (position == 44) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.afshan);
                    mediaPlayer.start();
                }

                if (position == 45) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.afjaa);
                    mediaPlayer.start();
                }

                if (position == 46) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.aftorba);
                    mediaPlayer.start();
                }

                if (position == 47) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.afsaddet);
                    mediaPlayer.start();
                }

                if (position == 48) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.afsagal);
                    mediaPlayer.start();
                }

                if (position == 49) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.shantama);
                    mediaPlayer.start();
                }

                if (position == 50) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.shatorba);
                    mediaPlayer.start();
                }

                if (position == 51) {
                    mediaPlayer.reset();
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.shalama);
                    mediaPlayer.start();
                }

                if (position == 52) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.shasadii);
                    mediaPlayer.start();
                }

                if (position == 53) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.shaafur);
                    mediaPlayer.start();
                }

                if (position == 54) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.shashan);
                    mediaPlayer.start();
                }

                if (position == 55) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.shajaa);
                    mediaPlayer.start();
                }

                if (position == 56) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.shatorba);
                    mediaPlayer.start();
                }

                if (position == 57) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.shasaddet);
                    mediaPlayer.start();
                }

                if (position == 58) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.shasagal);
                    mediaPlayer.start();
                }

                if (position == 59) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.jatama);
                    mediaPlayer.start();
                }

                if (position == 60) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.jatokko);
                    mediaPlayer.start();
                }

                if (position == 61) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.jalama);
                    mediaPlayer.start();
                }

                if (position == 62) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.jasadii);
                    mediaPlayer.start();
                }

                if (position == 63) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.jaafur);
                    mediaPlayer.start();
                }

                if (position == 64) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.jashan);
                    mediaPlayer.start();
                }

                if (position == 65) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.jajaa);
                    mediaPlayer.start();
                }

                if (position == 66) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.jatorba);
                    mediaPlayer.start();
                }

                if (position == 67) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.jasaddet);
                    mediaPlayer.start();
                }

                if (position == 68) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.jasagal);
                    mediaPlayer.start();
                }

                if (position == 69) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.torbatama);
                    mediaPlayer.start();
                }

                if (position == 70) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.totokko);
                    mediaPlayer.start();
                }

                if (position == 71) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.tolama);
                    mediaPlayer.start();
                }

                if (position == 72) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.tosadii);
                    mediaPlayer.start();
                }

                if (position == 73) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.toafur);
                    mediaPlayer.start();
                }

                if (position == 74) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.toshan);
                    mediaPlayer.start();
                }

                if (position == 75) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.tojaa);
                    mediaPlayer.start();
                }

                if (position == 76) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.totorba);
                    mediaPlayer.start();
                }

                if (position == 77) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.tosadet);
                    mediaPlayer.start();
                }

                if (position == 78) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.tosagal);
                    mediaPlayer.start();
                }

                if (position == 79) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sadetama);
                    mediaPlayer.start();
                }

                if (position == 80) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sadtokko);
                    mediaPlayer.start();
                }

                if (position == 81) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sadlama);
                    mediaPlayer.start();
                }

                if (position == 82) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sadsadii);
                    mediaPlayer.start();
                }

                if (position == 83) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sadafur);
                    mediaPlayer.start();
                }

                if (position == 84) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sadshan);
                    mediaPlayer.start();
                }

                if (position == 85) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sadjaa);
                    mediaPlayer.start();
                }

                if (position == 86) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sadtorba);
                    mediaPlayer.start();
                }

                if (position == 87) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sadsaddet);
                    mediaPlayer.start();
                }

                if (position == 88) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sadsagal);
                    mediaPlayer.start();
                }

                if (position == 89) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sagaltama);
                    mediaPlayer.start();
                }

                if (position == 90) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.satokko);
                    mediaPlayer.start();
                }

                if (position == 91) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.salama);
                    mediaPlayer.start();
                }

                if (position == 92) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sasadii);
                    mediaPlayer.start();
                }

                if (position == 93) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.saafur);
                    mediaPlayer.start();
                }

                if (position == 94) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sashan);
                    mediaPlayer.start();
                }

                if (position == 95) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sajaa);
                    mediaPlayer.start();
                }

                if (position == 96) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.satorba);
                    mediaPlayer.start();
                }

                if (position == 97) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sasaddet);
                    mediaPlayer.start();
                }

                if (position == 98) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.sasagal);
                    mediaPlayer.start();
                }

                if (position == 99) {
                    mediaPlayer = MediaPlayer.create(HerrSadiLessOneAudio.this, R.raw.dhibbatokko);
                    mediaPlayer.start();
                }
            }
        });
    }
}
