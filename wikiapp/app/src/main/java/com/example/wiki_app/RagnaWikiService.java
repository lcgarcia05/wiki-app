package com.example.wiki_app;

import java.util.List;

import retrofit2.Call;

public interface RagnaWikiService {

    Call<List<Weapon>> getWeapons();

    Call<List<Armor>> getArmors();

    Call<List<Card>> getCards();

    Call<List<Healing>> getHealings();

    Call<List<Ammo>> getAmmos();

    Call<List<Misc>> getMiscs();

    Call<List<PetArmor>> getPetArmors();

    Call<List<Taming>> getTamings();

    Call<List<Usable>> getUsables();

}
