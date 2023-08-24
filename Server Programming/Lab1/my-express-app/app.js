const express = require('express');
const app = express();


const PORT = 3000;
app.listen(PORT, ()=>{
    console.log(`Server is running on PORT: ${PORT}`);
});

app.get('/', (req, res)=>{
    res.send('Hello World');
});

app.get('/gg', (req, res) =>{
    res.send("GG!");
});

app.get('/nt', (req, res)=>{
    res.sendFile("stuff.html", {"root": './'});
});