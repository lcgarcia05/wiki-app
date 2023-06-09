package com.example.wiki_app.model;

import com.google.gson.annotations.SerializedName;

public class Card {

    @SerializedName("_id")
    private String id;
    private String buy;
    @SerializedName("class")
    private String itemType;
    private Integer defense;
    private String description;
    private String droppedBy;
    private String imgLarge;
    private String imgSmall;
    private Integer itemId;
    private String obtainableFrom;
    private String property;
    @SerializedName("reqLvl")
    private String requiredLevel;
    private String soldBy;
    private String soldByLoc;
    private String usableBy;
    private Double weight;

    @Override
    public String toString() {
        return "Card{" +
                "id='" + id + '\'' +
                ", buy='" + buy + '\'' +
                ", itemType='" + itemType + '\'' +
                ", defense=" + defense +
                ", description='" + description + '\'' +
                ", droppedBy='" + droppedBy + '\'' +
                ", imgLarge='" + imgLarge + '\'' +
                ", imgSmall='" + imgSmall + '\'' +
                ", itemId=" + itemId +
                ", obtainableFrom='" + obtainableFrom + '\'' +
                ", property='" + property + '\'' +
                ", requiredLevel='" + requiredLevel + '\'' +
                ", soldBy='" + soldBy + '\'' +
                ", soldByLoc='" + soldByLoc + '\'' +
                ", usableBy='" + usableBy + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getBuy() {
        return buy;
    }

    public String getItemType() {
        return itemType;
    }

    public Integer getDefense() {
        return defense;
    }

    public String getDescription() {
        return description;
    }

    public String getDroppedBy() {
        return droppedBy;
    }

    public String getImgLarge() {
        return imgLarge;
    }

    public String getImgSmall() {
        return imgSmall;
    }

    public Integer getItemId() {
        return itemId;
    }

    public String getObtainableFrom() {
        return obtainableFrom;
    }

    public String getProperty() {
        return property;
    }

    public String getRequiredLevel() {
        return requiredLevel;
    }

    public String getSoldBy() {
        return soldBy;
    }

    public String getSoldByLoc() {
        return soldByLoc;
    }

    public String getUsableBy() {
        return usableBy;
    }

    public Double getWeight() {
        return weight;
    }
}
