const mongoose = require("mongoose");

const TaskSchema = new mongoose.Schema({
  name: {
    type: String,
    required: true,
  },

  description: {
    type: String,
    default: "",
  },

  user: {
    type: String,
    required: true,
  },
  profile_image: {
    type: String,
    default: "",
  },
  images: {
    type: [String],
    default: [],
  },
  audio: {
    type: String,
    default: "",
  },
});

const Task = mongoose.model("Task", TaskSchema);
module.exports = Task;
