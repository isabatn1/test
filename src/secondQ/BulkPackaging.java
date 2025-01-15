package secondQ;

public class BulkPackaging implements PackagingStrategy{
    @Override
    public void pack() {
        System.out.println("Bulk Packaging");

    }

    @Override
    public int getCost() {
        return 25;
    }
}
