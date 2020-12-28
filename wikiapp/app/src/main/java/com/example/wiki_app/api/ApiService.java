package com.example.wiki_app.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiService {
    private static Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
            .baseUrl(RagnaWikiApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = retrofitBuilder.build();
    private static RagnaWikiApi ragnaWikiApi = retrofit.create(RagnaWikiApi.class);

    public static RagnaWikiApi getRagnaWikiApi() {
        return ragnaWikiApi;
    }
}


