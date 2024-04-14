"use client"
import React, { useState } from 'react';

const CreateQuiz = () => {
    const [question, setQuestion] = useState('');
    const [choices, setChoices] = useState([]);
    const [correctAnswer, setCorrectAnswer] = useState('');

    const handleQuestionChange = (e) => {
        setQuestion(e.target.value);
    };

    const handleSubmit = (quiz) => {
        console.log(quiz)
    }

    const handleChoiceChange = (e, index) => {
        const updatedChoices = [...choices];
        updatedChoices[index] = e.target.value;
        setChoices(updatedChoices);
    };

    const handleCorrectAnswerChange = (e) => {
        setCorrectAnswer(e.target.value);
    };

    const handleAddChoice = () => {
        setChoices([...choices, '']);
    };

    const handleRemoveChoice = (index) => {
        const updatedChoices = [...choices];
        updatedChoices.splice(index, 1);
        setChoices(updatedChoices);
    };

    const handleSubmitQuiz = () => {
        // Validate inputs and call the handleSubmit prop
        if (question.trim() === '' || choices.length < 2 || correctAnswer.trim() === '') {
            // Handle validation error
            return;
        }

        handleSubmit({
            question,
            choices,
            correctAnswer
        });

        // Reset form
        setQuestion('');
        setChoices([]);
        setCorrectAnswer('');
    };

    return (
        <div className="mx-auto max-w-lg p-4">
            <h2 className="text-3xl font-bold mb-4">Create Quiz</h2>
            <form>
                <div className="mb-4">
                    <label className="block mb-2">Question:</label>
                    <input type="text" value={question} onChange={handleQuestionChange} className="border border-gray-300 rounded-md py-2 px-3" />
                </div>
                <div className="mb-4">
                    <label className="block mb-2">Choices:</label>
                    {choices.map((choice, index) => (
                        <div key={index} className="mb-2 flex items-center">
                            <input type="text" value={choice} onChange={(e) => handleChoiceChange(e, index)} className="border border-gray-300 rounded-md py-2 px-3 mr-2" />
                            <button type="button" onClick={() => handleRemoveChoice(index)} className="bg-red-500 hover:bg-red-600 text-white py-2 px-4 rounded-md">Remove</button>
                        </div>
                    ))}
                    <button type="button" onClick={handleAddChoice} className="bg-blue-500 hover:bg-blue-600 text-white py-2 px-4 rounded-md">Add Choice</button>
                </div>
                <div className="mb-4">
                    <label className="block mb-2">Correct Answer:</label>
                    <input type="text" value={correctAnswer} onChange={handleCorrectAnswerChange} className="border border-gray-300 rounded-md py-2 px-3" />
                </div>
                <button type="button" onClick={handleSubmitQuiz} className="bg-green-500 hover:bg-green-600 text-white py-2 px-4 rounded-md">Submit</button>
            </form>
        </div>
    );
};

export default CreateQuiz;