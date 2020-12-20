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

// GET a specific weapon
router.get("/:armorId", async (req, res) => {
    try{
        const armor = await Weapon.findOne({itemId: req.params.armorId});
        res.json(armor);
    }catch(err){
        res.json({message:err});
    }

});



module.exports = router;