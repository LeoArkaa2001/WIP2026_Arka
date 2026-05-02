package AprilBatch_day5;
class PaymentSystem {

   
    public final void processPayment(double amount) {
        System.out.println("Processing secure payment of Rs. " + amount);
    }
}

class CreditCardPayment extends PaymentSystem {

    
    
	/*
	 * public void processPayment(double amount) {
	 * System.out.println("Modified payment logic"); }
	 */
}

public class paymentPreventOverriding {
    public static void main(String[] args) {
        CreditCardPayment payment = new CreditCardPayment();
        payment.processPayment(5000);
    }
}    
