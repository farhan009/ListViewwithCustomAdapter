package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    String[] countryNames;
    int[] flags;
    Context context;
    private LayoutInflater inflater;

    CustomAdapter(Context context, String[] countryNames, int[] flags){
        this.countryNames = countryNames;
        this.flags = flags;
        this.context = context;
    }

    @Override
    public int getCount() {
        return countryNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.sample_view, parent, false);

            TextView textView = convertView.findViewById(R.id.sample_view_TextView_id);
            ImageView imageView = convertView.findViewById(R.id.sample_view_imageView_Id);

            textView.setText(countryNames[position]);
            imageView.setImageResource(flags[position]);
        }

        return convertView;
    }
}
