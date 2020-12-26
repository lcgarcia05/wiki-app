const mongoose = require("mongoose");

const EggSchema = mongoose.Schema({
    id: String,
    buy: String,
    class: String,
    description: String,
    droppedBy: String,
    eggId: Number,
    name: String,
    obtainableFrom: String,
    sell: String,
    type: String,
    weight: Number,
    imgSmall: String,
    imgLarge: String
});

module.exports = mongoose.model("Egg", EggSchema, "eggs");