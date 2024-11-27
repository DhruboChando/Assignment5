package com.example.assignment4;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        List<DataClass> items = new ArrayList<>();

        items.add(new DataClass("event 1", R.drawable.background));
        items.add(new DataClass("event 2", R.drawable.background));
        items.add(new DataClass("event 3", R.drawable.background));
        items.add(new DataClass("event 4", R.drawable.background));
        items.add(new DataClass("event 5", R.drawable.background));
        items.add(new DataClass("event 6", R.drawable.background));
        items.add(new DataClass("event 7", R.drawable.background));

        RecyclerView recyclerView1 = findViewById(R.id.rv_events);

        recyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView1.setAdapter(new AdapterClass(this, items));
    }
}