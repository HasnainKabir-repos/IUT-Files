const Task = require("../dataModels/Task.model");
const passport = require("passport");

const postTaskImage = async (req, res) => {
  try {
    if (!req.file) {
      return res.status(400).json({ message: "No file provided" });
    }
    const photo = req.file.filename;

    const userId = req.user._id;
    const task = await Task.find({ user: userId });
    console.log(task);

    if (photo) {
      task[0].profile_image = photo;
    }
    await task[0].save();

    res.json({ message: "Task image updated successfully" });
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

const postMultipleImages = async (req, res) => {
  try {
    if (!req.files) {
      return res.status(400).json({ message: "No file provided" });
    }

    const photo = req.files.map((file) => file.filename);

    const userId = req.user._id;
    const task = await Task.findById({ user: userId });

    if (photo) {
      task[0].images = photo;
    }
    await task[0].save();

    res.json({ message: "Multiple images updated successfully" });
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

const getMultipleImages = async (req, res) => {
  try {
    const userId = req.user._id;
    const task = await Task.find({ user: userId });
    const images = task.images;

    res.json({ images });
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

const postAudioFile = async (req, res) => {
  try {
    if (!req.file) {
      return res.status(400).json({ message: "No file provided" });
    }
    const audio = req.file.filename;

    const userId = req.user._id;
    const task = await Task.find({ user: userId });
    console.log(task);

    if (audio) {
      task[0].audio = audio;
    }
    await task[0].save();

    res.json({ message: "Audio updated successfully" });
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

const createTask = async (req, res) => {
  const user = req.user._id;
  //console.log(req.user);

  const { name, description } = req.body;

  if (!name || !description) {
    res.status(400).json({ error: "All fields are required" });
  } else {
    const newTask = new Task({
      name: name,
      description: description,
      user: user,
    });

    newTask
      .save()
      .then(() => {
        res.status(200).json("Successfully added task");
      })
      .catch((error) => {
        res.status(400).json({ error: error });
      });
  }
};

const getTask = async (req, res) => {
  const user = req.user._id;
  console.log(user);

  try {
    const task = await Task.find({ user: user }).exec();
    res.status(200).json({ task });
  } catch (error) {
    res.status(500).json({ error: error });
  }
};

const deleteTask = async (req, res) => {
  const id = req.params.id;

  try {
    await Task.deleteOne({ _id: id });
    res.status(200).json("Successfully deleted");
  } catch (error) {
    res.status(500).json({ error: error });
  }
};

const updateTask = async (req, res) => {
  const id = req.params.id;
  try {
    const { name, description } = req.body;

    const task = await Task.findbyid({ _id: id }).exec();

    if (!task) {
      res.status(500).json("Task not found");
    }

    task.name = name;
    task.description = description;

    await Task.save();

    res.status(200).json("Successfully deleted");
  } catch (error) {
    res.status(500).json({ error: error });
  }
};

module.exports = {
  createTask,
  getTask,
  deleteTask,
  updateTask,
  postTaskImage,
  postMultipleImages,
  getMultipleImages,
  postAudioFile
};
