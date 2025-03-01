export interface Quiz {
    id: number;
    question: string;
    options: string[];
    answer: string;
    quizSetId: number;
}

export interface QuizSet {
    id: number;
    name: string;
    quizzes: Quiz[];
}
