package com.bini.mame.abaoappsforteachingkids;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mame on 6/9/2016.
 */
public class AfanOneNameOne extends ArrayAdapter {
    List list = new ArrayList();
    public AfanOneNameOne(Context context, int resource) {
        super(context, resource);
    }
    static class LayoutHandler
    {
        private TextView lakk;
        private TextView qabx;
        private TextView guyya;
    }

    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        LayoutHandler layoutHandler;
        if (row == null)
        {
            LayoutInflater layoutInflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = layoutInflater.inflate(R.layout.afan_list_one, parent, false);
            layoutHandler = new LayoutHandler();
            layoutHandler.lakk = (TextView) row.findViewById(R.id.jmb2);
            layoutHandler.qabx = (TextView) row.findViewById(R.id.jmb3);
            layoutHandler.guyya = (TextView) row.findViewById(R.id.jmb4);
            row.setTag(layoutHandler);
        }
        else
        {
            layoutHandler = (LayoutHandler) row.getTag();
        }
        DataProviders dataProviders = (DataProviders) this.getItem(position);
        layoutHandler.lakk.setText(dataProviders.getNumber().toString());
        layoutHandler.qabx.setText(dataProviders.getPoints().toString());
        layoutHandler.guyya.setText(dataProviders.getDate().toString());
        return row;
    }
}
