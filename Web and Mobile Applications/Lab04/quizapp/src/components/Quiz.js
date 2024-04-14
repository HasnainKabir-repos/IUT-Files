import React, { useState, useEffect } from 'react';
import Link from 'next/link';

const Quiz = ({ quiz }) => {
    const [currentQuestion, setCurrentQuestion] = useState(0);
    const [score, setScore] = useState(0);
    const [timer, setTimer] = useState(10);
    const [correctSet, SetCorrectSet] = useState(false);
    const [correct, setCorrect] = useState(false);

    useEffect(() => {
        // Start the timer for the current question
        const timerInterval = setInterval(() => {
            setTimer((prevTimer) => prevTimer - 1);
        }, 1000);

        // Move to the next question after 10 seconds
        const questionTimeout = setTimeout(() => {
            if (currentQuestion === quiz.questions.length - 1) {
                clearInterval(timerInterval);
            } else {
                setCurrentQuestion((prevQuestion) => prevQuestion + 1);
                setTimer(10);
            }
        }, 10000);

        return () => {
            clearInterval(timerInterval);
            clearTimeout(questionTimeout);
        };
    }, [currentQuestion, quiz.questions.length]);

    const handleAnswer = (answer) => {
        if (answer === quiz.questions[currentQuestion].correctAnswer) {
            setScore((prevScore) => prevScore + 1);
            setCorrect(true);
            SetCorrectSet(true);
        } else {
            setCorrect(false);
            SetCorrectSet(true);
        }

        if (currentQuestion === quiz.questions.length - 1) {
            clearInterval(timer);
        } else {
            setCurrentQuestion((prevQuestion) => prevQuestion + 1);
            setTimer(10);
        }
    };


    return (
        <div className="mx-auto max-w-lg p-4 border border-gray-300 rounded-lg shadow-md">
            <h2 className="text-2xl font-bold mb-4">{quiz.questions[currentQuestion].question}</h2>
            {quiz.questions[currentQuestion].choices.map((choice, index) => (
                <div key={index} className="mb-2">
                    <button onClick={() => handleAnswer(choice)} className="bg-blue-500 hover:bg-blue-600 text-white px-4 py-2 rounded-md focus:outline-none">
                        {choice}
                    </button>
                </div>
            ))}
            <p className="text-sm">Time remaining: {timer} seconds</p>
            <p className="text-sm">Score: {score}</p>
            <br />
            {currentQuestion === quiz.questions.length - 1 && (
                <Link href="/">
                    <a className="text-blue-500 hover:underline">Home</a>
                </Link>
            )}
        </div>
    );
};

export default Quiz;