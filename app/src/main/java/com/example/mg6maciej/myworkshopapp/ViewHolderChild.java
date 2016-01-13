package com.example.mg6maciej.myworkshopapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ViewHolderChild extends RecyclerView.ViewHolder {

    public final TextView name;
    public final TextView surname;

    public ViewHolderChild(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.name);
        surname = (TextView) itemView.findViewById(R.id.surname);
    }
}
