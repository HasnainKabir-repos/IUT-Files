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
        <div>
            <h2>{quiz.questions[currentQuestion].question}</h2>
            {quiz.questions[currentQuestion].choices.map((choice, index) => (
                <div key={index}>
                    <button onClick={() => handleAnswer(choice)}>{choice}</button>
                </div>
            ))}
            <p>Time remaining: {timer} seconds</p>
            <p>Score: {score}</p>
            <br></br>
            {currentQuestion === quiz.questions.length - 1 && (
                <Link href="/">Home</Link>
            )}
        </div>
    );
};

export default Quiz;