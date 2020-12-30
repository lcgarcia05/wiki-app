package com.example.wiki_app.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.wiki_app.model.Weapon;
import com.example.wiki_app.repository.RagnaWikiRepository;

import java.util.List;

public class ItemViewModel extends ViewModel {

    private final RagnaWikiRepository ragnaWikiRepository;

    public ItemViewModel(){
        ragnaWikiRepository = RagnaWikiRepository.getInstance();
    }

    public MutableLiveData<List<Weapon>> getWeapons() {
        return ragnaWikiRepository.getWeapons();
    }

    public void requestWeapons(){
        ragnaWikiRepository.requestWeapons();
    }
}
