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
router.get("/:HealingId", async (req, res) => {
    try{
        const Healing = await Healing.findOne({healingId: req.params.HealingId});
        // Check when an Healing returned a null, Implement how to handle
        if (Healing == null){
            console.log(Healing, "Not found");
        }
        res.json(Healing);
    }catch(err){
        res.json({message:err});
    }

});



module.exports = router;