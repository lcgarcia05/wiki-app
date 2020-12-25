package com.example.wiki_app;

import com.google.gson.annotations.SerializedName;

public class Weapon {
    @SerializedName("_id")
    private String id;
    @SerializedName("applicableJobs")
    private String jobs;
    private Integer attack;
    private String buy;
    @SerializedName("class")
    private String itemType;
    private String description;
    private String droppedBy;
    private String imgLarge;
    private String imgSmall;
    private Integer itemId;
    private String itemName;
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
        return "Weapons{" +
                "id='" + id + '\'' +
                ", jobs='" + jobs + '\'' +
                ", attack=" + attack +
                ", buy='" + buy + '\'' +
                ", itemType='" + itemType + '\'' +
                ", description='" + description + '\'' +
                ", droppedBy='" + droppedBy + '\'' +
                ", imgLarge='" + imgLarge + '\'' +
                ", imgSmall='" + imgSmall + '\'' +
                ", itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
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

    public String getId() {
        return id;
    }

    public String getJobs() {
        return jobs;
    }

    public Integer getAttack() {
        return attack;
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
