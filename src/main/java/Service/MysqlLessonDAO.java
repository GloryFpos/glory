package Service;


import Bl.MysqlDAOFactory;
import Entity.Lessons;
import dao.LessonDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlLessonDAO implements LessonDAO {
    public MysqlLessonDAO() {

    }

    @Override
    public List<Lessons> getAll() {
        ArrayList<Lessons> list = new ArrayList<>();
        Connection connection = MysqlDAOFactory.createConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            String sql = "SELECT * FROM Lessons";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Lessons lessons = new Lessons();
                lessons.setId(resultSet.getInt("id"));
                lessons.setNameLesson(resultSet.getString("NameLesson"));
                list.add(lessons);
            }
        } catch (SQLException e) {
            System.out.println("Error in getAll method MysqlLessonDAO: " + e);
        }

        return list;
    }

    @Override
    public Lessons getById(int id) {
        return null;
    }
}
