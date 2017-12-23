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

public class hotels_frag extends Fragment {
    public hotels_frag(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list, container, false);
        ArrayList<CustomView> list1=new ArrayList<CustomView>();
        list1.add(new CustomView(getString(R.string.jw),R.drawable.mariott));
        list1.add(new CustomView(getString(R.string.taj),R.drawable.taj));
        list1.add(new CustomView(getString(R.string.hyatt),R.drawable.hyatt));
        list1.add(new CustomView(getString(R.string.bella),R.drawable.bella));
        CustomAdapter adapter=new CustomAdapter(getActivity(),list1);
        ListView listView1=(ListView)rootView.findViewById(R.id.mylist);
        listView1.setAdapter(adapter);
        return rootView;
    }

}
