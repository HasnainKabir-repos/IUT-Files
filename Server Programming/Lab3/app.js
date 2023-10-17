const express = require('express');
const app = express();
const routes = require('./routes.js');

const PORT = 3000;
app.listen(PORT, ()=>{
    console.log(`Server is running on PORT: ${PORT}`);
});

const bodyParser = require('body-parser');

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

app.use(routes);