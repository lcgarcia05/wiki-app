const express = require('express');
const app = express();
const mongoose = require('mongoose');
const bodyParser = require("body-parser");
require("dotenv/config");

app.use(bodyParser.json());
// Import Routes
const routes = require("./routes/routes");

app.use("/api", routes);


// Routes 
app.get('/', (req, res) => {
    res.send("We are on home");
});

app.get('/items', (req, res) => {
    res.send("We are on items");
});

// Connect to DB
mongoose.connect(process.env.DB_CONNECTION, { useNewUrlParser: true }, () =>
    console.log("connected to DB!"));


app.listen(3000, console.log("Listening to PORT 3000"));