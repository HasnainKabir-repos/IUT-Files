const express = require('express');
const router = express.Router();

const {readWriteRead, signupPost, allowAccess, resetPassword} = require('./middleware');

router.post('/signup', (req, res) =>{
    signupPost(req);
    res.send("Sign Up Successful");
});

router.get('/', (req, res) =>{
    res.sendFile('signup.html', {"root":'./'});
});

router.get('/read', (req, res) => {
    readWriteRead();
    res.send("Check Console");
    
});

router.get('/login',(req, res) =>{
    res.sendFile('login.html', {"root" : './'});
});

router.post('/login', (req, res) => {
    allowAccess(req, res);
});

router.get('/reset', (req, res) =>{
    res.sendFile('passwordReset.html', {'root' : './'});
});

router.post('/reset', (req, res) => {
    resetPassword(req, res);
})

module.exports = router;