const mongoose = require("mongoose");

const UsableSchema = mongoose.Schema({
    id: String,
    buy: String,
    class: String,
    description: String,
    droppedBy: String,
    imgLarge: String,
    imgSmall: String,
    name: String,
    obtainableFrom: String,
    sell: String,
    soldBy: String,
    soldByNpcMap: String,
    type: String,
    usableId: Number,
    weight: Number
});

module.exports = mongoose.model("Usable", UsableSchema, "usable");