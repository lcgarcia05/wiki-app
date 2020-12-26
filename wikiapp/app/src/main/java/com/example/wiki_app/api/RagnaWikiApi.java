package com.example.wiki_app.api;

import com.example.wiki_app.model.Ammo;
import com.example.wiki_app.model.Armor;
import com.example.wiki_app.model.Card;
import com.example.wiki_app.model.Healing;
import com.example.wiki_app.model.Misc;
import com.example.wiki_app.model.PetArmor;
import com.example.wiki_app.model.Taming;
import com.example.wiki_app.model.Usable;
import com.example.wiki_app.model.Weapon;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RagnaWikiApi {
    // API base url
    public static final String BASE_URL="https://ragnarokwiki.herokuapp.com/api/";

    // Method for getting the list of weapons from the api
    @GET("weapons")
    Call<List<Weapon>> getWeapons();

    // Method for getting a single weapon from the api
    @GET("weapons/id")
    Call<Weapon> getSingleWeapon(@Path("id") Integer itemId);

    // Method for getting the list of armors from the api
    @GET("armors")
    Call<List<Armor>> getArmors();

    // Method for getting a single armor from the api
    @GET("armors/id")
    Call<Armor> getSingleArmor(@Path("id") Integer itemId);

    // Method for getting the list of cards from the api
    @GET("cards")
    Call<List<Card>> getCards();

    // Method for getting a single card from the api
    @GET("cards/id")
    Call<Card> getSingleCard(@Path("id") Integer itemId);

    // Method for getting the list of healing items from the api
    @GET("healings")
    Call<List<Healing>> getHealings();

    // Method for getting a single healing item from the api
    @GET("healings/id")
    Call<Healing> getSingleHealing(@Path("id") Integer itemId);

    // Method for getting the list of ammos from the api
    @GET("ammos")
    Call<List<Ammo>> getAmmos();

    // Method for getting a single ammo from the api
    @GET("ammos/id")
    Call<Ammo> getSingleAmmo(@Path("id") Integer itemId);

    // Method for getting the list of miscellaneous items from the api
    @GET("miscs")
    Call<List<Misc>> getMiscs();

    // Method for getting a single miscellaneous item from the api
    @GET("miscs/id")
    Call<Misc> getSingleMisc(@Path("id") Integer itemId);

    // Method for getting the list of pet armors from the api
    @GET("petarmors")
    Call<List<PetArmor>> getPetArmors();

    // Method for getting a single pet armor from the api
    @GET("petarmors/id")
    Call<PetArmor> getSinglePArmor(@Path("id") Integer itemId);

    // Method for getting the list of taming items from the api
    @GET("tamings")
    Call<List<Taming>> getTamings();

    // Method for getting a single taming item from the api
    @GET("tamings/id")
    Call<Taming> getSingleTaming(@Path("id") Integer itemId);

    // Method for getting the list of usable items from the api
    @GET("usables")
    Call<List<Usable>> getUsables();

    // Method for getting a single usable item from the api
    @GET("usables/id")
    Call<Usable> getSingleUsable(@Path("id") Integer itemId);

}
