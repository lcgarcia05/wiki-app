package com.example.wiki_app.api;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.wiki_app.AppExecutors;
import com.example.wiki_app.model.Weapon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import retrofit2.Call;
import retrofit2.Response;

public class RagnaWikiApiClient {

    // Live data
    private MutableLiveData<List<Weapon>> weapons;

    private static RagnaWikiApiClient instance;

    // Weapon runnable request
    private RequestWeaponRunnable requestWeaponsRunnable;
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
        if (requestWeaponsRunnable != null){
            requestWeaponsRunnable = null;
        }

        requestWeaponsRunnable = new RequestWeaponRunnable();

        final Future myHandler = AppExecutors.getInstance().networkIO().submit(requestWeaponsRunnable);
        AppExecutors.getInstance().networkIO().schedule(new Runnable() {
            @Override
            public void run() {
                myHandler.cancel(true);
            }
        }, 5000, TimeUnit.MILLISECONDS);
    }

    private class RequestWeaponRunnable implements Runnable{
        boolean cancelRequest;

        public RequestWeaponRunnable(){
            cancelRequest = false;
        }

        @Override
        public void run() {
            try {
                Response response = getWeapons().execute();
                if (cancelRequest){
                    return;
                }
                if (response.code() == 200){
                    List<Weapon> list = new ArrayList<>();
                    weapons.postValue(list);
                }
                else{
                    String error = response.errorBody().string();
                    Log.v("Tag", "Error" + error);
                    weapons.postValue(null);
                }
            } catch (IOException e) {
                e.printStackTrace();
                weapons.postValue(null);
            }
        }

        // Request for movies
        private Call<List<Weapon>> getWeapons(){
            return ApiService.getRagnaWikiApi().getWeapons();
        }

        private void cancelRequest(){
            Log.v("Tag", "Cancelling request");
            cancelRequest = true;
        }

    }
}
