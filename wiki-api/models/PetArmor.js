const mongoose = require("mongoose");

const PetArmorSchema = mongoose.Schema({
    id: String,
    buy: String,
    class: String,
    description: String,
    droppedBy: String,
    imgLarge: String,
    imgSmall: String,
    name: String,
    obtainableFrom: String,
    petArmorId: Number,
    sell: String,
    type: String,
    weight: Number
});

module.exports = mongoose.model("PetArmor", PetArmorSchema, "petarmor");