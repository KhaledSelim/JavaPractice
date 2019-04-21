/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.datastructure;

/**
 *
 * @author khaled.selim
 */
public class AlgorithmsDataStructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //initialize
        int[] selectionSortInput = {10, 8, 1, 88, 64, 21, 19, 4, 3, 2};

        //sort
        selectionSort(selectionSortInput);

        //print
        printSelectionSortArray(selectionSortInput);

        //initialize
        int[] bubbleSortInput = {10, 8, 1, 88, 64, 21, 19, 4, 3, 2};
        int[] inputOpt = bubbleSortInput;

        //sort
        bubbleSort(bubbleSortInput);
        bubbleSortOpt(inputOpt);
        //print
        printBubbleSortArray(bubbleSortInput);
        printBubbleSortArray(inputOpt);
        
        //
        factorialVisualization(4);
    }

    public static void selectionSort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            // i points at first number behind "wall"
            int indexOfSmallest = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[indexOfSmallest]) {
                    indexOfSmallest = j;
                }
            }
            // swap
            int temp = input[i];
            input[i] = input[indexOfSmallest];
            input[indexOfSmallest] = temp;
        }
    }

    public static void printSelectionSortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    /**
     * ***************************************************************************************************
     */
    public static void bubbleSort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            // i represents how many elements have bubbled to correct place
            for (int j = 0; j + 1 < input.length - i; j++) {
                if (input[j] > input[j + 1]) {
                    //swap
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortOpt(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            // i represents how many elements have bubbled to correct place
            boolean swapped = false;
            for (int j = 0; j + 1 < input.length - i; j++) {
                if (input[j] > input[j + 1]) {
                    //swap
                    swapped = true;
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
            if (!swapped) {
                return;
            }
        }
    }

    public static void printBubbleSortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    /**
     * *************************************************************************************
     */
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int factorialVisualization(int n) {
        System.out.println("Computing Factorial of " + n);
        if (n <= 1) {
            System.out.println("Result of Factorial " + n + " = 1");
            return 1;
        } else {
            int result = factorialVisualization(n - 1);
            System.out.println("Result of Factorial " + n + " = " + (n * result));
            return n * result;
        }
    }
}
