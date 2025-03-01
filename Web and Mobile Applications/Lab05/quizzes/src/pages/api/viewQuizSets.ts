import { NextApiRequest, NextApiResponse } from 'next';
import { getQuizSets } from '@/pages/api/quizzes';

export default async function handler(req: NextApiRequest, res: NextApiResponse) {
    if (req.method === 'GET') {
        try {
            const quizSets = await getQuizSets();
            res.status(200).json(quizSets);
        } catch (error) {
            res.status(500).json({ error: 'An error occurred while fetching the quiz sets.' });
        }
    } else {
        res.status(405).json({ error: 'Method not allowed.' });
    }
}
