package com.example.assignment5;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    int[] images = {
            R.drawable.instagram, R.drawable.linkedin, R.drawable.messenger, R.drawable.snapchat,
            R.drawable.telegram, R.drawable.threads, R.drawable.twitter, R.drawable.whatsapp, R.drawable.youtube};

    String[] SName, subtitle;
    RecycleAdapter recycleAdapter;
    RecyclerView recyclerView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
         SName = getResources().getStringArray(R.array.Social_Media_array);
        subtitle = getResources().getStringArray(R.array.Social_Media_array_subtitle);

      recycleAdapter = new RecycleAdapter(this, SName, subtitle, images);
        recyclerView.setAdapter(recycleAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}