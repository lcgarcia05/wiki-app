package com.example.wiki_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.wiki_app.viewmodels.ItemViewModel;

public class MainActivity extends AppCompatActivity {
    private ItemViewModel itemViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemViewModel = new ViewModelProvider(this).get(ItemViewModel.class);
    }
}