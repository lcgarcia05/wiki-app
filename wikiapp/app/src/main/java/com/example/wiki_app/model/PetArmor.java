package com.example.wiki_app.model;

import com.google.gson.annotations.SerializedName;

public class PetArmor {

    @SerializedName("_id")
    private String id;
    private String buy;
    private String description;
    private String droppedBy;
    private String imgLarge;
    private String imgSmall;
    @SerializedName("name")
    private String itemName;
    private String obtainableFrom;
    @SerializedName("petArmorId")
    private Integer itemId;
    private String sell;
    private String itemType;
    private Double weight;

    @Override
    public String toString() {
        return "PetArmor{" +
                "id='" + id + '\'' +
                ", buy='" + buy + '\'' +
                ", description='" + description + '\'' +
                ", droppedBy='" + droppedBy + '\'' +
                ", imgLarge='" + imgLarge + '\'' +
                ", imgSmall='" + imgSmall + '\'' +
                ", itemName='" + itemName + '\'' +
                ", obtainableFrom='" + obtainableFrom + '\'' +
                ", itemId=" + itemId +
                ", sell='" + sell + '\'' +
                ", itemType='" + itemType + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getBuy() {
        return buy;
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

    public Integer getItemId() {
        return itemId;
    }

    public String getSell() {
        return sell;
    }

    public String getItemType() {
        return itemType;
    }

    public Double getWeight() {
        return weight;
    }
}
