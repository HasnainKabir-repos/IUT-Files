const express = require("express");
const router = express.Router();
const ensureAuthenticated = require('../middlewares/auth.middleware');
const {
    createTask,
    getTask,
    deleteTask,
    updateTask,
    postTaskImage,
    postMultipleImages,
    getMultipleImages,
    postAudioFile
} = require('../controllers/task.controller');

router.post('/task', ensureAuthenticated, createTask);
router.get('/task', ensureAuthenticated, getTask);
router.delete('/task', deleteTask);
router.patch('/task', updateTask);

const {
    uploadProfileImage,
    uploadAudioFile
} = require('../middlewares/image.middleware');

router.post('/task/single-image', uploadProfileImage.single('image'), postTaskImage);
router.post('/task/multiple-images', uploadProfileImage.array('images', 5), postMultipleImages);
router.get('/task/images', getMultipleImages);

router.post('/task/single-audio', uploadAudioFile.single('audio'), postAudioFile);

module.exports = router;