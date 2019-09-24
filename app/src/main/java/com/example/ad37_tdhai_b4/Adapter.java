package com.example.ad37_tdhai_b4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {
    List<Singleview>singleviews;

    public Adapter(List<Singleview> singleviews) {
        this.singleviews=singleviews;
    }

    @Override
    public int getCount() {
        return singleviews.size();
    }

    @Override
    public Object getItem(int i) {
        return singleviews.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        view=inflater.inflate(R.layout.item,viewGroup,false);
        TextView phone=view.findViewById(R.id.tvphone);
        TextView date=view.findViewById(R.id.tvdate);

        Singleview singleview=singleviews.get(i);

        phone.setText(singleview.getPhone());
        date.setText(singleview.getDate());

        ImageView imageView=view.findViewById(R.id.imicon);
        return view;
    }
}
