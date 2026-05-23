package maven_TestNG_Implementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dataBaseReader {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/companyDB",
                    "root",
                    "Arka@2001");

            Statement stmt = con.createStatement();

            
            ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");

            System.out.println("Before Update:\n");
         

            while (rs.next()) {

                int id = rs.getInt("Employee_id");
                String name = rs.getString("Employee_name");
                int age = rs.getInt("Employee_age");

                System.out.println(id + " " + name + " " + age);
            }

       
            stmt.executeUpdate(
                    "UPDATE Employee SET Employee_age = 67 WHERE Employee_id = 3");

            System.out.println("\nAge Updated Successfully\n");

         
            ResultSet rs2 = stmt.executeQuery("SELECT * FROM Employee");

            System.out.println("After Update:\n");
           

            while (rs2.next()) {

                int id = rs2.getInt("Employee_id");
                String name = rs2.getString("Employee_name");
                int age = rs2.getInt("Employee_age");

                System.out.println(id + " " + name + " " + age);
            }

            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}