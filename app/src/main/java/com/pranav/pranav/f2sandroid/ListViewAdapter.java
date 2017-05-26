package com.pranav.pranav.f2sandroid;

import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Pranav on 5/25/2017.
 */

public class ListViewAdapter implements ListAdapter {
    private List<BloodList> data;

    public ListViewAdapter(List<BloodList> devices) {

        this.data=devices;
    }



    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return data.size();
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
    public boolean hasStableIds() {
        return false;
    }

    public View getView(int position, View view, ViewGroup parent) {
        if(view==null) {
            //Only creates new view when recycling isn't possible
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            view=inflater.inflate(R.layout.listitem,parent, false);
        }

        BloodList thisBL=data.get(position);
        TextView name = (TextView) view.findViewById(R.id.name);
        name.setText(thisBL.name);

        TextView distance = (TextView) view.findViewById(R.id.distance);
        distance.setText(thisBL.distance);
        TextView gender = (TextView) view.findViewById(R.id.gender);
        gender.setText(thisBL.gender);
        TextView bloodgrp  = (TextView) view.findViewById(R.id.bloodgrp);
        bloodgrp.setText(thisBL.bloodgrp);

        return view;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 4;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int position) {
        return false;
    }
}

