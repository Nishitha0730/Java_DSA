import java.util.Random;

public class MergeSort {
    public static void main(String[] args){

        Random rand = new Random();
        int[] numbers = new int[10];

        for(int i=0;i<numbers.length;i++){
            numbers[i] = rand.nextInt(100000);
        }

        System.out.println("Unsorted array:");
        printArray(numbers);


        mergeSort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted array:");
        printArray(numbers);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] array, int left, int right) {
        
    }

}