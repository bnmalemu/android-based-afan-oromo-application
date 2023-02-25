package com.bini.mame.abaoappsforteachingkids;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by Mame on 5/3/2016.
 */
public class NyataWallaga extends PagerAdapter
{
    private int[] image_resource = {R.drawable.wl1, R.drawable.wl2, R.drawable.wl4, R.drawable.wl5, R.drawable.wl6, R.drawable.wl7, R.drawable.wl8};
    private Context context;
    private LayoutInflater inflater;
    public NyataWallaga(Context context)
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
        View item_view = inflater.inflate(R.layout.nyata_walaga, container, false);
        final ImageButton imageButton = (ImageButton) item_view.findViewById(R.id.me9);
        imageButton.setImageResource(image_resource[position]);
        container.addView(item_view);
        return item_view;
    }
    public void destroyItem(ViewGroup container, int position, Object object)
    {
        container.removeView((RelativeLayout) object);
    }
}
