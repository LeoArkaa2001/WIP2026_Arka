package AprilBatch_day12;
import java.io.*;


class Employee implements Serializable {
	
	int empId;
    String empName;
    double salary;

    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
}

public class serializationDemo {
    public static void main(String[] args) {

        Employee emp = new Employee(101, "Arka", 45000.0);

       
        try (FileOutputStream fos = new FileOutputStream("employee.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(emp);
            System.out.println("Employee object serialized successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}