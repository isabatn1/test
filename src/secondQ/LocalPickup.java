package secondQ;

public class LocalPickup implements ShippingStrategy {

    @Override
    public void ship() {
        System.out.println("Local Pickup");

    }

    @Override
    public int getCost() {
        return 7;
    }
}
