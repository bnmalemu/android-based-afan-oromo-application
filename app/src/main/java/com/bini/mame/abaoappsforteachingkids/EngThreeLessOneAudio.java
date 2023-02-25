package com.bini.mame.abaoappsforteachingkids;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Mame on 4/16/2016.
 */
public class EngThreeLessOneAudio extends AppCompatActivity
{
    private String [] counting = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100"};
    private ListView english;
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_three_list_view_one);
        english = (ListView) findViewById(R.id.oo);
        english.setAdapter(new ArrayAdapter<>(this, R.layout.eng_three_single_row_one, R.id.does, counting));
        english.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.one);
                    mediaPlayer.start();
                }

                if (position == 1) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.two);
                    mediaPlayer.start();
                }

                if (position == 2) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.three);
                    mediaPlayer.start();
                }

                if (position == 3) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.four);
                    mediaPlayer.start();
                }

                if (position == 4) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.five);
                    mediaPlayer.start();
                }

                if (position == 5) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.six);
                    mediaPlayer.start();
                }

                if (position == 6) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.seven);
                    mediaPlayer.start();
                }

                if (position == 7) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.eight);
                    mediaPlayer.start();
                }

                if (position == 8) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.nine);
                    mediaPlayer.start();
                }

                if (position == 9) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.ten);
                    mediaPlayer.start();
                }

                if (position == 10) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.eleven);
                    mediaPlayer.start();
                }

                if (position == 11) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.twelve);
                    mediaPlayer.start();
                }

                if (position == 12) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.thirteen);
                    mediaPlayer.start();
                }

                if (position == 13) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.fourteen);
                    mediaPlayer.start();
                }

                if (position == 14) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.fiften);
                    mediaPlayer.start();
                }

                if (position == 15) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.sixten);
                    mediaPlayer.start();
                }

                if (position == 16) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.seventeen);
                    mediaPlayer.start();
                }

                if (position == 17) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.eighten);
                    mediaPlayer.start();
                }

                if (position == 18) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.ninteen);
                    mediaPlayer.start();
                }

                if (position == 19) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.twenty);
                    mediaPlayer.start();
                }

                if (position == 20) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.twoone);
                    mediaPlayer.start();
                }

                if (position == 21) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.twotwo);
                    mediaPlayer.start();
                }

                if (position == 22) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.twothree);
                    mediaPlayer.start();
                }

                if (position == 23) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.twofour);
                    mediaPlayer.start();
                }

                if (position == 24) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.twofive);
                    mediaPlayer.start();
                }

                if (position == 25) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.twosix);
                    mediaPlayer.start();
                }

                if (position == 26) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.twosev);
                    mediaPlayer.start();
                }

                if (position == 27) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.twoeight);
                    mediaPlayer.start();
                }

                if (position == 28) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.twonine);
                    mediaPlayer.start();
                }

                if (position == 29) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.thirty);
                    mediaPlayer.start();
                }

                if (position == 30) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.threeone);
                    mediaPlayer.start();
                }

                if (position == 31) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.threetwo);
                    mediaPlayer.start();
                }

                if (position == 32) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.threethr);
                    mediaPlayer.start();
                }

                if (position == 33) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.threefour);
                    mediaPlayer.start();
                }

                if (position == 34) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.threefive);
                    mediaPlayer.start();
                }

                if (position == 35) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.threesix);
                    mediaPlayer.start();
                }

                if (position == 36) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.threeseven);
                    mediaPlayer.start();
                }

                if (position == 37) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.threeeigh);
                    mediaPlayer.start();
                }

                if (position == 38) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.threenine);
                    mediaPlayer.start();
                }

                if (position == 39) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.fourty);
                    mediaPlayer.start();
                }

                if (position == 40) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.fourone);
                    mediaPlayer.start();
                }

                if (position == 41) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.fourtwo);
                    mediaPlayer.start();
                }

                if (position == 42) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.fourthree);
                    mediaPlayer.start();
                }

                if (position == 43) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.fourfour);
                    mediaPlayer.start();
                }

                if (position == 44) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.fourfive);
                    mediaPlayer.start();
                }

                if (position == 45) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.foursix);
                    mediaPlayer.start();
                }

                if (position == 46) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.fourseven);
                    mediaPlayer.start();
                }

                if (position == 47) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.foureigt);
                    mediaPlayer.start();
                }

                if (position == 48) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.fournine);
                    mediaPlayer.start();
                }

                if (position == 49) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.fifty);
                    mediaPlayer.start();
                }

                if (position == 50) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.fiveone);
                    mediaPlayer.start();
                }

                if (position == 51) {
                    mediaPlayer.reset();
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.fivetwo);
                    mediaPlayer.start();
                }

                if (position == 52) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.fivethree);
                    mediaPlayer.start();
                }

                if (position == 53) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.fivefour);
                    mediaPlayer.start();
                }

                if (position == 54) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.fivefive);
                    mediaPlayer.start();
                }

                if (position == 55) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.fivesix);
                    mediaPlayer.start();
                }

                if (position == 56) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.fiveseven);
                    mediaPlayer.start();
                }

                if (position == 57) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.fiveeight);
                    mediaPlayer.start();
                }

                if (position == 58) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.fivenine);
                    mediaPlayer.start();
                }

                if (position == 59) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.sixty);
                    mediaPlayer.start();
                }

                if (position == 60) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.sixone);
                    mediaPlayer.start();
                }

                if (position == 61) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.sixtwo);
                    mediaPlayer.start();
                }

                if (position == 62) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.sixthree);
                    mediaPlayer.start();
                }

                if (position == 63) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.sixfour);
                    mediaPlayer.start();
                }

                if (position == 64) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.sixfive);
                    mediaPlayer.start();
                }

                if (position == 65) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.fivesix);
                    mediaPlayer.start();
                }

                if (position == 66) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.sixseven);
                    mediaPlayer.start();
                }

                if (position == 67) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.sixeight);
                    mediaPlayer.start();
                }

                if (position == 68) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.sixnine);
                    mediaPlayer.start();
                }

                if (position == 69) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.seventy);
                    mediaPlayer.start();
                }

                if (position == 70) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.sevenone);
                    mediaPlayer.start();
                }

                if (position == 71) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.seventwo);
                    mediaPlayer.start();
                }

                if (position == 72) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.seventhree);
                    mediaPlayer.start();
                }

                if (position == 73) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.sevenfour);
                    mediaPlayer.start();
                }

                if (position == 74) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.sevenfive);
                    mediaPlayer.start();
                }

                if (position == 75) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.sevensix);
                    mediaPlayer.start();
                }

                if (position == 76) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.sevenseven);
                    mediaPlayer.start();
                }

                if (position == 77) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.seveneight);
                    mediaPlayer.start();
                }

                if (position == 78) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.sevennine);
                    mediaPlayer.start();
                }

                if (position == 79) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.eithty);
                    mediaPlayer.start();
                }

                if (position == 80) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.eithtone);
                    mediaPlayer.start();
                }

                if (position == 81) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.eighttwo);
                    mediaPlayer.start();
                }

                if (position == 82) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.eightthree);
                    mediaPlayer.start();
                }

                if (position == 83) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.eightfour);
                    mediaPlayer.start();
                }

                if (position == 84) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.eightfive);
                    mediaPlayer.start();
                }

                if (position == 85) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.eightsix);
                    mediaPlayer.start();
                }

                if (position == 86) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.eightseven);
                    mediaPlayer.start();
                }

                if (position == 87) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.eighteight);
                    mediaPlayer.start();
                }

                if (position == 88) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.eightnine);
                    mediaPlayer.start();
                }

                if (position == 89) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.ninty);
                    mediaPlayer.start();
                }

                if (position == 90) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.nineone);
                    mediaPlayer.start();
                }

                if (position == 91) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.ninetwo);
                    mediaPlayer.start();
                }

                if (position == 92) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.ninethree);
                    mediaPlayer.start();
                }

                if (position == 93) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.ninefour);
                    mediaPlayer.start();
                }

                if (position == 94) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.ninefive);
                    mediaPlayer.start();
                }

                if (position == 95) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.ninesix);
                    mediaPlayer.start();
                }

                if (position == 96) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.nineseven);
                    mediaPlayer.start();
                }

                if (position == 97) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.nineeight);
                    mediaPlayer.start();
                }

                if (position == 98) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.ninenin);
                    mediaPlayer.start();
                }

                if (position == 99) {
                    mediaPlayer = MediaPlayer.create(EngThreeLessOneAudio.this, R.raw.hundred);
                    mediaPlayer.start();
                }
            }
        });
    }
}
