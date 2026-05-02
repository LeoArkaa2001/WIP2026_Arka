package AprilBatch_day10;
import java.util.ArrayList;

class patientManagement {

    ArrayList<String> patients = new ArrayList<>();

   
    void addPatient(String name) {
        patients.add(name);
        System.out.println(name + " added.");
    }

    void listPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
            return;
        }
        System.out.println("Patient List:");
        for (String p : patients) {
            System.out.println(p);
        }
    }

    
    void searchPatient(String name) {
        if (patients.contains(name)) {
            System.out.println(name + " found.");
        } else {
            System.out.println(name + " not found.");
        }
    }

    public static void main(String[] args) {
        patientManagement pm = new patientManagement();

        pm.addPatient("Arka");
        pm.addPatient("Kaushik");
        pm.addPatient("Gourab");

        pm.listPatients();

        pm.searchPatient("Arka");
        pm.searchPatient("Aarif");
    }
}