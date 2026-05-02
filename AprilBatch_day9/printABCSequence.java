package AprilBatch_day9;

class printABCSequence {
    private int state = 0;

    public synchronized void printA() {
        for (int i = 0; i < 5; i++) {
            while (state % 3 != 0) {
                try { wait(); } catch (Exception e) {}
            }
            System.out.print("A ");
            state++;
            notifyAll();
        }
    }

    public synchronized void printB() {
        for (int i = 0; i < 5; i++) {
            while (state % 3 != 1) {
                try { wait(); } catch (Exception e) {}
            }
            System.out.print("B ");
            state++;
            notifyAll();
        }
    }

    public synchronized void printC() {
        for (int i = 0; i < 5; i++) {
            while (state % 3 != 2) {
                try { wait(); } catch (Exception e) {}
            }
            System.out.print("C ");
            state++;
            notifyAll();
        }
    }

    public static void main(String[] args) {
    	printABCSequence obj = new printABCSequence();

        new Thread(() -> obj.printA()).start();
        new Thread(() -> obj.printB()).start();
        new Thread(() -> obj.printC()).start();
    }
}