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
 * Created by Mame on 5/2/2016.
 */

public class AfanOneSwipeAdapterLessTwo extends PagerAdapter
{
    private int[] image_resource = {R.drawable.abc, R.drawable.speaker, R.drawable.abc, R.drawable.afan_oromo, R.drawable.abc, R.drawable.afan_oromo, R.drawable.abc};
     private Context context;
     private LayoutInflater inflater;
     private MediaPlayer mediaPlayer;

     public AfanOneSwipeAdapterLessTwo(Context context)
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
     View item_view = inflater.inflate(R.layout.swipe_view_two, container, false);
     final ImageButton imageButton = (ImageButton) item_view.findViewById(R.id.meron);
     imageButton.setImageResource(image_resource[position]);
     container.addView(item_view);
     imageButton.setOnClickListener(new View.OnClickListener() {

     @Override
     public void onClick(View v) {

     if (position == 0) {
     mediaPlayer = MediaPlayer.create(context, R.raw.a);
     mediaPlayer.start();
     }

     if (position == 1) {

     mediaPlayer.reset();
     mediaPlayer = MediaPlayer.create(context, R.raw.b);
     mediaPlayer.start();
     }

     if (position == 2) {

     mediaPlayer.reset();
     mediaPlayer = MediaPlayer.create(context, R.raw.c);
     mediaPlayer.start();
     }

     if (position == 3) {

     mediaPlayer.reset();
     mediaPlayer = MediaPlayer.create(context, R.raw.d);
     mediaPlayer.start();
     }

     if (position == 4) {

     mediaPlayer.reset();
     mediaPlayer = MediaPlayer.create(context, R.raw.e);
     mediaPlayer.start();
     }

     if (position == 5) {

     mediaPlayer.reset();
     mediaPlayer = MediaPlayer.create(context, R.raw.f);
     mediaPlayer.start();
     }

     if (position == 6) {

     mediaPlayer.reset();
     mediaPlayer = MediaPlayer.create(context, R.raw.g);
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
