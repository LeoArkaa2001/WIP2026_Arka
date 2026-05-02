package AprilBatch_day3;
class Patient {
    private String name;
    private String diagnosis;

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
}

public class patientInfoProtect {
    public static void main(String[] args) {
        Patient p = new Patient();

        p.setName("John");
        p.setDiagnosis("Flu");

        System.out.println("Patient Name: " + p.getName());
        System.out.println("Diagnosis: " + p.getDiagnosis());
    }
}
