package dao;

import Entity.Lessons;

import java.util.List;

public interface LessonDAO {
    List<Lessons> getAll();
    Lessons getById(int id);
}
