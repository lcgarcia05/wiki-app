// healings route
const express = require("express");
const router = express.Router();
const Healing = require("../models/Healing");

router.get("/", async (req, res) => {
    try{
        const healings = await Healing.find();
        res.json(healings);
    }catch(err){
        res.json({message:err});
    }
});

// GET a specific Healing
router.get("/:healingId", async (req, res) => {
    try{
        const healing = await Healing.findOne({healingId: req.params.healingId});
        // Check when an Healing returned a null, Implement how to handle
        if (healing == null){
            console.log(healing, "Not found");
        }
        res.json(healing);
    }catch(err){
        res.json({message:err});
    }

});



module.exports = router;