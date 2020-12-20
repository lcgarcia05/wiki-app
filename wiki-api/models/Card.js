const mongoose = require("mongoose");

const CardSchema = mongoose.Schema({
    id: String,
    buy: String,
    cardId: Number,
    class: String,
    description: String,
    droppedBy: String,
    name: String,
    obtainableFrom: String,
    presuffix: String,
    sell: String,
    weight: Number
});

module.exports = mongoose.model("Card", CardSchema);