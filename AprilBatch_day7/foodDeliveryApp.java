package AprilBatch_day7;

class DeliverySystem {

 synchronized void process(String taskName) {
     try {
         System.out.println(taskName + " started");
         Thread.sleep(2000);
         System.out.println(taskName + " completed");
     } catch (InterruptedException e) {
         System.out.println(taskName + " interrupted");
     }
 }
}

class Delivery extends Thread {

 DeliverySystem system;

 public Delivery(String name, DeliverySystem system) {
     setName(name);
     this.system = system;
 }

 public void run() {
     system.process(getName());
 }
}

public class foodDeliveryApp {
 public static void main(String[] args) throws InterruptedException {

     DeliverySystem system = new DeliverySystem(); // shared object

     Delivery order = new Delivery("Order Processing", system);
     Delivery kitchen = new Delivery("Kitchen Preparation", system);
     Delivery delivery = new Delivery("Delivery Service", system);

     order.start();
     kitchen.start();
     delivery.start();

     order.join();
     kitchen.join();
     delivery.join();

     System.out.println("All tasks completed.");
 }
}