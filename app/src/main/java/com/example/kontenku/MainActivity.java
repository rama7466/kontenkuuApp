package com.example.kontenku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        String[] items = {"Judul 1", "Judul 2", "Judul 3"};
        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items));

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent i = new Intent(this, DetailActivity.class);
            i.putExtra("judul", items[position]);
            i.putExtra("konten", "Ini adalah isi dari " + items[position]);
            startActivity(i);
        });
    }
}