package Bl;

import Service.MysqlLessonDAO;
import Service.MysqlStudentDAO;
import dao.LessonDAO;
import dao.StudentDAO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MysqlDAOFactory extends DAOFactory {
    private static String url = "";
    private static String username = "";
    private static String password = "";

    //Method to create jdbc-connections
    public static Connection createConnection() {
        Connection connection = null;
        try {
            Properties p = new Properties();
            FileInputStream in = new FileInputStream("jdbcProperties.properties");
            p.load(in);
            url = p.getProperty("URL");
            username = p.getProperty("USERNAME");
            password = p.getProperty("PASSWORD");

        } catch (IOException e) {
            System.err.println("Error in jdbcFactory getConnection method " + e);
        }
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.err.println("Error in jdbcFactory getConnection method" + e);
        }
        return connection;
    }
    //Necessary added here all get-ed methods
    public LessonDAO getLessonDAO() {
        return new MysqlLessonDAO();
    }

    @Override
    public StudentDAO getStudentDAO() {
        return new MysqlStudentDAO();
    }
}
