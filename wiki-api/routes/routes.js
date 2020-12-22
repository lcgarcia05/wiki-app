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
router.use("/cards", require("./cards"));

// Route for the usables
router.use("/usables", require("./usables"))

// Route for the misc
router.use("/miscs", require("./miscs"));

// Route for the eggs
router.use("/eggs", require("./eggs"));

// Route for the ammunitions
router.use("/ammos", require("./ammos"));

// Route for the healing
router.use("/healings", require("./healings"))

// Route for the taming items
router.use("/tamings", require("./tamings"))

// Route fro the pet armors
router.use("/petarmors", require("./petarmors"))













module.exports = router;