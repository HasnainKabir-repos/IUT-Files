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
        <div>
            <h2>Create Quiz</h2>
            <form>
                <div>
                    <label>Question:</label>
                    <input type="text" value={question} onChange={handleQuestionChange} style={{ color: 'black' }} />
                </div>
                <div>
                    <label>Choices:</label>
                    {choices.map((choice, index) => (
                        <div key={index}>
                            <input type="text" value={choice} onChange={(e) => handleChoiceChange(e, index)} style={{ color: 'black' }} />
                            <button type="button" onClick={() => handleRemoveChoice(index)}>Remove</button>
                        </div>
                    ))}
                    <button type="button" onClick={handleAddChoice}>Add Choice</button>
                </div>
                <div>
                    <label>Correct Answer:</label>
                    <input type="text" value={correctAnswer} onChange={handleCorrectAnswerChange} style={{ color: 'black' }} />
                </div>
                <button type="button" onClick={handleSubmitQuiz}>Submit</button>
            </form>
        </div>
    );
};

export default CreateQuiz;