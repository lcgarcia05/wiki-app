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
        const Taming = await Taming.findOne({tamingId: req.params.TamingId});
        // Check when an Taming returned a null, Implement how to handle
        if (Taming == null){
            console.log(Taming, "Not found");
        }
        res.json(Taming);
    }catch(err){
        res.json({message:err});
    }

});



module.exports = router;