package com.example.foodgrid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustGridAdapter extends BaseAdapter {

    Context c;
    String[] foodname;
    int[] foodimg;
    LayoutInflater inflater;

    public CustGridAdapter(Context applicationContext, String[] foodname, int[] foodimg) {
        c=applicationContext;
        this.foodimg = foodimg;
        this.foodname = foodname;
    }

    @Override
    public int getCount() {
        return foodname.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        inflater = LayoutInflater.from(c);
        view = inflater.inflate(R.layout.custgrid,null);
        TextView tv = (TextView) view.findViewById(R.id.textView4);
        ImageView iv = (ImageView) view.findViewById(R.id.imageView2);
        tv.setText(foodname[i]);
        iv.setImageResource(foodimg[i]);
        return view;
    }
}
