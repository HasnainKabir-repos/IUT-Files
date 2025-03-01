import React, { useState } from 'react';
import {Quiz} from "@/model";
import {createQuizSet} from "@/pages/api/quizzes";
import {Link} from "react-router-dom";

export default function CreateQuizSetPage() {
    const [name, setName] = useState('');
    const [quizzes, setQuizzes] = useState<Quiz[]>([]);

    const handleAddQuiz = () => {
        const newQuiz: Quiz = { id: 0, question: '', options: ['', '', '', ''], answer: '', quizSetId: 0 };
        setQuizzes([...quizzes, newQuiz]);
    };

    const handleRemoveQuiz = (index: number) => {
        const newQuizzes = [...quizzes];
        newQuizzes.splice(index, 1);
        setQuizzes(newQuizzes);
    };

    const handleQuizChange = (e: React.ChangeEvent<HTMLInputElement>, index: number, field: 'question' | 'answer') => {
        const newQuizzes: Quiz[] = quizzes.map((quiz, i) => i === index ? { ...quiz, [field]: e.target.value } : quiz);
        setQuizzes(newQuizzes);
    };

    const handleOptionChange = (e: React.ChangeEvent<HTMLInputElement>, quizIndex: number, optionIndex: number) => {
        const newQuizzes: Quiz[] = quizzes.map((quiz, i) => i === quizIndex ? { ...quiz, options: quiz.options.map((option, j) => j === optionIndex ? e.target.value : option) } : quiz);
        setQuizzes(newQuizzes);
    };

    const handleSubmit = async (e: { preventDefault: () => void; }) => {
        e.preventDefault();
        const quizSet = { name, quizzes };
        const response = await fetch('/api/createQuizSet', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(quizSet),
        });
        const data = await response.json();
        if (response.ok) {
            alert('QuizSet created successfully' + ' ' + data.message);
        } else {
            alert('Error creating quizset' + ' ' + data.error);
        }
    };

    return (
        <div>
        <form onSubmit={handleSubmit}>
            <input type="text" value={name} onChange={(e) => setName(e.target.value)} placeholder="QuizSet Name" required />
            {quizzes.map((quiz, index) => (
                <div key={index}>
                    <input type="text" value={quiz.question} onChange={(e) => handleQuizChange(e, index, 'question')} placeholder="Question" required />
                    {quiz.options.map((option, optionIndex) => (
                        <input key={optionIndex} type="text" value={option} onChange={(e) => handleOptionChange(e, index, optionIndex)} placeholder={`Option ${optionIndex + 1}`} required />
                    ))}
                    <input type="text" value={quiz.answer} onChange={(e) => handleQuizChange(e, index, 'answer')} placeholder="Answer" required />
                    <button type="button" onClick={() => handleRemoveQuiz(index)}>Remove Quiz</button>
                </div>
            ))}
            <button type="button" onClick={handleAddQuiz}>Add Quiz</button>
            <button type="submit">Create QuizSet</button>
        </form>
        </div>
    );
}
