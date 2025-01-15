package firstQ;

public class SortingContext {
    SortStrategy sortingStrategy;

    public SortStrategy getSortingStrategy() {
        return sortingStrategy;
    }

    public void setSortingStrategy(SortStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void perform(int [] array){
        sortingStrategy.sort(array);
    }
}
