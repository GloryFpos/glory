package Bl;





import GUI.WindowTable;


import java.io.IOException;



public class Domain {
    public static void main(String[] args) throws IOException {
        DAOFactory s = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        WindowTable w = new WindowTable();
//        w.setResizable(false);


    }

}
