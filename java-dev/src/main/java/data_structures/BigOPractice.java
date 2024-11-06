package data_structures;

public class BigOPractice {
    public static void main(String[] args) {
        //different input size should have different variables (think ofO(n*m))
        int numberOfOperations = 0;
        int m = 100;
        int n = 10000; //data size
        long startTime;
        long endTime;

        //Task 1 - Single loop ------ O(n)
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            numberOfOperations++;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Single loop: Number of operations " + numberOfOperations + " in " + (endTime-startTime)+" milliseconds");
        //Task 2 - Nested Loop
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for(int j = 0; j < n; j++){
            for (int i = 0; i < n; i++) {
                numberOfOperations++;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Nested loop: Number of operations " + numberOfOperations + " in " + (endTime-startTime)+" milliseconds");

        //Task 3 Three Nested Loops
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for(int k = 0; k<n; k++) {
            for(int j = 0; j < n; j++){
                for (int i = 0; i < n; i++) {
                    numberOfOperations++;
                }
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Three nested loops: Number of operations " + numberOfOperations + " in " + (endTime-startTime)+" milliseconds");


        //Logarithmic complexity - Binary trees
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int i = 1; i < n; i*=2) {
            numberOfOperations++;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Logarithmic: Number of operations " + numberOfOperations + " in " + (endTime-startTime)+" milliseconds");

        //N x M nested loop (N+M if loops consecutive)
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for(int j = 0; j < n; j++){
            for (int i = 0; i < m; i++) {
                numberOfOperations++;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("NxM nested loop: Number of operations " + numberOfOperations + " in " + (endTime-startTime)+" milliseconds");



    }
}
