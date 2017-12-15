package dao;

import Entity.User;

import java.util.List;

public interface UserDAO {
    void add(User user);
    List<User> getAll();
    Entity.Lesson_Student getByStudentAndLessonId(int studentId, int lessonId);
    void update(User user);
    void remove(User user);
}
