package secondQ;

public class StandardShipping implements ShippingStrategy{
    @Override
    public void ship() {
        System.out.println("Standart Shipping");

    }

    @Override
    public int getCost() {
        return 5;
    }
}
