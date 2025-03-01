import pgPromise from 'pg-promise';
require('dotenv').config();

let db: any = null;
const pgp = pgPromise();

const connectionString = String(process.env.DATABASE_URL);

function getDb(): any {
    if (!db) {
        db = pgp(connectionString);
    }
    return db;
}

export { getDb };
