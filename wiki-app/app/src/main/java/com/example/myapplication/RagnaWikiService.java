package com.example.myapplication;

import java.util.List;

import retrofit2.Call;

public interface RagnaWikiService {

    Call<List<Weapon>> getWeapons();
}
