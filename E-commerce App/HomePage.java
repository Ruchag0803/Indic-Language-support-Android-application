package com.example.e_commerce_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.e_commerce_application.databinding.ActivityHomePageBinding;

public class HomePage extends AppCompatActivity {
    ActivityHomePageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomePageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Initialize the clothes ImageButton using view binding
        ImageButton clothesButton = binding.clothes;
        ImageButton foodButton = binding.food;
        // Set click listener for the clothes button
        clothesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the ClothesActivity when the clothes button is clicked
                startActivity(new Intent(HomePage.this, clothes.class));
                // Finish the current activity to prevent going back to it when pressing back
                finish();
            }
        });


        foodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the ClothesActivity when the clothes button is clicked
                startActivity(new Intent(HomePage.this, food.class));
                // Finish the current activity to prevent going back to it when pressing back
                finish();
            }
        });

    }
}
