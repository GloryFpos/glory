package Bl;

import dao.LessonDAO;
import dao.StudentDAO;

public abstract class DAOFactory {
    public static final int MYSQL = 1;
    public static final int XML = 2;

    public abstract LessonDAO getLessonDAO();
    public abstract StudentDAO getStudentDAO();
    public static DAOFactory getDAOFactory(int wFactory) {
        switch (wFactory) {
            case MYSQL: return new MysqlDAOFactory();
        }
        return null;
    }
}
