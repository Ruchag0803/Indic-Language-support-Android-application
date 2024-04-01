package com.example.e_commerce_application;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.e_commerce_application.databinding.ActivitySignUpBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.UserProfileChangeRequest;

public class SignUp extends AppCompatActivity {
    ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUp.this, MainActivity.class));
                finish();
            }
        });

        binding.registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = binding.editTextFirstName.getText().toString();
                String lastName = binding.editTextLastName.getText().toString();
                String email = binding.editTextEmail.getText().toString();
                String phoneNumber = binding.editTextPhone.getText().toString();
                String password = binding.pRegPassword.getText().toString();

                createAccount(firstName, email, password);
            }
        });
    }

    private void createAccount(String name, String email, String password) {
        FirebaseAuth fAuth = FirebaseAuth.getInstance();
        ProgressDialog progressDialog = new ProgressDialog(SignUp.this);
        progressDialog.setTitle("Creating");
        progressDialog.setMessage("Account");
        progressDialog.show();

        fAuth.createUserWithEmailAndPassword(email.trim(), password.trim())
                .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        UserProfileChangeRequest profileChangeRequest = new UserProfileChangeRequest.Builder()
                                .setDisplayName(name).build();
                        FirebaseAuth.getInstance().getCurrentUser().updateProfile(profileChangeRequest);
                        progressDialog.dismiss();
                        Toast.makeText(SignUp.this, "Account Created", Toast.LENGTH_SHORT).show();

                        // Clear input fields after successful account creation
                        binding.editTextFirstName.setText("");
                        binding.editTextLastName.setText("");
                        binding.editTextEmail.setText("");
                        binding.editTextPhone.setText("");
                        binding.pRegPassword.setText("");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        progressDialog.dismiss();
                        Toast.makeText(SignUp.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
