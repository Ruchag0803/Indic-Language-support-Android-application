package com.example.e_commerce_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        ImageView homeImageView = findViewById(R.id.home);
        homeImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to navigate to the HomePage activity
                Intent intent = new Intent(food.this, HomePage.class);
                // Start the HomePage activity
                startActivity(intent);
            }
        });
    }
}