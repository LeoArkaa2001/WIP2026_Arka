package AprilBatch_day11;
import java.util.*;

class patient {
    int id;
    String name;
    int age;

    public patient(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return id + " " + name + " " + age;
    }
}

public class patientSystem {

    HashMap<Integer, patient> hm = new HashMap<>();
    TreeMap<Integer, patient> tm = new TreeMap<>();

  
    void add(int id, String name, int age) {
        patient p = new patient(id, name, age);
        hm.put(id, p);
        tm.put(id, p);
    }

    
    void update(int id, String name, int age) {
        if (hm.containsKey(id)) {
            patient p = new patient(id, name, age);
            hm.put(id, p);
            tm.put(id, p);
            System.out.println("Updated");
        } else {
            System.out.println("Not found");
        }
    }

   
    void get(int id) {
        if (hm.containsKey(id)) {
            System.out.println(hm.get(id));
        } else {
            System.out.println("Not found");
        }
    }

    
    void remove(int id) {
        if (hm.containsKey(id)) {
            hm.remove(id);
            tm.remove(id);
            System.out.println("Removed");
        } else {
            System.out.println("Not found");
        }
    }

    
    void exists(int id) {
        System.out.println(hm.containsKey(id) ? "Exists" : "Not exists");
    }

    
    void count() {
        System.out.println("Total: " + hm.size());
    }

  
    void clearAll() {
        hm.clear();
        tm.clear();
        System.out.println("All cleared");
    }

    
    void showHashMap() {
        System.out.println("HashMap:");
        for (patient p : hm.values()) {
            System.out.println(p);
        }
    }

    void showTreeMap() {
        System.out.println("TreeMap:");
        for (patient p : tm.values()) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {

        patientSystem ps = new patientSystem();

        ps.add(1, "Arka", 23);
        ps.add(2, "Kaushik", 40);

        ps.showHashMap();
        ps.showTreeMap();

        ps.get(1);

        ps.update(1, "Arkaprava Das", 25);
        ps.get(1);

        ps.exists(3);

        ps.count();

        ps.remove(2);
        ps.showTreeMap();

        ps.clearAll();
        ps.showTreeMap();
    }
}