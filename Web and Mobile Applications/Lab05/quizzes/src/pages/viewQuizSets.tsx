// viewQuizSets.tsx
import React, { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import axios from 'axios';
import { QuizSet} from "@/model";
import { getQuizSets } from "@/pages/api/quizzes";

const ViewQuizSetsPage = () => {
    const [quizzes, setQuizzes] = useState<QuizSet[]>([]);

    useEffect(() => {
        const fetchData = async () => {
            const response = await fetch('/api/viewQuizSets');
            const data = await response.json();
            setQuizzes(data);
        };
        fetchData();
    }, []);

    return (
        <div>
            <h2>Quiz Sets</h2>
            {quizzes.map((quizSet, index) => (
                <div key={index}>
                    <h3>{quizSet.name}</h3>
                    <ul>
                        {quizSet.quizzes.map((quiz, index) => (
                            <li key={index}>
                                <h4>{quiz.question}</h4>
                                <p>Options: {quiz.options.join(', ')}</p>
                                <p>Answer: {quiz.answer}</p>
                            </li>
                        ))}
                    </ul>
                </div>
            ))}
        </div>
    );
}

export default ViewQuizSetsPage;
