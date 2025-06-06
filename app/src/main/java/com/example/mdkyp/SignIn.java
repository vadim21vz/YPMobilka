package com.example.mdkyp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_in);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void onClick (View v) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void Back (View v) {
        Intent intent = new Intent(this, Onboard3.class);
        startActivity(intent);
    }

    public void Register (View v) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }

    public void Password (View v) {
        Intent intent = new Intent(this, Password.class);
        startActivity(intent);
    }
}