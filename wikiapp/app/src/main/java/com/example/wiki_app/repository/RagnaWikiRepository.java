package com.example.wiki_app.repository;

import androidx.lifecycle.MutableLiveData;

import com.example.wiki_app.api.RagnaWikiApiClient;
import com.example.wiki_app.model.Weapon;

import java.util.List;

public class RagnaWikiRepository {

    private final RagnaWikiApiClient ragnaWikiApiClient;
    private static RagnaWikiRepository instance;

    public static synchronized RagnaWikiRepository getInstance(){
        if (instance == null){
            instance = new RagnaWikiRepository();
        }
        return instance;
    }

    private RagnaWikiRepository(){
        ragnaWikiApiClient = RagnaWikiApiClient.getInstance();
    }

    public MutableLiveData<List<Weapon>> getWeapons() {
        return ragnaWikiApiClient.getWeapons();
    }

    public void requestWeapons(){
        ragnaWikiApiClient.requestWeapons();
    }
}
