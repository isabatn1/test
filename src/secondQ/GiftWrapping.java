package secondQ;

public class GiftWrapping implements PackagingStrategy{
    @Override
    public void pack() {
        System.out.println("Gift Wrapping");

    }

    @Override
    public int getCost() {
        return 20;
    }
}
