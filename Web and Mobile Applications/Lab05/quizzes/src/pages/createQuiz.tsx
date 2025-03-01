import { useState } from 'react';
import axios from 'axios';

export default function CreateQuiz() {
    const [question, setQuestion] = useState('');
    const [options, setOptions] = useState(['', '', '', '']);
    const [answer, setAnswer] = useState('');

    const handleOptionChange = (index: number, value: string) => {
        const newOptions = [...options];
        newOptions[index] = value;
        setOptions(newOptions);
    };

    const handleSubmit = async (e: { preventDefault: () => void; }) => {
        e.preventDefault();
        const quiz = { question, options, answer };
        await axios.post('/api/quizzes', quiz)
            .then(() => {
                alert('Quiz created successfully');
            })
            .catch((error) => {
                console.error('Error creating quiz:', error);
            });
    };

    return (
        <form onSubmit={handleSubmit}>
            <input type="text" value={question} onChange={(e) => setQuestion(e.target.value)} placeholder="Question" required />
            {options.map((option, index) => (
                <input key={index} type="text" value={option} onChange={(e) => handleOptionChange(index, e.target.value)} placeholder={`Option ${index + 1}`} required />
            ))}
            <input type="text" value={answer} onChange={(e) => setAnswer(e.target.value)} placeholder="Answer" required />
            <button type="submit">Create Quiz</button>
        </form>
    );
}
