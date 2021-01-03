package com.example.wiki_app.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.wiki_app.R;
import com.example.wiki_app.adapters.OnItemListener;
import com.example.wiki_app.adapters.WeaponAdapter;

import com.example.wiki_app.model.Weapon;
import com.example.wiki_app.viewmodels.ItemViewModel;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements OnItemListener{
    private ItemViewModel itemViewModel;

    private WeaponAdapter weaponAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // RecyclerView
        RecyclerView recyclerView = findViewById(R.id.weapon_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        weaponAdapter = new WeaponAdapter(new ArrayList<>(), this);
        recyclerView.setAdapter(weaponAdapter);

        itemViewModel = new ViewModelProvider(this).get(ItemViewModel.class);

        ObserveAnyChange();
    }


    private void ObserveAnyChange(){
        itemViewModel.getWeapons().observe(this, new Observer<List<Weapon>>() {
            @Override
            public void onChanged(List<Weapon> weapons) {
                if (weapons != null) {
                    for (Weapon weapon: weapons){
                        Log.v("Tag", "Message: " + weapon.getName());

                        weaponAdapter.setWeapons(weapons);
                    }
                }
            }
        });
    }



    @Override
    public void onItemClick(int pos) {
        Log.v("Tag", "OnItemClick: clicked!");
        Toast.makeText(this,"You clicked this item!", Toast.LENGTH_SHORT).show();
    }
}