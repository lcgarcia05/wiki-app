const mongoose = require("mongoose");

const WeaponSchema = mongoose.Schema({
    id: String,
    applicableJobs: String,
    attack: Number, 
    itemClass: String,
    description: String,
    droppedBy: String,
    itemId: Number,
    itemName: String,
    obtainedFrom: String,
    property: String,
    range: String,
    requiredLevel: String,
    sell: String,
    slots: String,
    weaponLevel: Number,
    weight: Number,
    imgSmall: String,
    imgLarge: String
});


module.exports = mongoose.model("Weapon", WeaponSchema);