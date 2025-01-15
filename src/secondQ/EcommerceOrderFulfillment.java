package secondQ;

public class EcommerceOrderFulfillment {
    public static void main(String[] args) {

      Order order1 = new Order(12);

      order1.setPackagingStrategy(new BulkPackaging());
      order1.setShippingStrategy(new LocalPickup());

      order1.fulfillOrder();







    }
}
