// ammos route
const express = require("express");
const router = express.Router();
const Ammos = require("../models/Ammunitions");

router.get("/", async (req, res) => {
    try{
        const ammos = await Ammos.find();
        res.json(ammos);
    }catch(err){
        res.json({message:err});
    }
});

// GET a specific ammos
router.get("/:ammosId", async (req, res) => {
    try{
        const ammos = await Ammos.findOne({itemId: req.params.ammosId});
        // Check when an ammos returned a null, Implement how to handle
        if (ammos == null){
            console.log(ammos, "Not found");
        }
        res.json(ammos);
    }catch(err){
        res.json({message:err});
    }

});



module.exports = router;