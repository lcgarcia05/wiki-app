package com.example.wiki_app;

import com.google.gson.annotations.SerializedName;

public class Weapon {

    private String _id;
    @SerializedName("applicableJobs")
    private String jobs;
    private String buy;
    @SerializedName("class")
    private String itemType;
    private String description;
    private String droppedBy;
    private String imgLrg;
    private String imgSmall;
    private Integer itemId;
    @SerializedName("itemName")
    private String name;
    private String obtainedFrom;
    private String property;
    private String range;
    private String requiredLevel;
    private String sell;
    private String slots;
    private Integer weaponLevel;
    private Double weight;

    @Override
    public String toString() {
        return "Weapon{" +
                "_id='" + _id + '\'' +
                ", jobs='" + jobs + '\'' +
                ", buy='" + buy + '\'' +
                ", itemType='" + itemType + '\'' +
                ", description='" + description + '\'' +
                ", droppedBy='" + droppedBy + '\'' +
                ", imgLrg='" + imgLrg + '\'' +
                ", imgSmall='" + imgSmall + '\'' +
                ", itemId=" + itemId +
                ", name='" + name + '\'' +
                ", obtainedFrom='" + obtainedFrom + '\'' +
                ", property='" + property + '\'' +
                ", range='" + range + '\'' +
                ", requiredLevel='" + requiredLevel + '\'' +
                ", sell='" + sell + '\'' +
                ", slots='" + slots + '\'' +
                ", weaponLevel=" + weaponLevel +
                ", weight=" + weight +
                '}';
    }

    public String get_id() {
        return _id;
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

    public String getImgLrg() {
        return imgLrg;
    }

    public String getImgSmall() {
        return imgSmall;
    }

    public Integer getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public String getObtainedFrom() {
        return obtainedFrom;
    }

    public String getProperty() {
        return property;
    }

    public String getRange() {
        return range;
    }

    public String getRequiredLevel() {
        return requiredLevel;
    }

    public String getSell() {
        return sell;
    }

    public String getSlots() {
        return slots;
    }

    public Integer getWeaponLevel() {
        return weaponLevel;
    }

    public Double getWeight() {
        return weight;
    }
}
