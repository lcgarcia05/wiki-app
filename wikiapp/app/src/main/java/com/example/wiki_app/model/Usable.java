package com.example.wiki_app.model;

import com.google.gson.annotations.SerializedName;

public class Usable {

    @SerializedName("_id")
    private String id;
    private String buy;
    @SerializedName("type")
    private String itemType;
    private String description;
    private String droppedBy;
    private String imgLarge;
    private String imgSmall;
    @SerializedName("name")
    private String itemName;
    private String sell;
    private String obtainableFrom;
    private String soldBy;
    private String soldByNpcMap;
    @SerializedName("usableId")
    private Integer itemId;
    private Double weight;

    @Override
    public String toString() {
        return "Usable{" +
                "id='" + id + '\'' +
                ", buy='" + buy + '\'' +
                ", itemType='" + itemType + '\'' +
                ", description='" + description + '\'' +
                ", droppedBy='" + droppedBy + '\'' +
                ", imgLarge='" + imgLarge + '\'' +
                ", imgSmall='" + imgSmall + '\'' +
                ", itemName='" + itemName + '\'' +
                ", sell='" + sell + '\'' +
                ", obtainableFrom='" + obtainableFrom + '\'' +
                ", soldBy='" + soldBy + '\'' +
                ", soldByNpcMap='" + soldByNpcMap + '\'' +
                ", itemId=" + itemId +
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

    public String getSell() {
        return sell;
    }

    public String getObtainableFrom() {
        return obtainableFrom;
    }

    public String getSoldBy() {
        return soldBy;
    }

    public String getSoldByNpcMap() {
        return soldByNpcMap;
    }

    public Integer getItemId() {
        return itemId;
    }

    public Double getWeight() {
        return weight;
    }
}
