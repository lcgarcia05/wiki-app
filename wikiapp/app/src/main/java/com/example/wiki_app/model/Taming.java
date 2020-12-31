package com.example.wiki_app.model;

import com.google.gson.annotations.SerializedName;

public class Taming {

    @SerializedName("_id")
    private String id;
    private String buy;
    private String description;
    private String droppedBy;
    private String imgLarge;
    private String imgSmall;
    @SerializedName("name")
    private String itemName;
    @SerializedName("tamingId")
    private String itemId;
    @SerializedName("type")
    private String itemType;
    private Double weight;

    @Override
    public String toString() {
        return "Taming{" +
                "id='" + id + '\'' +
                ", buy='" + buy + '\'' +
                ", description='" + description + '\'' +
                ", droppedBy='" + droppedBy + '\'' +
                ", imgLarge='" + imgLarge + '\'' +
                ", imgSmall='" + imgSmall + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemId='" + itemId + '\'' +
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

    public String getItemId() {
        return itemId;
    }

    public String getItemType() {
        return itemType;
    }

    public Double getWeight() {
        return weight;
    }
}
