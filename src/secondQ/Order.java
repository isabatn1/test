package secondQ;

import java.sql.SQLOutput;

public class Order {
    int id;
    PackagingStrategy packagingStrategy;
    ShippingStrategy shippingStrategy;

    public Order(int id) {
        this.id = id;
    }



    public void setPackagingStrategy(PackagingStrategy packagingStrategy) {
        this.packagingStrategy = packagingStrategy;
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    void fulfillOrder(){
        shippingStrategy.ship();
        packagingStrategy.pack();
        System.out.println(shippingStrategy.getCost() + packagingStrategy.getCost());;
    }

}
