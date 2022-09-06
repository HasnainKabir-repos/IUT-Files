
    console.log(__filename);
    console.log(__dirname);

    var url = 'http://mylogger.io/log';
    function log(message){
        //send http request
        console.log(message);
    }
    module.exports = log;
