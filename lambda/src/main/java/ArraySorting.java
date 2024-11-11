public class ArraySorting {
    public static void main(String[] args) {
        ArraySorting as = new ArraySorting();
        //as.sort();

        QuickSort qs = new QuickSort();
        as.sort(qs);

        Sorting noLambda = new QuickSort();
        noLambda.sort();

        Sorting quickSort = () -> System.out.println("Quicksorting");
        as.sort(quickSort);
    }

    private void sort(Sorting sorting) {
        sorting.sort();
    }
}

interface MyLambda {
    void print();
}
