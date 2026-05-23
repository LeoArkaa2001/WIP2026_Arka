package AprilBatch_day17;

import java.sql.*;

public class db_Connection_Assignment {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/employee_jdbc_db";
        String username = "root";
        String password = "Arka@2001";

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Database Connected Successfully!");



            

            String insertQuery = "INSERT INTO employees(emp_name, department, salary, username, password) VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(insertQuery);

            ps.setString(1, "Arka");
            ps.setString(2, "IT");
            ps.setDouble(3, 60000);
            ps.setString(4, "arka");
            ps.setString(5, "123");
            ps.executeUpdate();

            ps.setString(1, "Rahul");
            ps.setString(2, "HR");
            ps.setDouble(3, 45000);
            ps.setString(4, "rahul");
            ps.setString(5, "111");
            ps.executeUpdate();

            ps.setString(1, "Sneha");
            ps.setString(2, "Testing");
            ps.setDouble(3, 70000);
            ps.setString(4, "sneha");
            ps.setString(5, "222");
            ps.executeUpdate();

            ps.setString(1, "Amit");
            ps.setString(2, "Development");
            ps.setDouble(3, 55000);
            ps.setString(4, "amit");
            ps.setString(5, "333");
            ps.executeUpdate();

            ps.setString(1, "Priya");
            ps.setString(2, "IT");
            ps.setDouble(3, 80000);
            ps.setString(4, "priya");
            ps.setString(5, "444");
            ps.executeUpdate();

            System.out.println(" Employee Records Inserted!");



            

            Statement stmt = con.createStatement();

            String fetchQuery = "SELECT * FROM employees WHERE salary > 50000";

            ResultSet rs = stmt.executeQuery(fetchQuery);

            System.out.println("\nEmployees Salary Greater Than 50000:");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("emp_id") + " "
                        + rs.getString("emp_name") + " "
                        + rs.getString("department") + " "
                        + rs.getDouble("salary"));
            }



            

            String deleteQuery = "DELETE FROM employees WHERE emp_id=?";

            PreparedStatement deletePs = con.prepareStatement(deleteQuery);

            deletePs.setInt(1, 2);

            deletePs.executeUpdate();

            System.out.println("\nEmployee Deleted Successfully!");



           

            String updateQuery = "UPDATE employees SET salary=? WHERE emp_id=?";

            PreparedStatement updatePs = con.prepareStatement(updateQuery);

            updatePs.setDouble(1, 90000);

            updatePs.setInt(2, 1);

            updatePs.executeUpdate();

            System.out.println("Employee Salary Updated!");



           

            String countQuery = "SELECT COUNT(*) FROM employees";

            ResultSet countRs = stmt.executeQuery(countQuery);

            while (countRs.next()) {

                System.out.println("\nTotal Employees: " + countRs.getInt(1));
            }



           

            String highestQuery = "SELECT * FROM employees ORDER BY salary DESC LIMIT 1";

            ResultSet highestRs = stmt.executeQuery(highestQuery);

            System.out.println("\nHighest Salary Employee:");

            while (highestRs.next()) {

                System.out.println(
                        highestRs.getString("emp_name") + " "
                        + highestRs.getDouble("salary"));
            }



           

            String loginQuery = "SELECT * FROM employees WHERE username=? AND password=?";

            PreparedStatement loginPs = con.prepareStatement(loginQuery);

            loginPs.setString(1, "arka");

            loginPs.setString(2, "123");

            ResultSet loginRs = loginPs.executeQuery();

            System.out.println("\nLogin Validation:");

            if (loginRs.next()) {

                System.out.println("Login Successful!");
            }

            else {

                System.out.println("Invalid Login!");
            }



            

            String deptQuery = "SELECT * FROM employees ORDER BY department";

            ResultSet deptRs = stmt.executeQuery(deptQuery);

            System.out.println("\nDepartment Wise Employees:");

            while (deptRs.next()) {

                System.out.println(
                        deptRs.getString("department") + " "
                        + deptRs.getString("emp_name"));
            }



           

            CallableStatement cs = con.prepareCall("{call search_employee(?)}");

            cs.setString(1, "Arka");

            ResultSet spRs = cs.executeQuery();

            System.out.println("\nStored Procedure Result:");

            while (spRs.next()) {

                System.out.println(
                        spRs.getString("emp_name") + " "
                        + spRs.getString("department"));
            }



            con.close();

            System.out.println("\nConnection Closed Successfully!");

        }

        catch (Exception e) {

            System.out.println(e);
        }
    }
}