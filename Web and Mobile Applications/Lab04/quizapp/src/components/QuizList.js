import React from 'react';
import Link from 'next/link';

const QuizList = ({ quizzes }) => {
  return (
    <div>
      <h1>Select a Quiz</h1>
      {quizzes.map((quiz, index) => (
        <div key={index}>
          <Link href={`/quiz/${index}`}>
            <div>{quiz.title}</div>
          </Link>
        </div>
      ))}
    </div>
  );
};

export default QuizList;