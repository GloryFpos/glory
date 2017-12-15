package dao;

import Entity.Student;

import java.util.List;

public interface StudentDAO {
    List<Student> getAll();
    void update(Student lessons);
}
