package AprilBatch_day10;
import java.util.*;

class Patient implements Comparable<Patient> {
    int id;
    String name;

    Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

   
    @Override
    public int compareTo(Patient other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class hospitalSystem {

    public static void main(String[] args) {

        TreeSet<Patient> patients = new TreeSet<>();

        
        addPatient(patients, new Patient(101, "Arka"));
        addPatient(patients, new Patient(102, "Kaushik"));
        addPatient(patients, new Patient(103, "Aarif"));
        addPatient(patients, new Patient(101, "Sunny")); 

        
        displayPatients(patients);
    }

    
    public static void addPatient(TreeSet<Patient> patients, Patient p) {
        if (patients.add(p)) {
            System.out.println("Patient added: " + p.id);
        } else {
            System.out.println("Patient with ID " + p.id + " is already registered.");
        }
    }

    
    public static void displayPatients(TreeSet<Patient> patients) {
        System.out.println("\nRegistered Patients (Sorted by ID):");
        for (Patient p : patients) {
            System.out.println(p);
        }
    }
}
