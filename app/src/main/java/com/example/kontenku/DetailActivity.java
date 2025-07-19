package com.example.kontenku;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView judul = findViewById(R.id.judul);
        TextView konten = findViewById(R.id.konten);

        judul.setText(getIntent().getStringExtra("judul"));
        konten.setText(getIntent().getStringExtra("konten"));
    }
}