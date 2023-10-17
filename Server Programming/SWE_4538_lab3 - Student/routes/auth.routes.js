const express = require("express");
const router = express.Router();
const {
    getLogin,
    getRegister,
    postLogin,
    postRegister, 
    postLogout,
  } = require("../controllers/auth.controllers");

router.get("/login", getLogin);
router.post("/login", postLogin);
router.get("/register", getRegister);
router.post("/register", postRegister);
router.post("/logout", postLogout);

module.exports = router;