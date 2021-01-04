package com.example.wiki_app.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.wiki_app.model.Armor;
import com.example.wiki_app.model.Weapon;
import com.example.wiki_app.repository.RagnaWikiRepository;

import java.util.List;

public class ItemViewModel extends ViewModel {

    private final RagnaWikiRepository ragnaWikiRepository;
    private final MutableLiveData<List<Weapon>> weapons;
    private final MutableLiveData<List<Armor>> armors;

    public ItemViewModel() {
        ragnaWikiRepository = new RagnaWikiRepository();
        weapons = ragnaWikiRepository.getWeapons();
        armors = ragnaWikiRepository.getArmors();

    }

    public MutableLiveData<List<Weapon>> getWeapons() {
        return weapons;
    }

    public MutableLiveData<List<Armor>> getArmors() {
        return armors;
    }
}
