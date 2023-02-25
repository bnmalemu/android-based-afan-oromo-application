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
 * Created by Mame on 5/3/2016.
 */
public class SenaWalaga extends PagerAdapter
{
    private int[] image_resource = {R.drawable.nq1, R.drawable.nq2, R.drawable.nq3, R.drawable.nq4, R.drawable.nq5, R.drawable.nq6, R.drawable.nq7, R.drawable.nq8};
    private Context context;
    private LayoutInflater inflater;
    public SenaWalaga(Context context)
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
        View item_view = inflater.inflate(R.layout.sena_walaga, container, false);
        final ImageButton imageButton = (ImageButton) item_view.findViewById(R.id.meq4);
        imageButton.setImageResource(image_resource[position]);
        container.addView(item_view);
        return item_view;
    }
    public void destroyItem(ViewGroup container, int position, Object object)
    {
        // mediaPlayer.release();
        container.removeView((LinearLayout) object);
    }
}
