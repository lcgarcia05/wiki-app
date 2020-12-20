// Cards route
const express = require("express");
const router = express.Router();
const Card = require("../models/Card");

router.get("/", async (req, res) => {
    try{
        const card = await Card.find();
        res.json(card);
    }catch(err){
        res.json({message:err});
    }
});

// GET a specific card
router.get("/:cardId", async (req, res) => {
    try{
        const card = await Card.findOne({cardId: req.params.cardId});
        res.json(card);
    }catch(err){
        res.json({message:err});
    }

});



module.exports = router;