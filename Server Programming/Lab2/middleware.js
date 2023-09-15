const fs = require('fs');
const os = require('os');

function readWriteRead(){
    fs.readFile("./example.txt", "utf-8", (err, data) => {
        if(err){
            console.log(err);
        } else {
            console.log(data);
        }
    });

    fs.writeFile(
        "./example.txt", 
        "This is a new line",
        (error) => {
            if(error){
                console.log(error);
            } else {
                console.log("Wrote successfully");
            }
        });

    fs.readFile("./example.txt", "utf-8", (err, data) => {
        if(err){
            console.log(err);
        } else {
            console.log(data);
        }
    });
}

function signupPost(req){
    const data = {
        email: req.body.email,
        username: req.body.username,
        password: req.body.password,
        osName: os.type(),
        osRelease: os.release(),
        totalMem: os.totalmem(),
        freeMem: os.freemem()
    }

    let jsonData = [];

    jsonData.push(data);

    fs.appendFileSync('users.json', JSON.stringify(data, null, 2));
}

function isAuthenticated(req, res) {
    const data = {
        email: req.body.email,
        password: req.body.password
    }

    fs.readFileSync("users.json", "utf-8", (err, data) => {
        if(err){
            console.log(err);
            res.send("Error occurred");
            return false;
        } else {
            const users = JSON.parse(data);

            const user = users.find((u) => u.email === email);

            if (user){
                if (user.password === password){
                    console.log("Login Successful");
                }else{
                    res.send("Incorrect Password");
                    return false;
                }
            }else{
                res.send("Incorrect Email");
                return false;
            }
        }
    });
    return true;
}

function allowAccess(req, res) {
    if(isAuthenticated(req, res)){
        res.sendFile("welcome.html", {'root': './'});
    }
}

function resetPassword(req, res){
    const data = {
        email :  req.body.email,
        old : req.body.oldpassword,
        newPass : req.body.newpassword
    }

    fs.readFileSync("users.json", "utf-8", (err, data) => {
        if(err){
            console.log(err);
            res.send("Error occurred");
        } else {
            const users = JSON.parse(data);

            const user = users.find((u) => u.email === email);

            if (user){
                if (user.password === old){
                    console.log("Password found");
                    user.password = newPass;

                    fs.writeFileSync(
                        "users.json", 
                        JSON.stringify(users, null, 2),
                        (error) => {
                            if(error){
                                console.log(error);
                            } else {
                                res.send('Password changed');
                            }
                        });
                }else{
                    res.send("Incorrect Password");
                    return false;
                }
            }else{
                res.send("Incorrect Email");
                return false;
            }
        }
    });

}
module.exports = {
    readWriteRead,
    signupPost,
    allowAccess,
    resetPassword
};