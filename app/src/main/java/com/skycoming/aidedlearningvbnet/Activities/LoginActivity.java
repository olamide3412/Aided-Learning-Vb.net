package com.skycoming.aidedlearningvbnet.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.skycoming.aidedlearningvbnet.R;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    TextInputLayout editEmail, editPass;
    ProgressBar progressBar;
    Button login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Objects.requireNonNull(getSupportActionBar()).hide();
        login_btn = findViewById(R.id.login_btn);
        editEmail = findViewById(R.id.email);
        editPass = findViewById(R.id.password);
        progressBar = findViewById(R.id.login_progressBar);

        login_btn.setOnClickListener(view -> {

            editEmail.setError(null);
            editPass.setError(null);

            String email, password;
            email = editEmail.getEditText().getText().toString();
            password = editPass.getEditText().getText().toString();

            if (email.isEmpty()){
                editEmail.setError("Username required");
                Toast.makeText(this, "Username required to sign in", Toast.LENGTH_SHORT).show();
                return;
            }
            if (password.isEmpty()){
                editPass.setError("Password Required");
                Toast.makeText(this, "Password required to sign in", Toast.LENGTH_SHORT).show();

                return;
            }

            progressBar.setVisibility(View.VISIBLE);

            if (email.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")){

                new Handler(Looper.myLooper()).postDelayed(() -> {
                    if (progressBar.getVisibility() == View.VISIBLE){
                        progressBar.setVisibility(View.GONE);
                    }
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                },2000);


            } else {
                editEmail.setError("Invalid Credential");
                editPass.setError("Invalid Credential");
                progressBar.setVisibility(View.GONE);
            }


        });
    }
}