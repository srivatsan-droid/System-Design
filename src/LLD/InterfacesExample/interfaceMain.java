package LLD.InterfacesExample;
class StripePayment implements PaymentGateway {

    @Override
    public void initiatePayment(double amount) {
        System.out.println("Processing Payment through : " + amount);
    }
}
class CreditCardPayment implements PaymentGateway {

    @Override
    public void initiatePayment(double amount) {
        System.out.println("Processing Payment through : " + amount);
    }
}
public class interfaceMain {
    public static void main(String[] args) {
        StripePayment obj = new StripePayment();
        obj.initiatePayment(12000);
        CreditCardPayment obj1 = new CreditCardPayment();
        obj1.initiatePayment(23000);
    }
}
