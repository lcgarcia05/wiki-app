package com.example.wiki_app.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Weapon implements Parcelable {

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

    public Weapon(String _id, String jobs, String buy, String itemType, String description, String droppedBy, String imgLrg, String imgSmall, Integer itemId, String name, String obtainedFrom, String property, String range, String requiredLevel, String sell, String slots, Integer weaponLevel, Double weight) {
        this._id = _id;
        this.jobs = jobs;
        this.buy = buy;
        this.itemType = itemType;
        this.description = description;
        this.droppedBy = droppedBy;
        this.imgLrg = imgLrg;
        this.imgSmall = imgSmall;
        this.itemId = itemId;
        this.name = name;
        this.obtainedFrom = obtainedFrom;
        this.property = property;
        this.range = range;
        this.requiredLevel = requiredLevel;
        this.sell = sell;
        this.slots = slots;
        this.weaponLevel = weaponLevel;
        this.weight = weight;
    }

    protected Weapon(Parcel in) {
        _id = in.readString();
        jobs = in.readString();
        buy = in.readString();
        itemType = in.readString();
        description = in.readString();
        droppedBy = in.readString();
        imgLrg = in.readString();
        imgSmall = in.readString();
        if (in.readByte() == 0) {
            itemId = null;
        } else {
            itemId = in.readInt();
        }
        name = in.readString();
        obtainedFrom = in.readString();
        property = in.readString();
        range = in.readString();
        requiredLevel = in.readString();
        sell = in.readString();
        slots = in.readString();
        if (in.readByte() == 0) {
            weaponLevel = null;
        } else {
            weaponLevel = in.readInt();
        }
        if (in.readByte() == 0) {
            weight = null;
        } else {
            weight = in.readDouble();
        }
    }

    public static final Creator<Weapon> CREATOR = new Creator<Weapon>() {
        @Override
        public Weapon createFromParcel(Parcel in) {
            return new Weapon(in);
        }

        @Override
        public Weapon[] newArray(int size) {
            return new Weapon[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(_id);
        dest.writeString(jobs);
        dest.writeString(buy);
        dest.writeString(itemType);
        dest.writeString(description);
        dest.writeString(droppedBy);
        dest.writeString(imgLrg);
        dest.writeString(imgSmall);
        if (itemId == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(itemId);
        }
        dest.writeString(name);
        dest.writeString(obtainedFrom);
        dest.writeString(property);
        dest.writeString(range);
        dest.writeString(requiredLevel);
        dest.writeString(sell);
        dest.writeString(slots);
        if (weaponLevel == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(weaponLevel);
        }
        if (weight == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(weight);
        }
    }
}
