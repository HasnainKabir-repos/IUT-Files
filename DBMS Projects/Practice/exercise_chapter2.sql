/*SELECT title from course WHERE dept_name = 'Comp. Sci.' and credits = 3;*/
SELECT distinct s_ID FROM advisor WHERE i_ID = (SELECT ID FROM instructor WHERE name = 'Einstein');

SELECT max(salary) FROM instructor;

SELECT ID, name FROM instructor  WHERE salary = (SELECT max(salary) FROM instructor);

SELECT course_id, sec_id , (SELECT count(ID) FROM takes WHERE
 takes.semester = section.semester and takes.year = section.year and takes.course_id = section.course_id
 and takes.sec_id = section.sec_id) as enrollment
FROM section WHERE semester = 'Fall' and year = '2017';

SELECT max(enrollment) from (SELECT course_id, sec_id , (SELECT count(ID) FROM takes WHERE
 takes.semester = section.semester and takes.year = section.year and takes.course_id = section.course_id
 and takes.sec_id = section.sec_id) as enrollment
FROM section WHERE semester = 'Fall' and year = '2017');

with see_enrollment as (SELECT takes.course_id, takes.sec_id ,count(ID) as enrollment FROM takes,section 
WHERE takes.semester = section.semester 
 and takes.year = section.year 
 and takes.course_id = section.course_id
 and takes.sec_id = section.sec_id
and takes.semester = 'Fall' 
and takes.year = '2017' group by takes.course_id, takes.sec_id)
SELECT course_id, sec_id FROM see_enrollment where enrollment = 
(SELECT max(enrollment) FROM see_enrollment);

/*UPDATE instructor set salary = salary*1.10 WHERE dept_name = 'Comp. Sci.';*/
/*DELETE FROM course WHERE course_id NOT IN (SELECT section.course_id FROM section);*/
/*INSERT INTO instructor SELECT ID, name, dept_name, 30000 FROM student WHERE tot_cred > 100;*/

/*SELECT ID FROM depositor minus SELECT ID FROM borrower;*/

/*SELECT ID FROM customer WHERE customer_street = (SELECT customer_street FROM customer WHERE ID = '12345');*/

SELECT distinct student.ID, student.name FROM student,takes WHERE student.ID = takes.ID and takes.course_id in
(SELECT
    course_id FROM course WHERE dept_name = 'Comp. Sci.');
    
    
SELECT ID, name FROM student WHERE ID in (SELECT ID FROM takes WHERE year>2016);

SELECT dept_name, max(salary) FROM instructor GROUP BY dept_name;

WITH max_salary as 
(SELECT dept_name, max(salary) as s FROM instructor GROUP BY dept_name)
SELECT min(s) FROM max_salary ;


/*INSERT INTO course values('CS-001', 'Weekly Seminar', 'Comp. Sci.', 0);*/

SELECT ID, count(course_id) FROM instructor
NATURAL
LEFT OUTER JOIN teaches GROUP BY ID;


SELECT ID, (SELECT count(*) FROM teaches t WHERE t.ID = i.ID) as Number_of_courses
FROM instructor i;

SELECT dept_name, count(ID) FROM department NATURAL LEFT OUTER JOIN instructor GROUP BY dept_name;