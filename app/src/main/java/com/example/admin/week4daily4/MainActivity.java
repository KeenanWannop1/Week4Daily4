package com.example.admin.week4daily4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.admin.week4daily4.model.Venue;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Venue> venueList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<Venue> adapter = new ArrayAdapter<Venue>(
                this, android.R.layout.simple_list_item_1,
                venueList);
        )

        ListView listView = (ListView) findViewById(R.id.store_list);
        listView.setAdapter(adapter);

    }

}

