package com.example.lab7_b2_lttbdd_th;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    DiadiemAdapter adapter;
    ArrayList<Diadiem> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =findViewById(R.id.idListView);
        arrayList = new ArrayList<>();
        arrayList.add(new Diadiem("Da lat"));
        arrayList.add(new Diadiem("Buon Me Thuoc"));
        arrayList.add(new Diadiem("Can Tho"));
        adapter = new DiadiemAdapter(this,R.layout.items,arrayList);
        listView.setAdapter(adapter);

    }
}