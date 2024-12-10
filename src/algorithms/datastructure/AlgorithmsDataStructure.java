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

    public static void countingSort(int[] input) {
        // Find the maximum and minimum values in the input array
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int num : input) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        
        // Create a count array to store the frequency of each element
        int[] count = new int[max - min + 1];
        
        // Store the count of each element
        for (int num : input) {
            count[num - min]++;
        }
        
        // Rebuild the sorted array from the count array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                input[index++] = i + min;
                count[i]--;
            }
        }
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
        boolean swapped;
        for (int i = 0; i < input.length - 1; i++) {
            swapped = false; // Reset the swapped flag
            
            for (int j = 0; j + 1 < input.length - i; j++) {
                if (input[j] > input[j + 1]) {
                    // Swap elements
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                    
                    swapped = true; // A swap was made
                }
            }
            
            // If no elements were swapped, the array is sorted
            if (!swapped) {
                break; // Exit early since the array is already sorted
            }
        }
    }

    
    
    public static void badBubbleSort(int[] input) {
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
