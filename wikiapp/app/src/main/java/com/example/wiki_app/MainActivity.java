package com.example.wiki_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.wiki_app.model.Weapon;
import com.example.wiki_app.viewmodels.ItemViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ItemViewModel itemViewModel;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button_test);
        itemViewModel = new ViewModelProvider(this).get(ItemViewModel.class);

        ObserveAnyChange();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getWeapons();
            }
        });

    }

    private void ObserveAnyChange(){
        itemViewModel.getWeapons().observe(this, new Observer<List<Weapon>>() {
            @Override
            public void onChanged(List<Weapon> weapons) {
                if (weapons != null){
                    for (Weapon weapon: weapons){
                        Log.v("Tag", "onChanged" + weapon.getName());
                    }
                }
            }
        });
    }

    private void getWeapons(){
        itemViewModel.requestWeapons();
    }
}