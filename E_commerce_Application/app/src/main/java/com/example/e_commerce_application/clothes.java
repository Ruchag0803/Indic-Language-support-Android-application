package com.example.e_commerce_application;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class clothes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes);

        ImageView homeImageView = findViewById(R.id.home);
        homeImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to navigate to the HomePage activity
                Intent intent = new Intent(clothes.this, HomePage.class);
                // Start the HomePage activity
                startActivity(intent);
            }
        });
    }
}
