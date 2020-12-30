package com.example.wiki_app.api;

import androidx.lifecycle.MutableLiveData;

import com.example.wiki_app.model.Weapon;

import java.util.List;

public class RagnaWikiApiClient {

    // Live data
    private MutableLiveData<List<Weapon>> weapons;

    private static RagnaWikiApiClient instance;

    public static synchronized RagnaWikiApiClient getInstance(){
        if (instance == null){
            instance = new RagnaWikiApiClient();
        }
        return instance;
    }

    private RagnaWikiApiClient(){
        weapons = new MutableLiveData<>();
    }

    public MutableLiveData<List<Weapon>> getWeapons() {
        return weapons;
    }

    public void requestWeapons(){

    }
}
