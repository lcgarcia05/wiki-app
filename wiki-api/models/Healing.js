const mongoose = require("mongoose");

const HealingSchema = mongoose.Schema({
    id: String,
    buy: String,
    class: String,
    description: String,
    droppedBy: String,
    healingId: Number,
    imgLarge: String,
    imgSmall: String,
    name: String,
    obtainableFrom: String,
    sell: String,
    soldBy: String,
    soldByNpcMap: String,
    type: String,
    weight: Number

});

module.exports = mongoose.model("Healing", HealingSchema, "healing");