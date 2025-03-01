import { useState, useEffect } from 'react';
import axios from 'axios';

interface Quiz {
    id: number;
    question: string;
    options: string[];
    answer: string;
}

export default function Quizzes() {
    const [quizzes, setQuizzes] = useState<Quiz[]>([]);

    useEffect(() => {
        const fetchQuizzes = async () => {
            const res = await axios.get('/api/quizzes');
            return res.data;
        };

        fetchQuizzes().then(data => setQuizzes(data));
    }, []);

    return (
        <div>
            {quizzes.map((quiz, index) => (
                <div key={index}>
                    <h2>{quiz.question}</h2>
                    {quiz.options.map((option, index) => (
                        <button key={index} onClick={() => checkAnswer(option, quiz.answer)}>{option}</button>
                    ))}
                </div>
            ))}
        </div>
    );

    function checkAnswer(option: string, answer: string) {
        if (option === answer) {
            alert('Correct!');
        } else {
            alert('Incorrect!');
        }
    }
}
