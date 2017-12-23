package com.example.anchitchawla.udatour;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Anchit Chawla on 28-11-2017.
 */

public class CustomAdapter extends ArrayAdapter<CustomView> {


    public CustomAdapter(Activity historic, ArrayList<CustomView> list) {
        super(historic,0,list);
    }


    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view=convertView;
        if(view ==null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.customlist, parent, false);
        }
        CustomView musictaste=getItem(position);
        TextView textView=(TextView)view.findViewById(R.id.textView);
        textView.setText(musictaste.getName());
        ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
        imageView.setImageResource(musictaste.getImg());
        return view;
    }
}
