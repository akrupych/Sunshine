package com.example.martamax.sunshines;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class WeatherAdapter extends BaseAdapter {

    private final List<String> mList;
    private final Context mContext;

    public WeatherAdapter(Context context, List<String> list) {
        mContext = context;
        mList = list;
    }

    @Override
    public int getCount() {
        return mList.size();
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
        String item = mList.get(position);
        View itemView = convertView;
        if (itemView == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            itemView = inflater.inflate(R.layout.list_item, parent, false);
        }
        TextView textView = (TextView) itemView.findViewById(R.id.text);
        textView.setText(item);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.image);
        if (item.contains("cloud")) {
            imageView.setImageResource(R.drawable.cloud);
        } else if (item.contains("rain")) {
            imageView.setImageResource(R.drawable.rain);
        } else if (item.contains("snow")) {
            imageView.setImageResource(R.drawable.snow);
        }
        else if (item.contains("shine")) {
            imageView.setImageResource(R.drawable.sun);
        }
        return itemView;
    }
}
