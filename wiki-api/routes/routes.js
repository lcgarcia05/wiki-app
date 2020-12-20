// Routes of the API
const express = require("express");
const router = express.Router();

router.get("/", (req, res) =>{
    res.send("Ragnarok Wiki API");
});

// Route for the weapons
router.use("/weapons", require("./weapons"));

// Route for the armors
router.use("/armors", require("./armors"));

// Route for the cards

// Route for the usables

// Route for the misc

// Route for the eggs

// Route for the ammunitions

// Route for the healing

// Route for the taming items

// Route fro the pet armors













module.exports = router;