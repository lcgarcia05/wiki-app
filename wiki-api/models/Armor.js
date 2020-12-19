const mongoose = require("mongoose");

const ArmorSchema = mongoose.Schema({
    id: String,
    soldBy: String,
    SoldByLocation: String,
    buy: String,
    sell: String,
    class: String,
    defense: String,
    description: String,
    droppedBy: String,
    itemId: String,
    itemName: String,
    obtainableBy: String,
    property: String,
    requiredLevel: String,
    usableBy: String,
    weight: String,
});

module.exports = mongoose.model("Armor", ArmorSchema);