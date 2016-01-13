package com.example.mg6maciej.myworkshopapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<ViewHolderChild> {

    private final List<Person> people;

    public MyAdapter(List<Person> people) {
        this.people = people;
    }

    @Override
    public ViewHolderChild onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.peoplelayout, parent, false);
        return new ViewHolderChild(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderChild holder, int position) {
        Person person = people.get(position);
        holder.name.setText(person.getName());
        holder.surname.setText(person.getLastName());
    }

    @Override
    public int getItemCount() {
        return people.size();
    }
}
