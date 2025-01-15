package secondQ;

public class ExpressShipping implements  ShippingStrategy{
    @Override
    public void ship() {
        System.out.println("Express Shipping");

    }

    @Override
    public int getCost() {
        return 6;
    }
}
