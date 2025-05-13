package p1;

public class PaymentProcessor {
    public void processPayment() {
        System.out.println("Processing payment...");
        int error = 1 / 0; // Critical bug
    }
}

