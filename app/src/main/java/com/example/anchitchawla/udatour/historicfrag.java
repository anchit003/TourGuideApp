package com.example.anchitchawla.udatour;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by Anchit Chawla on 29-11-2017.
 */

public class historicfrag extends Fragment {
    public historicfrag(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list, container, false);
        ArrayList<CustomView> list1=new ArrayList<CustomView>();
        list1.add(new CustomView(getString(R.string.bbq),R.drawable.bbq_nation));
        list1.add(new CustomView(getString(R.string.ghazal),R.drawable.ghazal));
        list1.add(new CustomView(getString(R.string.bre),R.drawable.brew_estate));
        CustomAdapter adapter=new CustomAdapter(getActivity(),list1);
        ListView listView1=(ListView)rootView.findViewById(R.id.mylist);
        listView1.setAdapter(adapter);
        return rootView;
    }

}
