const mongoose = require('mongoose');

const TaskSchema = new mongoose.Schema({
    name:{
        type: String,
        required: true
    },

    description : {
        type: String,
        default: ''
    },

    user : {
        type: String,
        required: true
    }
});

const Task = mongoose.model("Task", TaskSchema);
module.exports = Task;