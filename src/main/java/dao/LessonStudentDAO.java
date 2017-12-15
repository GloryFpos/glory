package dao;

import Entity.Lesson_Student;
import Entity.Student;

import java.util.List;

public interface LessonStudentDAO {
    void add(Lesson_Student lesson_student);
    List<Lesson_Student> getAll();
    Entity.Lesson_Student getByStudentAndLessonId(int studentId, int lessonId);
    void update(Student student);
}
