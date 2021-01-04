package com.example.wiki_app.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.wiki_app.R;
import com.example.wiki_app.model.Armor;


public class MainActivity extends AppCompatActivity{
    private Button button;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button_weapon);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        button2 = findViewById(R.id.button_armor);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
    }

    private void openActivity2() {
        Intent intent = new Intent(this, WeaponActivity.class);
        startActivity(intent);
    }

    private void openActivity3() {
        Intent intent = new Intent(this, ArmorActivity.class);
        startActivity(intent);
    }
}