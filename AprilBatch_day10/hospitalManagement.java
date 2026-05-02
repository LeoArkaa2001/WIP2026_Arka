package AprilBatch_day10;
import java.util.LinkedList;

class hospitalManagement {

    LinkedList<String> queue = new LinkedList<>();

    void addPatient(String name) {
        queue.addLast(name);
        System.out.println(name + " added to queue.");
    }

    void addEmergency(String name) {
        queue.addFirst(name);
        System.out.println(name + " added as emergency.");
    }
  
    void removePatient() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println(queue.removeFirst() + " treated and removed.");
        }
    }
   
    void viewPatients() {
        if (queue.isEmpty()) {
            System.out.println("No patients in queue.");
            return;
        }
        System.out.println("Queue:");
        for (String p : queue) {
            System.out.println(p);
        }
    }
  
    void checkFirstLast() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("First: " + queue.getFirst());
            System.out.println("Last: " + queue.getLast());
        }
    }

    public static void main(String[] args) {
        hospitalManagement hm = new hospitalManagement();

        hm.addPatient("Arka");
        hm.addPatient("Kaushik");
        hm.addEmergency("Aarif");

        hm.viewPatients();

        hm.checkFirstLast();

        hm.removePatient();

        hm.viewPatients();
    }
}
