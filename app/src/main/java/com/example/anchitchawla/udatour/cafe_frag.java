package com.example.anchitchawla.udatour;
import android.support.v4.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Anchit Chawla on 18-12-2017.
 */

public class cafe_frag extends Fragment {
    public cafe_frag(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list, container, false);
        ArrayList<CustomView> list1=new ArrayList<CustomView>();
        list1.add(new CustomView(getString(R.string.boom),R.drawable.boom));
        list1.add(new CustomView(getString(R.string.veda),R.drawable.veda));
        list1.add(new CustomView(getString(R.string.purple),R.drawable.purple));
        CustomAdapter adapter=new CustomAdapter(getActivity(),list1);
        ListView listView1=(ListView)rootView.findViewById(R.id.mylist);
        listView1.setAdapter(adapter);
        return rootView;
    }

}