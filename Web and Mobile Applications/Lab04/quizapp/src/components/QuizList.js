"use client"
import React, { useEffect, useState } from 'react';
import Link from 'next/link';

const QuizList = ({ }) => {
  const [quizzes, setQuizzes] = useState([]);

  useEffect(() => {
    const quizzesData = JSON.parse(localStorage.getItem('quizzes')) || [];
    setQuizzes(quizzesData);
  }, []);
  return (
        <div className="mx-auto max-w-lg p-4">
            <h1 className="text-3xl font-bold mb-4">Select a Quiz</h1>
            {quizzes.map((quiz, index) => (
                <div key={index} className="mb-4">
                    <Link href={`/quiz/${index}`}>
                        <div className="block bg-white hover:bg-gray-100 text-black border border-gray-300 rounded-lg py-3 px-4 transition duration-300 ease-in-out">
                            Quiz {index + 1}
                        </div>
                    </Link>
                </div>
            ))}
        </div>
    );
};

export default QuizList;