//path
const path = require('path');
var pathobj = path.parse(__filename)
console.log(pathobj);

//OS
const os = require('os');

var totalMemory = os.totalmem();
var freeMemory = os.freemem();

console.log('Total Memory '+totalMemory);

console.log(`Total Memory: ${totalMemory}`);
console.log(`Free Memory: ${freeMemory}`);

//File system
const fs = require('fs');
const files = fs.readdirSync('./');
console.log(files);

fs.readdir('./', function(err, files){
    if (err) console.log('Error', err);
    else console.log('Result', files);
});

//Event
const EventEmitter = require('events');
const emitter = new EventEmitter();

//Register Listener
emitter.on('MessageLogged', function(){
    console.log('Listener Called');
});

//Raise an event
emitter.emit('MessageLogged'); //Emit means making a noise or produce a signal 
