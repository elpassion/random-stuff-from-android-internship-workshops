package com.example.mg6maciej.myworkshopapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

   private List<Person> people = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_layout);
        addPeople();

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(new SpinnerAdapter(people));


//        ViewPager vp = (ViewPager) findViewById(R.id.myPageView);
//        vp.setPageMargin(50);
//        vp.setAdapter(new PagerAdapter(people));
    }

    /*
    @NonNull
    private RecyclerView.Adapter<ViewHolderChild> getAdapter() {
        return new MyAdapter(people);
    }
    */
    private void addPeople() {
        people.addAll(Arrays.asList(
                new Person("N1","LN1"),new Person("N2","LN2"),new Person("L3","LN3"),
                new Person("N4","LN4"),new Person("L5","LN5"),new Person("L6","LN6"),
                new Person("L7","LN7"), new Person("L8","LN8"),new Person("L9","LN9"),
                new Person("N1","LN1"),new Person("N2","LN2"),new Person("L3","LN3"),
                new Person("N4","LN4"),new Person("L5","LN5"),new Person("L6","LN6"),
                new Person("L7","LN7"), new Person("L8","LN8"),new Person("L9","LN9")));
    }


}
