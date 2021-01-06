package com.example.wiki_app.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Armor implements Parcelable {
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
    @SerializedName("name")
    private String itemName;
    private String obtainableFrom;
    private String property;
    @SerializedName("reqLvl")
    private String requiredLevel;
    private String sell;
    private String soldBy;
    private String soldByLoc;
    private String usableBy;
    private Double weight;

    protected Armor(Parcel in) {
        id = in.readString();
        buy = in.readString();
        itemType = in.readString();
        if (in.readByte() == 0) {
            defense = null;
        } else {
            defense = in.readInt();
        }
        description = in.readString();
        droppedBy = in.readString();
        imgLarge = in.readString();
        imgSmall = in.readString();
        if (in.readByte() == 0) {
            itemId = null;
        } else {
            itemId = in.readInt();
        }
        itemName = in.readString();
        obtainableFrom = in.readString();
        property = in.readString();
        requiredLevel = in.readString();
        sell = in.readString();
        soldBy = in.readString();
        soldByLoc = in.readString();
        usableBy = in.readString();
        if (in.readByte() == 0) {
            weight = null;
        } else {
            weight = in.readDouble();
        }
    }

    public static final Creator<Armor> CREATOR = new Creator<Armor>() {
        @Override
        public Armor createFromParcel(Parcel in) {
            return new Armor(in);
        }

        @Override
        public Armor[] newArray(int size) {
            return new Armor[size];
        }
    };

    @Override
    public String toString() {
        return "Armor{" +
                "id='" + id + '\'' +
                ", buy='" + buy + '\'' +
                ", itemType='" + itemType + '\'' +
                ", defense=" + defense +
                ", description='" + description + '\'' +
                ", droppedBy='" + droppedBy + '\'' +
                ", imgLarge='" + imgLarge + '\'' +
                ", imgSmall='" + imgSmall + '\'' +
                ", itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", obtainableFrom='" + obtainableFrom + '\'' +
                ", property='" + property + '\'' +
                ", requiredLevel='" + requiredLevel + '\'' +
                ", sell='" + sell + '\'' +
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

    public String getSoldByLoc() {
        return soldByLoc;
    }

    public String getUsableBy() {
        return usableBy;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(buy);
        dest.writeString(itemType);
        if (defense == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(defense);
        }
        dest.writeString(description);
        dest.writeString(droppedBy);
        dest.writeString(imgLarge);
        dest.writeString(imgSmall);
        if (itemId == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(itemId);
        }
        dest.writeString(itemName);
        dest.writeString(obtainableFrom);
        dest.writeString(property);
        dest.writeString(requiredLevel);
        dest.writeString(sell);
        dest.writeString(soldBy);
        dest.writeString(soldByLoc);
        dest.writeString(usableBy);
        if (weight == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(weight);
        }
    }
}
