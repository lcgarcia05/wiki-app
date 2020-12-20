// Armors route
const express = require("express");
const router = express.Router();
const Armor = require("../models/Armor");

router.get("/", async (req, res) => {
    try{
        const armors = await Armor.find();
        res.json(armors);
    }catch(err){
        res.json({message:err});
    }
});

// GET a specific armor
router.get("/:armorId", async (req, res) => {
    try{
        const armor = await Armor.findOne({itemId: req.params.armorId});
        // Check when an armor returned a null, Implement how to handle
        if (armor == null){
            console.log(armor, "Not found");
        }
        res.json(armor);
    }catch(err){
        res.json({message:err});
    }

});



module.exports = router;