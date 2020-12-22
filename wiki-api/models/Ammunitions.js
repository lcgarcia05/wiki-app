const mongoose = require("mongoose");

const AmmunitionsSchema = mongoose.Schema({
    id: String,
    ammoId: String,
    applicableJobs: String,
    attack: Number,
    buy: String,
    class: String,
    description: String,
    droppedBy: String,
    imgLarge: String,
    imgSmall: String,
    name: String,
    obtainableFrom: String,
    property: String,
    reqLvl: String,
    sell: String,
    soldBy: String,
    soldByNpcMap: String,
    weight: Number
});

module.exports = mongoose.model("Ammunitions", AmmunitionsSchema, "ammunitions");