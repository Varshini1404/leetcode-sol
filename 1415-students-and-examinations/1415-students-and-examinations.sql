SELECT s.student_id , s.student_name , sub.subject_name , COUNT(e.subject_name) as attended_exams
FROM Students s INNER JOIN Subjects sub
LEFT JOIN Examinations e ON s.student_id=e.student_id and e.subject_name = sub.subject_name
GROUP BY s.student_id , sub.subject_name
ORDER BY 1



