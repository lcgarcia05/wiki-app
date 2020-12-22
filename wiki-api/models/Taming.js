const mongoose = require("mongoose");

const TamingSchema = mongoose.Schema({
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
    tamingId: Number,
    type: String,
    weight: Number
});

module.exports = mongoose.model("Taming", TamingSchema, "taming");