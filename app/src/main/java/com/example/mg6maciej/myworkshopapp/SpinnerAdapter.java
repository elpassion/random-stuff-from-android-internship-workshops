package com.example.mg6maciej.myworkshopapp;

import android.app.LauncherActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SpinnerAdapter extends BaseAdapter {

    List<Person> people = new ArrayList<>();

    @Override
    public int getCount() {
        return people.size();
    }

    @Override
    public Object getItem(int position) {
        return people.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        if (convertView == null) {
            View view = layoutInflater.inflate(android.R.layout.simple_list_item_1, parent, false);
            bindPerson(position, view);
            return view;
        } else {
            return convertView;
        }
    }

    private void bindPerson(int position, View view) {
        TextView text1 = (TextView) view.findViewById(android.R.id.text1);
        Person person = people.get(position);
        text1.setText(person.getName() + " " + person.getLastName());
    }

    public SpinnerAdapter(List<Person> people) {
        this.people = people;
    }
}
