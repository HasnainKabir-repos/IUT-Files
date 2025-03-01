"use client"
import Quiz from '../../../components/Quiz';
import React, {useState, useEffect} from 'react';
const QuizPage = ({ params }) => {
    const id = params.id;
    const [quizzes, setQuizzes] = useState([]);

    useEffect(() => {
        const quizzesData = JSON.parse(localStorage.getItem('quizzes')) || [];
        setQuizzes(quizzesData);
        
    }, []);
    useEffect(() =>{
        console.log(quizzes);
    }, [quizzes]);
    return (
        <div>
            {quizzes.length > 0 && <Quiz quiz={quizzes[id]} size={quizzes.length}/>}
        </div>
    );
};

export default QuizPage;