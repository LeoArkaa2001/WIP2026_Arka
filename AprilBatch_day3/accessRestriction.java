package AprilBatch_day3;
class Employee {
    private int salary; // private variable

    // Getter
    public int getSalary() {
        return salary;
    }

    // Setter
    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
}

public class accessRestriction {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setSalary(50000);
        System.out.println("Salary: " + emp.getSalary());
    }
}

