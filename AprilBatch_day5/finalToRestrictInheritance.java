package AprilBatch_day5;

final class SecurityModule {

    public void encryptData(String data) {
        System.out.println("Encrypting data: " + data);
    }
}

/* * class AdvancedSecurity extends SecurityModule { } */
 

public class finalToRestrictInheritance {
    public static void main(String[] args) {
        SecurityModule sm = new SecurityModule();
        sm.encryptData("Sensitive Information");
    }
}
