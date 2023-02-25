package com.bini.mame.abaoappsforteachingkids;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

/**
 * Created by Mame on 3/26/2016.
 */
public class SwipeAdapterOne extends PagerAdapter {

    private int[] image_resource = {R.drawable.aa, R.drawable.bb, R.drawable.cc, R.drawable.dd, R.drawable.ee, R.drawable.ff, R.drawable.gg,
            R.drawable.hh, R.drawable.ii, R.drawable.jj, R.drawable.kk, R.drawable.ll, R.drawable.mm, R.drawable.nn,
            R.drawable.oo, R.drawable.pp, R.drawable.qq, R.drawable.rr, R.drawable.ss, R.drawable.tt, R.drawable.uu,
            R.drawable.vv, R.drawable.ww, R.drawable.xx, R.drawable.yy, R.drawable.zz};
    private Context context;
    private LayoutInflater inflater;
    private MediaPlayer mediaPlayer;

    public SwipeAdapterOne(Context context)
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
        View item_view = inflater.inflate(R.layout.afan_one_swipe_view_one, container, false);
        final ImageButton imageButton = (ImageButton) item_view.findViewById(R.id.sv1);
        imageButton.setImageResource(image_resource[position]);
        container.addView(item_view);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (position == 0) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.aaa);
                    mediaPlayer.start();
                }

                if (position == 1) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.bbb);
                    mediaPlayer.start();
                }

                if (position == 2) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.ccc);
                    mediaPlayer.start();
                }

                if (position == 3) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.ddd);
                    mediaPlayer.start();
                }

                if (position == 4) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.eee);
                    mediaPlayer.start();
                }

                if (position == 5) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.fff);
                    mediaPlayer.start();
                }

                if (position == 6) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.ggg);
                    mediaPlayer.start();
                }
                if (position == 7) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.hhh);
                    mediaPlayer.start();
                }

                if (position == 8) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.iii);
                    mediaPlayer.start();
                }

                if (position == 9) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.jjj);
                    mediaPlayer.start();
                }

                if (position == 10) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.kkk);
                    mediaPlayer.start();
                }

                if (position == 11) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.lll);
                    mediaPlayer.start();
                }

                if (position == 12) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.mmm);
                    mediaPlayer.start();
                }

                if (position == 13) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.nnn);
                    mediaPlayer.start();
                }
                if (position == 14) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.ooo);
                    mediaPlayer.start();
                }

                if (position == 15) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.ppp);
                    mediaPlayer.start();
                }

                if (position == 16) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.qqq);
                    mediaPlayer.start();
                }

                if (position == 17) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.rrr);
                    mediaPlayer.start();
                }

                if (position == 18) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.sss);
                    mediaPlayer.start();
                }

                if (position == 19) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.ttt);
                    mediaPlayer.start();
                }

                if (position == 20) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.uuu);
                    mediaPlayer.start();
                }

                if (position == 21) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.vvv);
                    mediaPlayer.start();
                }

                if (position == 22) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.www);
                    mediaPlayer.start();
                }

                if (position == 23) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.xxx);
                    mediaPlayer.start();
                }

                if (position == 24) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.yyy);
                    mediaPlayer.start();
                }

                if (position == 25) {
                    mediaPlayer = MediaPlayer.create(context, R.raw.zzz);
                    mediaPlayer.start();
                }
            }
        });
        return item_view;
    }
    public void destroyItem(ViewGroup container, int position, Object object)
    {
       // mediaPlayer.release();
        container.removeView((LinearLayout) object);
    }
}
