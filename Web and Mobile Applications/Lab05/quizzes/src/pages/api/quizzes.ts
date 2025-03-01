import { getDb } from "@/db";
import {Quiz, QuizSet} from "@/model";

const db = getDb();

export const createQuizSet = async (quizSetName: string, quizzes: Quiz[]) => {
    try {
        const quizSetData = await db.one('insert into quizsets(name) values($1) returning quizset_id', [quizSetName]);
        const quizSetId = quizSetData.quizset_id;
        for (const quiz of quizzes) {
            await db.none('insert into quizzes(question, options, answer, quizset_id) values($1, $2, $3, $4)', [quiz.question, quiz.options, quiz.answer, quizSetId]);
        }
    }
    catch (error) {
        console.error('Error creating quiz set:', error);
        throw error;
    }
}

export const getQuizSets = async () => {
    const quizSetData = await db.any('select * from quizsets, quizzes where quizzes.quizset_id = quizsets.quizset_id');
    let quizSets: QuizSet[] = [];
    quizSetData.forEach((row: any) => {
        const newQuizSet = {
            id: row.quizset_id,
            name: row.name,
            quizzes: []
        };
        quizSets.push(newQuizSet);
    });
    quizSetData.forEach((row: any) => {
        const newQuiz: Quiz = {
            id: row.quiz_id,
            question: row.question,
            options: row.options,
            answer: row.answer,
            quizSetId: row.quizset_id
        };
        const quizSet = quizSets.find((quizSet) => quizSet.id === row.quizset_id);
        if (quizSet) {
            quizSet.quizzes.push(newQuiz);
        }
    });
    return quizSets;
}
