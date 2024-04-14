import React from 'react';
import QuizList from '../components/QuizList';
import Link from 'next/link';
import {quizzes} from './quizdata';
const Home = () => {
  return (<>
            <QuizList quizzes={quizzes} />
            <div className='block bg-white hover:bg-gray-100 text-black border border-gray-300 rounded-lg py-3 px-4 transition duration-300 ease-in-out'>
              <Link href={'/createQuiz'}>Create a Quiz</Link>
            </div>
            
          </>
  );
};

export default Home;