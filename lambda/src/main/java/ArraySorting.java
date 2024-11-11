public class ArraySorting {
    public static void main(String[] args) {
        ArraySorting as = new ArraySorting();
        //as.sort();

        QuickSort qs = new QuickSort();
        as.sort(qs);
    }

    private void sort(Sorting sorting) {
        sorting.sort();
    }
}
