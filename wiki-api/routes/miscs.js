// Misc route
const express = require("express");
const router = express.Router();
const Misc = require("../models/Misc");

router.get("/", async (req, res) => {
    try{
        const miscs = await Misc.find();
        res.json(miscs);
    }catch(err){
        res.json({message:err});
    }
});

// GET a specific misc item
router.get("/:miscId", async (req, res) => {
    try{
        const miscs = await Misc.findOne({miscId: req.params.miscId});
        res.json(miscs);
    }catch(err){
        res.json({message:err});
    }

});



module.exports = router;