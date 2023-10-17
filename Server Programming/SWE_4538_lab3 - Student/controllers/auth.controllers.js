const path = require("path");
const fs = require('fs');
const bcrypt = require("bcrypt");
const passport = require("passport");
const initializePassport = require("../config/passport");

let users = require('../users.json');
const usersPath = path.join(__dirname, '..', 'users.json');

function writeUsersFile(data){
  try{
    fs.writeFileSync(usersPath, JSON.stringify(data, null, 2), 'utf8');
  }
  catch(error){
    console.log(error);
  }
  
}

initializePassport(
  passport,
  email => users.find(user => user.email === email),
  id => users.find(user => user.id === id)
  );

const getLogin = async (req, res) => {
  const filePath = path.join(__dirname, "..", "views", "login.html");
  res.sendFile(filePath);
};

const postLogin = (req, res, next) => {

  passport.authenticate("local", {
    successRedirect: "/welcome",
    failureRedirect: "/login",
    failureFlash: true,
  })(req, res, next);
};


const getRegister = async (req, res) => {
  const filePath = path.join(__dirname, "..", "views", "register.html");
  res.sendFile(filePath);
};

const postRegister = async (req, res, next) => {
  try {
    const hashedPassword = await bcrypt.hash(req.body.password, 10); // req.body.password ==> password should be exact match to register.html name=password,  10:how many time you want to generate hash. it's a standard default value
    const data = fs.readFileSync(usersPath, 'utf-8');
    let userData = JSON.parse(data);
    userData.push({
      id: Date.now().toString(),
      name: req.body.username,
      email: req.body.email,
      password: hashedPassword,
    });

    writeUsersFile(userData);

    res.redirect("/login");
  } catch {
    res.redirect("/register");
  }
  console.log(users); // show the user list
};

const postLogout = (req, res) => {
  req.logout(function (err) {
    if (err) {
      console.error(err);
    }
    req.session.destroy();
    res.redirect("/login");
  });
};

module.exports = {
  getLogin,
  getRegister,
  postLogin,
  postRegister,
  postLogout,
};
