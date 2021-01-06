package com.example.wiki_app.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.wiki_app.R;
import com.example.wiki_app.adapters.ArmorAdapter;
import com.example.wiki_app.adapters.OnItemListener;
import com.example.wiki_app.adapters.WeaponAdapter;
import com.example.wiki_app.model.Armor;
import com.example.wiki_app.model.Weapon;
import com.example.wiki_app.viewmodels.ItemViewModel;

import java.util.ArrayList;
import java.util.List;

public class ArmorActivity extends AppCompatActivity  implements OnItemListener {

    private ItemViewModel itemViewModel;
    private ArmorAdapter armorAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armor);

        // RecyclerView
        RecyclerView recyclerView = findViewById(R.id.armor_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        armorAdapter = new ArmorAdapter(new ArrayList<>(), this);
        recyclerView.setAdapter(armorAdapter);
        itemViewModel = new ViewModelProvider(this).get(ItemViewModel.class);
        ObserveAnyChange();


    }

    private void ObserveAnyChange(){
        itemViewModel.getArmors().observe(this, new Observer<List<Armor>>() {
            @Override
            public void onChanged(List<Armor> armors) {
                if (armors != null) {
                    for (Armor armor: armors){
                        Log.v("Tag", "Message: " + armor.getItemName());

                        armorAdapter.setArmors(armors);
                    }
                }
            }
        });
    }

    @Override
    public void onItemClick(int pos) {
        Log.v("Tag", "OnItemClick: clicked!" );
        Toast.makeText(this,"You clicked this", Toast.LENGTH_SHORT).show();
//        Bundle bundle = new Bundle();
//        bundle.putParcelable("armor", armorAdapter.getSelectedArmor(pos));
//        ArmorDetails armorDetails = new ArmorDetails();
//        armorDetails.setArguments(bundle);
//        FragmentManager fm = getSupportFragmentManager();
//        fm.beginTransaction().add(R.id.armor_layout, armorDetails).addToBackStack(null).commit();

        ArmorDetails armorDetails = ArmorDetails
                .newInstance(armorAdapter.getSelectedArmor(pos));

        getSupportFragmentManager().beginTransaction().replace(R.id.armor_layout, armorDetails)
                .addToBackStack(null)
                .commit();

    }
}