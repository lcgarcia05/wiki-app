// petArmors route
const express = require("express");
const router = express.Router();
const PetArmor = require("../models/PetArmor");

router.get("/", async (req, res) => {
    try{
        const petArmors = await PetArmor.find();
        res.json(petArmors);
    }catch(err){
        res.json({message:err});
    }
});

// GET a specific PetArmor
router.get("/:PetArmorId", async (req, res) => {
    try{
        const petArmors = await PetArmor.findOne({petArmorId: req.params.PetArmorId});
        // Check when an PetArmor returned a null, Implement how to handle
        if (petArmors == null){
            console.log(petArmors, "Not found");
        }
        res.json(petArmors);
    }catch(err){
        res.json({message:err});
    }

});



module.exports = router;