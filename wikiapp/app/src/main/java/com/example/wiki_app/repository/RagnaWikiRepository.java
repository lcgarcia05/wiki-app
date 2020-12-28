package com.example.wiki_app.repository;

public class RagnaWikiRepository {

    private static RagnaWikiRepository instance;

    public static synchronized RagnaWikiRepository getInstance(){
        if (instance == null){
            instance = new RagnaWikiRepository();
        }
        return instance;
    }
}
