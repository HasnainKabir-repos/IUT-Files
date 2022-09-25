SELECT ID, count(course_id) FROM instructor
NATURAL
LEFT OUTER JOIN teaches GROUP BY ID;