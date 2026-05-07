package AprilBatch_day12;
import java.io.*;


class employee implements Serializable {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 int id;
 String name;

 employee(int id, String name) {
     this.id = id;
     this.name = name;
 }
}

public class employeeApplication {
 public static void main(String[] args) {

     employee emp = new employee(1, "Renu");

   
     try (ObjectOutputStream oos =
              new ObjectOutputStream(new FileOutputStream("emp.dat"))) {

         oos.writeObject(emp);
         System.out.println("Employee saved!");

     } catch (IOException e) {
         System.out.println(e);
     }
 }
}
