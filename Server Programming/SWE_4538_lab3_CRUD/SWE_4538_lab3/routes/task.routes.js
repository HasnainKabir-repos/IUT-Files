const express = require("express");
const router = express.Router();

const {
    createTask,
    getTask,
    deleteTask,
    updateTask
} = require('../controllers/task.controller');

router.post('/task', createTask);
router.get('/task',getTask);
router.delete('/task', deleteTask);
router.patch('/task', updateTask);
module.exports = router;