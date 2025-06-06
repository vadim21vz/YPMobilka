package com.example.mdkyp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Favorite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_favorite);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void back(View v){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void home(View v){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void foramina(View v){
        Intent intent = new Intent(this, MyCart.class);
        startActivity(intent);
    }
    public void profile(View v){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
    public void notification(View v){
        Intent intent = new Intent(this, Notification.class);
        startActivity(intent);
    }


}