const mongoose = require("mongoose");

const ArmorSchema = mongoose.Schema({
    id: String,
    soldBy: String,
    SoldByLocation: String,
    buy: String,
    sell: String,
    class: String,
    defense: Number,
    description: String,
    droppedBy: String,
    itemId: Number,
    itemName: String,
    obtainableBy: String,
    property: String,
    requiredLevel: String,
    usableBy: String,
    weight: Number,
    imgSmall: String,
    imgLarge: String
});

module.exports = mongoose.model("Armor", ArmorSchema);