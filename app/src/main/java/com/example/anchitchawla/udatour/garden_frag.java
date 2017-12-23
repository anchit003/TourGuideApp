package com.example.anchitchawla.udatour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Anchit Chawla on 18-12-2017.
 */

public class garden_frag  extends Fragment {
    public garden_frag(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list, container, false);
        ArrayList<CustomView> list1=new ArrayList<CustomView>();
        list1.add(new CustomView(getString(R.string.rock),R.drawable.rock));
        list1.add(new CustomView(getString(R.string.rose),R.drawable.rose));
        list1.add(new CustomView(getString(R.string.sukhna),R.drawable.sukhna));
        CustomAdapter adapter=new CustomAdapter(getActivity(),list1);
        ListView listView1=(ListView)rootView.findViewById(R.id.mylist);
        listView1.setAdapter(adapter);
        return rootView;
    }
}
