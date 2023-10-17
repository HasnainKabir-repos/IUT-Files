const LocalStrategy = require('passport-local').Strategy
const bcrypt = require('bcrypt')

function initialize(passport, getUserByEmail, getUserById) {
  const authenticateUser = async (email, password, done) => {
    const user = getUserByEmail(email)
    if (user == null) {
    return done(null, false, { message: 'No user with that email' })
    }

    try {
      if (await bcrypt.compare(password, user.password)) {
        return done(null, user)
      } else {
        console.log("email")
        return done(null, false, { message: 'Password incorrect' })
      }
    } catch (e) {
      return done(e)
    }
  }

  passport.use(new LocalStrategy({ usernameField: 'email' }, authenticateUser)) 
  passport.serializeUser((user, done) =>{
    done(null, user.id)}) //specify what user data should be stored in the session after a user logs in
  passport.deserializeUser((id, done) => {  // This function retrieves the user data based on the stored user identifier (e.g., user ID).
    return done(null, id)
  })
}

module.exports = initialize