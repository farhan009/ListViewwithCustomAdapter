package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    String[] countryNames;
    int[] flags = {R.drawable.bangladesh, R.drawable.india, R.drawable.usa, R.drawable.germany, R.drawable.canada, R.drawable.london,
            R.drawable.bangladesh, R.drawable.india, R.drawable.usa, R.drawable.germany, R.drawable.canada, R.drawable.london,
            R.drawable.bangladesh, R.drawable.india, R.drawable.usa, R.drawable.germany, R.drawable.canada, R.drawable.london,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView_id);
        countryNames = getResources().getStringArray(R.array.country_names);

        CustomAdapter customAdapter = new CustomAdapter(this, countryNames, flags);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = countryNames[position];
                Toast.makeText(MainActivity.this, value + " " + position, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
