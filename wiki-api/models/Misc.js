const mongoose = require("mongoose");

const MiscSchema = mongoose.Schema({
    id: String,
    buy: String,
    class: String,
    description: String,
    droppedBy: String,
    miscId: Number,
    name: String,
    obtainableFrom: String,
    sell: String,
    soldBy: String,
    soldByNpcMap: String,
    type: String,
    weight: Number,
    imgSmall: String,
    imgLarge: String
});

// Given a third parameter to specify the collection
// Not sure why it won't work without this parameter like in the previous models.
module.exports = mongoose.model("Misc", MiscSchema, "misc");