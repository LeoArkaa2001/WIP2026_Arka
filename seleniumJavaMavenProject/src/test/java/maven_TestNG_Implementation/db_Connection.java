package maven_TestNG_Implementation;

import java.sql.Connection;
import java.sql.DriverManager;

public class db_Connection {

    static Connection con;

    public static Connection getConnection() {

        try {

            String url = "jdbc:mysql://localhost:3306/swaglabs_db";

            String user = "root";

            String password = "Arka@2001";

            con = DriverManager.getConnection(url, user, password);

            System.out.println("Database Connected Successfully");

        } catch (Exception e) {

            e.printStackTrace();
        }

        return con;
    }
}