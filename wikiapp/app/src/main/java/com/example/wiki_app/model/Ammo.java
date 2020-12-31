package com.example.wiki_app.model;

import com.google.gson.annotations.SerializedName;

public class Ammo {

    private String id;
    @SerializedName("ammoId")
    private Integer itemId;
    private Integer attack;
    @SerializedName("applicableJobs")
    private String jobs;
    private String buy;
    @SerializedName("class")
    private String itemType;
    private String description;
    private String droppedBy;
    private String imgLarge;
    private String imgSmall;
    @SerializedName("name")
    private String itemName;
    private String obtainableFrom;
    private String property;
    @SerializedName("reqLvl")
    private String requiredLevel;
    private String sell;
    private String soldBy;
    private String soldByNpcMap;
    private Double weight;

    @Override
    public String toString() {
        return "Ammo{" +
                "id='" + id + '\'' +
                ", itemId=" + itemId +
                ", attack=" + attack +
                ", jobs='" + jobs + '\'' +
                ", buy='" + buy + '\'' +
                ", itemType='" + itemType + '\'' +
                ", description='" + description + '\'' +
                ", droppedBy='" + droppedBy + '\'' +
                ", imgLarge='" + imgLarge + '\'' +
                ", imgSmall='" + imgSmall + '\'' +
                ", itemName='" + itemName + '\'' +
                ", obtainableFrom='" + obtainableFrom + '\'' +
                ", property='" + property + '\'' +
                ", requiredLevel='" + requiredLevel + '\'' +
                ", sell='" + sell + '\'' +
                ", soldBy='" + soldBy + '\'' +
                ", soldByNpcMap='" + soldByNpcMap + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getId() {
        return id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public Integer getAttack() {
        return attack;
    }

    public String getJobs() {
        return jobs;
    }

    public String getBuy() {
        return buy;
    }

    public String getItemType() {
        return itemType;
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

    public String getItemName() {
        return itemName;
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

    public String getSell() {
        return sell;
    }

    public String getSoldBy() {
        return soldBy;
    }

    public String getSoldByNpcMap() {
        return soldByNpcMap;
    }

    public Double getWeight() {
        return weight;
    }
}
