package secondQ;

public class MinimalPackaging implements PackagingStrategy{
    @Override
    public void pack() {
        System.out.println("Minimal Packaging");

    }

    @Override
    public int getCost() {
        return 15;
    }
}
