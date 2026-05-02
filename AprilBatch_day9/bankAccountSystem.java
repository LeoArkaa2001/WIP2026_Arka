package AprilBatch_day9;

class bankAccountSystem {
    private int balance = 1000;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public static void main(String[] args) {
    	bankAccountSystem account = new bankAccountSystem();

        Runnable task = () -> {
            account.deposit(500);
            account.withdraw(300);
        };

        new Thread(task).start();
        new Thread(task).start();
    }
}
