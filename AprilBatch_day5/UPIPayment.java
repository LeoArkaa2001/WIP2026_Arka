package AprilBatch_day5;

interface Payment {

    void pay(int amount);

    default void paymentSuccess() {
        System.out.println("Payment successful ");
    }
    static void paymentInfo() {
        System.out.println("Payment Gateway");
        System.out.println("Supported MOP : UPI ");
    }
}

class UPIService implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI.");
        paymentSuccess();
    }
}

public class UPIPayment {
    public static void main(String[] args) {
        Payment.paymentInfo();

        Payment payment = new UPIService();
        payment.pay(750);
    }
}