"use client";
import React, { useState, useEffect } from 'react';
import QuizList from '../components/QuizList';
import Link from 'next/link';
import OverallProgress from '@/components/OverallProgress';
const Home = () => {
  const [Attempted, setAttempted] = useState(0);
  const [Quizzes, setQuizzes] = useState([]);
  const [Score, setScore] = useState(0);
  useEffect(()=>{
    const attempted = localStorage.getItem('attempted') || 0;
    setAttempted(attempted);
    const quizzes = JSON.parse(localStorage.getItem('quizzes')) || [];
    setQuizzes(quizzes);
    const score = localStorage.getItem('score') || 0;
    setScore(score);
  }, []);

  const handleClick = () => {
    const attempted = localStorage.getItem('attempted');
    if (attempted) {
        localStorage.setItem('attempted', parseInt(attempted) + 1);
    } else {
        localStorage.setItem('attempted', 1);
    }
  }

  useEffect(()=>{
    console.log(Quizzes);
  }, [Quizzes]);

  useEffect(()=>{
    console.log(Attempted);
  }, [Attempted]);

  useEffect(()=>{ 
    console.log(Score);
  }, [Score]);
  return (
    <>
      <div onClick={handleClick}><QuizList /></div>
      <div className='block bg-white hover:bg-gray-100 text-black border border-gray-300 rounded-lg py-3 px-4 transition duration-300 ease-in-out mb-3'>
        <Link href={'/createQuiz'} >Create a Quiz</Link>
      </div>
      <OverallProgress Attempted={Attempted} Total={Quizzes.length} Score={Score}/>
    </>
  );
};

export default Home;