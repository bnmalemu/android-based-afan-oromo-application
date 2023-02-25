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
public class UfataBorana extends PagerAdapter
{
    private int[] image_resource = {R.drawable.ab1, R.drawable.ab2, R.drawable.ab3, R.drawable.ab4, R.drawable.ab7, R.drawable.ab11, R.drawable.ab13, R.drawable.ab14};
    private Context context;
    private LayoutInflater inflater;
    public UfataBorana(Context context)
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
        View item_view = inflater.inflate(R.layout.ufata_borana, container, false);
        final ImageButton imageButton = (ImageButton) item_view.findViewById(R.id.meti3);
        imageButton.setImageResource(image_resource[position]);
        container.addView(item_view);
        return item_view;
    }
    public void destroyItem(ViewGroup container, int position, Object object)
    {
        container.removeView((LinearLayout) object);
    }
}
