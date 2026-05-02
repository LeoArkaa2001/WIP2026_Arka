package AprilBatch_day9;
class altPrintEvenOdd {
    private int num = 1;
    private final int MAX = 100;

    public synchronized void printOdd() {
        while (num <= MAX) {
            if (num % 2 == 0) {
                try { wait(); } catch (Exception e) {}
            } else {
                System.out.println("Odd: " + num++);
                notify();
            }
        }
    }

    public synchronized void printEven() {
        while (num <= MAX) {
            if (num % 2 == 1) {
                try { wait(); } catch (Exception e) {}
            } else {
                System.out.println("Even: " + num++);
                notify();
            }
        }
    }

    public static void main(String[] args) {
        altPrintEvenOdd obj = new altPrintEvenOdd();

        new Thread(() -> obj.printOdd()).start();
        new Thread(() -> obj.printEven()).start();
    }
}
