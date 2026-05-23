package AprilBatch_day17;

import java.sql.Connection;
import java.sql.DriverManager;

public class db_connection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String username = "root";
        String password = "Arka@2001";

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Database Connected Successfully!");

            con.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}