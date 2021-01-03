package com.example.wiki_app.repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.wiki_app.api.ApiService;
import com.example.wiki_app.api.RagnaWikiApi;
import com.example.wiki_app.model.Armor;
import com.example.wiki_app.model.Weapon;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RagnaWikiRepository {
    private final RagnaWikiApi ragnaWikiApi;

    public RagnaWikiRepository() {
        ragnaWikiApi = ApiService.getRetrofitInstance().create(RagnaWikiApi.class);
    }

    public MutableLiveData<List<Weapon>> getWeapons() {
        final MutableLiveData<List<Weapon>> data = new MutableLiveData<>();
        ragnaWikiApi.getWeapons().enqueue(new Callback<List<Weapon>>() {
            @Override
            public void onResponse(Call<List<Weapon>> call, Response<List<Weapon>> response) {
                if (response.body() != null){
                    Log.v("Tag", "Received: " + response.body().get(0));
                    data.setValue(response.body());
                }
            }
            @Override
            public void onFailure(Call<List<Weapon>> call, Throwable t) {
                Log.v("Tag", "Error" + t.getMessage());
                data.setValue(null);
            }
        });
        return data;
    }

    public MutableLiveData<List<Armor>> getArmors(){
        final MutableLiveData<List<Armor>> data = new MutableLiveData<>();
        ragnaWikiApi.getArmors().enqueue(new Callback<List<Armor>>() {
            @Override
            public void onResponse(Call<List<Armor>> call, Response<List<Armor>> response) {
                if (response.body() != null){
                    Log.v("Tag", "Receieved: "+ response.body());
                    data.setValue(response.body());
                }
            }
            @Override
            public void onFailure(Call<List<Armor>> call, Throwable t) {
                Log.v("Tag", "Error" + t.getMessage());
                data.setValue(null);
            }
        });
        return data;
    }

}
