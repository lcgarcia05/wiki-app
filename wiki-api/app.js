const express = require('express');
const app = express();
const mongoose = require('mongoose');
const bodyParser = require("body-parser");
let port = process.env.PORT || 3000;
require("dotenv/config");

app.use(bodyParser.json());
// Import Routes
const routes = require("./routes/routes");

// Routes 
app.get('/', (req, res) => {
    res.send("We are on home");
});

app.get('/image/:itemId', (req,res) => {
    const itemId = req.params.itemId
    res.sendFile(__dirname + `/images/${itemId}.gif`)
    console.log(itemId)
});

app.use("/api", routes);

// Connect to DB
mongoose.connect(process.env.DB_CONNECTION || process.env.MONGODB_URI, { useNewUrlParser: true, useUnifiedTopology: true }, () =>
    console.log("connected to DB!"));


app.listen(port, () => {
    console.log(`App is listening on port http://localhost:${port}`);
});