package com.example.wiki_app.model;

import com.google.gson.annotations.SerializedName;

public class Misc {

    @SerializedName("_id")
    private String id;
    private String buy;
    @SerializedName("type")
    private String itemType;
    private String description;
    private String droppedBy;
    private String imgLarge;
    private String imgSmall;
    private Integer itemId;
    @SerializedName("name")
    private String itemName;
    private String obtainableFrom;
    private String sell;
    private String soldBy;
    private String soldByNpcMap;
    private Double weight;

    @Override
    public String toString() {
        return "Misc{" +
                "id='" + id + '\'' +
                ", buy='" + buy + '\'' +
                ", itemType='" + itemType + '\'' +
                ", description='" + description + '\'' +
                ", droppedBy='" + droppedBy + '\'' +
                ", imgLarge='" + imgLarge + '\'' +
                ", imgSmall='" + imgSmall + '\'' +
                ", itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", obtainableFrom='" + obtainableFrom + '\'' +
                ", sell='" + sell + '\'' +
                ", soldBy='" + soldBy + '\'' +
                ", soldByNpcMap='" + soldByNpcMap + '\'' +
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

    public Integer getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getObtainableFrom() {
        return obtainableFrom;
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
