package AprilBatch_day4;

class Patient {                                                  // Patient Class as Encapsulation
 private int id;
 private String name;
 private int age;
 private String illness;

 public Patient(int id, String name, int age, String illness) {
     this.id = id;
     this.name = name;
     this.age = age;
     this.illness = illness;
 }

 public int getId() {                              // Getter method so values can be accessed by other classes
     return id;
 }

 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 public String getIllness() {
     return illness;
 }


 public void setName(String name) {                    // Setter method to update the values
     this.name = name;
 }

 public void setAge(int age) {
     this.age = age;
 }

 public void setIllness(String illness) {
     this.illness = illness;
 }
}

interface PatientService {                                      // Patient Services as interface to hide them from user
 void registerPatient(Patient patient);
 void showPatientDetails(int patientId);
}


class PatientServiceImpl implements PatientService {           //Implementation of interface

 private Patient[] patients = new Patient[100]; 
 private int count = 0;

 @Override                                                      // method overriding for registering patient in array                                       
 public void registerPatient(Patient patient) {
     if (count < patients.length) {
         patients[count] = patient; 
         count++;
         System.out.println("Patient registered successfully: " + patient.getName());
     } else {
         System.out.println("Patient storage is full!");
     }
 }

 @Override
 public void showPatientDetails(int patientId) {                 // method overriding to update patient info

     boolean found = false;

     for (int i = 0; i < count; i++) {
         if (patients[i].getId() == patientId) {                 

             System.out.println("\nPatient Details:");
             System.out.println("ID: " + patients[i].getId());
             System.out.println("Name: " + patients[i].getName());
             System.out.println("Age: " + patients[i].getAge());
             System.out.println("Illness: " + patients[i].getIllness());

             found = true;
             break;
         }
     }

     if (!found) {
         System.out.println("Patient not found!");
     }
 }
}


abstract class Doctor {                                          //Abstraction as Doctor Class
 protected String name;
 protected String specialization;

 public Doctor(String name, String specialization) {
     this.name = name;
     this.specialization = specialization;
 }

 abstract void diagnose(Patient patient);
}


class GeneralPhysician extends Doctor {                          // General Physician inherits doc class 

 public GeneralPhysician(String name) {
     super(name, "General Physician");
 }

 @Override                                                       // overriding if illness doesn't match doctor criteria  
 void diagnose(Patient patient) {
     System.out.println("\nDr. " + name + " (General Physician) is diagnosing " + patient.getName());
     System.out.println("Basic diagnosis for illness: " + patient.getIllness());
 }
}


class Cardiologist extends Doctor {                              // Cardiologist inherits doc class

 public Cardiologist(String name) {
     super(name, "Cardiologist");
 }

     @Override                                                       // overriding if illness doesn't match doctor criteria
     void diagnose(Patient patient) {
     System.out.println("\nDr. " + name + " (Cardiologist) is diagnosing " + patient.getName());

     if (patient.getIllness().toLowerCase().contains("heart")) {
         System.out.println("Specialized cardiac diagnosis for: " + patient.getIllness());
     } else {
         System.out.println("Not a heart issue. Refer to General Physician.");
     }
 }
}


public class healthcareModule {                                   //POE of code

 public static void main(String[] args) {

     
     PatientService service = new PatientServiceImpl();

     
     Patient p1 = new Patient(1, "Arka", 24, "Fever");
     Patient p2 = new Patient(2, "Kaushik", 35, "Heart Pain");

   
     service.registerPatient(p1);
     service.registerPatient(p2);

     
     service.showPatientDetails(1);
     service.showPatientDetails(2);

     
     Doctor gp = new GeneralPhysician("T.K Nashkar");
     Doctor cardio = new Cardiologist("Bhashkar Dutta");

     
     gp.diagnose(p1);                                               // Diagnosis as Polymorphism
     gp.diagnose(p2);

     cardio.diagnose(p1);
     cardio.diagnose(p2);
 }
}