// Egg route
const express = require("express");
const router = express.Router();
const Egg = require("../models/Egg");

router.get("/", async (req, res) => {
    try{
        const eggs = await Egg.find();
        res.json(eggs);
    }catch(err){
        res.json({message:err});
    }
});

// GET a specific weapon
router.get("/:eggId", async (req, res) => {
    try{
        const eggs = await Egg.findOne({eggId: req.params.eggId});
        res.json(eggs);
    }catch(err){
        res.json({message:err});
    }

});



module.exports = router;