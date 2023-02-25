package com.bini.mame.abaoappsforteachingkids;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by Mame on 5/30/2016.
 */
public class EngOnePicture extends PagerAdapter
{
    private int[] image_resource = {R.drawable.aaa, R.drawable.bbb, R.drawable.ccc, R.drawable.ddd, R.drawable.eee, R.drawable.fff, R.drawable.ggg,
            R.drawable.hhh, R.drawable.iii, R.drawable.jjj, R.drawable.kkk, R.drawable.lll, R.drawable.mmm, R.drawable.nnn,
            R.drawable.ooo, R.drawable.ppp, R.drawable.qqq, R.drawable.rrr, R.drawable.sss, R.drawable.ttt, R.drawable.uuu,
            R.drawable.vvv, R.drawable.www, R.drawable.xxx, R.drawable.yyy, R.drawable.zzz};
    private Context context;
    private LayoutInflater inflater;
    private MediaPlayer mediaPlayer;

    public EngOnePicture(Context context)
    {
        this.context = context;
    }

    @Override
    public int getCount() {
        return image_resource.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == object);
    }

    public Object instantiateItem(ViewGroup container, final int position)
    {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = inflater.inflate(R.layout.engswipead, container, false);
        final ImageButton imageButton = (ImageButton) item_view.findViewById(R.id.bnym1);
        imageButton.setImageResource(image_resource[position]);
        container.addView(item_view);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (position == 0) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.aaaa);
                    mediaPlayer.start();
                }

                if (position == 1) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.bbbb);
                    mediaPlayer.start();
                }

                if (position == 2) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.cccc);
                    mediaPlayer.start();
                }

                if (position == 3) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.dddd);
                    mediaPlayer.start();
                }

                if (position == 4) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.eeee);
                    mediaPlayer.start();
                }

                if (position == 5) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.ffff);
                    mediaPlayer.start();
                }

                if (position == 6) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.gggg);
                    mediaPlayer.start();
                }
                if (position == 7) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.hhhh);
                    mediaPlayer.start();
                }

                if (position == 8) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.iiii);
                    mediaPlayer.start();
                }

                if (position == 9) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.jjjj);
                    mediaPlayer.start();
                }

                if (position == 10) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.kkkk);
                    mediaPlayer.start();
                }

                if (position == 11) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.llll);
                    mediaPlayer.start();
                }

                if (position == 12) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.mmmm);
                    mediaPlayer.start();
                }

                if (position == 13) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.nnnn);
                    mediaPlayer.start();
                }
                if (position == 14) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.oooo);
                    mediaPlayer.start();
                }

                if (position == 15) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.pppp);
                    mediaPlayer.start();
                }

                if (position == 16) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.qqqq);
                    mediaPlayer.start();
                }

                if (position == 17) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.rrrr);
                    mediaPlayer.start();
                }

                if (position == 18) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.ssss);
                    mediaPlayer.start();
                }

                if (position == 19) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.tttt);
                    mediaPlayer.start();
                }

                if (position == 20) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.uuuu);
                    mediaPlayer.start();
                }

                if (position == 21) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.vvvv);
                    mediaPlayer.start();
                }

                if (position == 22) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.wwww);
                    mediaPlayer.start();
                }

                if (position == 23) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.xxxx);
                    mediaPlayer.start();
                }

                if (position == 24) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.yyyy);
                    mediaPlayer.start();
                }

                if (position == 25) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.zzzz);
                    mediaPlayer.start();
                }

            }
        });
        return item_view;
    }
    public void destroyItem(ViewGroup container, int position, Object object)
    {
        container.removeView((RelativeLayout) object);
    }
}
