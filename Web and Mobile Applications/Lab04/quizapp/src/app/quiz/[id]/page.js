"use client"
import {quizzes} from '../../quizdata';
import Quiz from '../../../components/Quiz';
import React from 'react';
const QuizPage = ({ params }) => {
    const id = params.id;
    return (
        <div>
            <Quiz quiz={quizzes[id]} />
        </div>
    );
};

export default QuizPage;