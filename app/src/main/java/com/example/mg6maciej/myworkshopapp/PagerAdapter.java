package com.example.mg6maciej.myworkshopapp;

import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PagerAdapter extends android.support.v4.view.PagerAdapter {

    private List<Person> people = new ArrayList<>();

    public PagerAdapter(List<Person> people) {
        this.people = people;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater layoutInflater = LayoutInflater.from(container.getContext());
        View view = layoutInflater.inflate(R.layout.peoplelayout, container, false);
        container.addView(view);
        bindPerson(position, view);
        return view;
    }

    private void bindPerson(int position, View view) {
        TextView name = (TextView) view.findViewById(R.id.name);
        TextView lastName = (TextView) view.findViewById(R.id.surname);
        Person person = people.get(position);
        name.setText(person.getName());
        lastName.setText(person.getLastName());
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return people.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
