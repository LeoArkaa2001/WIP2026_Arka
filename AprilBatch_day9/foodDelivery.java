package AprilBatch_day9;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class foodDelivery {

    static class Order implements Runnable {
        private int orderId;

        Order(int orderId) {
            this.orderId = orderId;
        }

        public void run() {
            System.out.println("Processing order " + orderId +
                    " by " + Thread.currentThread().getName());
            try { Thread.sleep(1000); } catch (Exception e) {}
            System.out.println("Delivered order " + orderId);
        }
    }

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3); 

        for (int i = 1; i <= 10; i++) {
            pool.execute(new Order(i));
        }

        pool.shutdown();
    }
}