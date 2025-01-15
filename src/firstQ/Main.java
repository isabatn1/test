package firstQ;

import firstQ.BubbleSort;

public class Main {
    public static void main(String[] args) {
        int [] array = {2,4,6,5,3,7};


        SortingContext sc = new SortingContext();
        sc.setSortingStrategy(new BubbleSort());
        sc.perform(array);

        sc.setSortingStrategy(new QuickSort());
        sc.perform(array);
    }
}
