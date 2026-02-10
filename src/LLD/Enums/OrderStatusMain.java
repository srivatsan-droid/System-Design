package LLD.Enums;

public class OrderStatusMain {
    public static void main(String[] args) {
        OrderStatus orderStatus = OrderStatus.PLACED;
        if(orderStatus == OrderStatus.PLACED) {
            System.out.println("Order is Placed Still it need to be Shipped");
        }else {
            System.out.println("Order is yet to be processed");
        }
    }
}
