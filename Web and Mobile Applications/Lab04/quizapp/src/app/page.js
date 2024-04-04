import React from 'react';
import QuizList from '../components/QuizList';
import Link from 'next/link';
import {quizzes} from './quizdata';
const Home = () => {
  return (<>
            <QuizList quizzes={quizzes} />
            <Link href={'/createQuiz'}>Create a Quiz</Link>
          </>
  );
};

export default Home;