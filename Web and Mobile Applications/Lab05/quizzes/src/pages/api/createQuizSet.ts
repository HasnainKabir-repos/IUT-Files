// pages/api/createQuizSet.ts

import { NextApiRequest, NextApiResponse } from 'next';
import { createQuizSet } from '@/pages/api/quizzes';

export default async function handler(req: NextApiRequest, res: NextApiResponse) {
    if (req.method === 'POST') {
        const { name, quizzes } = req.body;
        try {
            await createQuizSet(name, quizzes);
            res.status(200).json({ message: 'Quiz set created successfully.' });
        } catch (error) {
            res.status(500).json({ error: 'An error occurred while creating the quiz set.' });
        }
    } else {
        res.status(405).json({ error: 'Method not allowed.' });
    }
}
