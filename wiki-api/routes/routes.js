const express = require("express");
const router = express.Router();

router.get("/", (req, res) =>{
    res.send("Ragnarok Wiki API");
});

router.use("/weapons", require("./weapons"));

module.exports = router;