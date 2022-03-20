package com.example.laitest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView grvThing;
    ArrayList<ElectricThing> arrayList;
    CustomGridView ctAdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grvThing = findViewById(R.id.grvThing);

        arrayList = new ArrayList<>();

        arrayList.add(new ElectricThing("Cap chuyen tu USB sang PS2", 3,
                15, 10000, R.drawable.dauchuyendoi, 20));
        arrayList.add(new ElectricThing("Cap chuyen tu USB sang PS2", 3,
                15, 10000, R.drawable.giacchuyen, 20));
        arrayList.add(new ElectricThing("Cap chuyen tu USB sang PS2", 3,
                15, 10000, R.drawable.dauchuyendoipsps2, 20));
        arrayList.add(new ElectricThing("Cap chuyen tu USB sang PS2", 3,
                15, 10000, R.drawable.daucam, 20));
        arrayList.add(new ElectricThing("Cap chuyen tu USB sang PS2", 3,
                15, 10000, R.drawable.daynguon, 20));
        arrayList.add(new ElectricThing("Cap chuyen tu USB sang PS2", 3,
                15, 10000, R.drawable.carbusbtops2, 20));

        ctAdt = new CustomGridView(MainActivity.this, R.layout.item_gridview, arrayList);

        grvThing.setAdapter(ctAdt);
    }
}