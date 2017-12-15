package Service;

import Bl.DAOFactory;
import Bl.MysqlDAOFactory;
import Entity.Student;
import dao.StudentDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlStudentDAO implements StudentDAO {

    public MysqlStudentDAO() {

    }

    @Override
    public List<Student> getAll() {
        ArrayList<Student> list = new ArrayList<>();
        Connection connection = MysqlDAOFactory.createConnection();
        Statement statement;
        try {
            statement = connection.createStatement();
            statement.executeQuery("SELECT * FROM student");
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setFirstName(resultSet.getString("FirstName"));
                student.setLastName(resultSet.getString("LastName"));
                student.setAll_propuski(resultSet.getInt("all_propuski"));
                student.setBad_propuski(resultSet.getInt("bad_propuski"));
                student.setGood_propuski(resultSet.getInt("good_propuski"));
                list.add(student);
            }
        } catch (SQLException e) {
            System.out.println("" + e);
        }
        return list;
    }


    @Override
    public void update(Student lessons) {

    }
}
