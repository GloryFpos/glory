package GUI;

import Bl.DAOFactory;
import Entity.Student;
import dao.StudentDAO;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;


public class TableModel extends AbstractTableModel {
    private int columnCount = 4;
    private static ArrayList<Object[]> dataArrayList;

    public TableModel() {
        dataArrayList = new ArrayList<>();
        for (int i = 0; i < dataArrayList.size(); i++) {
            dataArrayList.add(new String[getColumnCount()]);

        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Фамилия";
            case 1:
                return "Имя";
            case 2:
                return "Уважительные";
            case 3:
                return "Прогулы";
        }
        return null;
    }

    @Override
    public int getRowCount() {
        return dataArrayList.size();
    }

    @Override
    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object[] rows = dataArrayList.get(rowIndex);
        return rows[columnIndex];
    }

    public static void addData(Object[] row) {
        Object[] rowTable = row;
        dataArrayList.add(rowTable);
    }

    public static void addData() {
        dataArrayList.clear();
        DAOFactory daoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        StudentDAO studentDAO = daoFactory.getStudentDAO();
        for (int i = 0; i < studentDAO.getAll().size(); i++) {
            Student student = studentDAO.getAll().get(i);

            Object[] row = {
                    student.getLastName(),
                    student.getFirstName(),
                    student.getGood_propuski(),
                    student.getBad_propuski(),
            };
            addData(row);
        }
    }
}
