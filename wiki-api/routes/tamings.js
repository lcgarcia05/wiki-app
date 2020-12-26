// tamings route
const express = require("express");
const router = express.Router();
const Taming = require("../models/Taming");

router.get("/", async (req, res) => {
    try{
        const tamings = await Taming.find();
        res.json(tamings);
    }catch(err){
        res.json({message:err});
    }
});

// GET a specific Taming
router.get("/:TamingId", async (req, res) => {
    try{
        const taming = await Taming.findOne({tamingId: req.params.TamingId});
        // Check when an Taming returned a null, Implement how to handle
        if (taming == null){
            console.log(taming, "Not found");
        }
        res.json(taming);
    }catch(err){
        res.json({message:err});
    }

});



module.exports = router;