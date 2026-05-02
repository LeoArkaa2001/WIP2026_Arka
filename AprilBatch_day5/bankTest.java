package AprilBatch_day5;

abstract class Bank {
    abstract double getInterestRate();
}


class SBI extends Bank {
    double getInterestRate() {
        return 6.5;
    }
}

class ICICI extends Bank {
    double getInterestRate() {
        return 7.0;
    }
}

class HDFC extends Bank {
    double getInterestRate() {
        return 6.8;
    }
}

public class bankTest {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("SBI Interest Rate: " + b.getInterestRate());

        b = new ICICI();
        System.out.println("ICICI Interest Rate: " + b.getInterestRate());

        b = new HDFC();
        System.out.println("HDFC Interest Rate: " + b.getInterestRate());
    }
}