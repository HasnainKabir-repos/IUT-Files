const Task = require("../dataModels/Task.model");
const passport = require("passport");


const createTask = async(req, res) => {
    const user = req.user.id;

    const {name, description} = req.body;

    if(!name || !description ){
        res.status(400).json({ error: "All fields are required" });
    }else {
        const newTask = new Task({
            name: name,
            description: description,
            user:user
        });

        newTask.save()
        .then(()=>{
            res.status(200).json("Successfully added task");
        })
        .catch((error)=> {
            res.status(400).json({error:error });
        });
    }
};

const getTask = async(req, res) =>{
    const user = req.user.id;
    console.log(user);

    try{
        const task = await Task.find({user: user}).exec();
        res.status(200).json({task});
    }
    catch (error) {
        res.status(500).json({error: error});
    }
    
};

const deleteTask = async(req, res) =>{
    const id = req.params.id;

    try{
        await Task.deleteOne({_id: id});
        res.status(200).json("Successfully deleted");
    }catch (error) {
        res.status(500).json({error: error});
    }
};

const updateTask = async(req, res) =>{
    const id = req.params.id;
    try{

        const {name, description} = req.body;

        const task = await Task.findbyid({_id: id}).exec();

        if(!task){
            res.status(500).json("Task not found");
        }

        task.name = name;
        task.description = description;

        await Task.save();

        res.status(200).json("Successfully deleted");
    }catch(error){
        res.status(500).json({error: error});
    }
}

module.exports = {
    createTask,
    getTask,
    deleteTask,
    updateTask
};