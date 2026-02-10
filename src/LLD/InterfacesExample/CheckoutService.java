package LLD.InterfacesExample;

public class CheckoutService {
    private PaymentGateway paymentGateway;
    public CheckoutService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
    public void checkOut(double amount) {
        paymentGateway.initiatePayment(amount);
    }
    public static void main(String[] args) {
        PaymentGateway obj1 = new CreditCardPayment();
        CheckoutService obj = new CheckoutService(obj1);
        obj.checkOut(12000);
    }
}
