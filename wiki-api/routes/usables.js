// usables route
const express = require("express");
const router = express.Router();
const Usable = require("../models/Usable");

router.get("/", async (req, res) => {
    try{
        const usables = await Usable.find();
        res.json(usables);
    }catch(err){
        res.json({message:err});
    }
});

// GET a specific usable
router.get("/:usableId", async (req, res) => {
    try{
        const usables = await Usable.findOne({usableId: req.params.usableId});
        // Check when an usable returned a null, Implement how to handle
        if (usables == null){
            console.log(usables, "Not found");
        }
        res.json(usables);
    }catch(err){
        res.json({message:err});
    }

});



module.exports = router;