const express = require("express");
const router = express.Router();
const Weapon = require("../models/Weapon");

router.get("/", async (req, res) => {
    try{
        const weapons = await Weapon.find();
        res.json(weapons);
    }catch(err){
        res.json({message:err});
    }
});

// GET a specific weapon
router.get("/:weaponId", async (req, res) => {
    try{
        const weapon = await Weapon.findOne({itemId: req.params.weaponId});
        res.json(weapon);
    }catch(err){
        res.json({message:err});
    }

});



module.exports = router;