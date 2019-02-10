package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

public class DayActivity extends AppCompatActivity {
    ArrayList <ArrayList<String>> week = new ArrayList<>();
    ArrayList<String> d1 = new ArrayList<>();
    ArrayList<String> d2 = new ArrayList<>();
    ArrayList<String> d3 = new ArrayList<>();
    ArrayList<String> d4 = new ArrayList<>();
    ArrayList<String> d5 = new ArrayList<>();
    ArrayList<String> d6 = new ArrayList<>();
    private void initArrays() {
        d1.add("матеша");
        d1.add("матеша");
        d1.add("матеша");
        d1.add("матеша");
        d1.add("матеша");
        d1.add("матеша");
        d1.add("матеша");

        d2.add("матеша");
        d2.add("матеша");
        d2.add("матеша");
        d2.add("матеша");
        d2.add("матеша");
        d2.add("матеша");
        d2.add("матеша");

        d3.add("матеша");
        d3.add("матеша");
        d3.add("матеша");
        d3.add("матеша");
        d3.add("матеша");
        d3.add("матеша");
        d3.add("матеша");

        d4.add("матеша");
        d4.add("матеша");
        d4.add("матеша");
        d4.add("матеша");
        d4.add("матеша");
        d4.add("матеша");
        d4.add("матеша");

        d5.add("матеша");
        d5.add("матеша");
        d5.add("матеша");
        d5.add("матеша");
        d5.add("матеша");
        d5.add("матеша");
        d5.add("матеша");

        d6.add("матеша");
        d6.add("матеша");
        d6.add("матеша");
        d6.add("матеша");
        d6.add("матеша");
        d6.add("матеша");
        d6.add("матеша");

        week.add(d1);
        week.add(d2);
        week.add(d3);
        week.add(d4);
        week.add(d5);
        week.add(d6);



    }

    TextView lesson1;
    TextView lesson2;
    TextView lesson3;
    TextView lesson4;
    TextView lesson5;
    TextView lesson6;
    TextView lesson7;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        Intent intent1 = getIntent();
        int day = intent1.getIntExtra("day", 0);
        initArrays();
        lesson1 = findViewById(R.id.l1);
        lesson2 = findViewById(R.id.l2);
        lesson3 = findViewById(R.id.l3);
        lesson4 = findViewById(R.id.l4);
        lesson5 = findViewById(R.id.l5);
        lesson6 = findViewById(R.id.l6);
        lesson7 = findViewById(R.id.l7);

        lesson1.setText(week.get(day).get(1));
        lesson2.setText(week.get(day).get(2));
        lesson3.setText(week.get(day).get(3));
        lesson4.setText(week.get(day).get(4));
        lesson5.setText(week.get(day).get(5));
        lesson6.setText(week.get(day).get(6));
        lesson7.setText(week.get(day).get(7));

    }
}

