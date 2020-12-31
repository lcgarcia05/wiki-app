package com.example.wiki_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.wiki_app.adapters.WeaponAdapter;
import com.example.wiki_app.api.ApiService;
import com.example.wiki_app.api.RagnaWikiApi;
import com.example.wiki_app.model.Weapon;
import com.example.wiki_app.viewmodels.ItemViewModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private ItemViewModel itemViewModel;
    Button button;

    // RecyclerView
    private RecyclerView recyclerView;
    private WeaponAdapter weaponAdapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        button = findViewById(R.id.button_api);

        recyclerView = findViewById(R.id.weaponRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        weaponAdapter = new WeaponAdapter();
        recyclerView.setAdapter(weaponAdapter);

        itemViewModel = new ViewModelProvider(this).get(ItemViewModel.class);

        requestWeapons();
        ObserveAnyChange();

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                getWeapons();
////                getRetroResponse();
//            }
//        });

    }


    private void ObserveAnyChange(){
        itemViewModel.getWeapons().observe(this, new Observer<List<Weapon>>() {
            @Override
            public void onChanged(List<Weapon> weapons) {
                if (weapons != null) {
                    for (Weapon weapon: weapons){
                        Log.v("Tagy", "Message: " + weapon.getName());

                        weaponAdapter.setWeapons(weapons);
                    }
                }
            }
        });
    }

    private void requestWeapons(){
        itemViewModel.requestWeapons();
    }




//    private void getRetroResponse(){
//        RagnaWikiApi ragnaWikiApi = ApiService.getRagnaWikiApi();
//
//        Call<List<Weapon>> responseCall = ragnaWikiApi.getWeapons();
//
//        responseCall.enqueue(new Callback<List<Weapon>>() {
//            @Override
//            public void onResponse(Call<List<Weapon>> call, Response<List<Weapon>> response) {
//                if (response.code() == 200){
//
//                    List<Weapon> weapons = new ArrayList<>(response.body());
//                    for (Weapon weapon: weapons){
//                        Log.v("Tag", "Weapon Name: " + weapon.getItemId());
//                    }
//                }
//                else{
//                    try{
//                        Log.v("Tag", "Error" + response.errorBody().toString());
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<Weapon>> call, Throwable t) {
//                Log.v("Tag", "Error" + t.getMessage());
//
//            }
//        });
//    }


}