package Sorting;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args){
        int[] numbers = new int[50];
        Random random = new Random();

        for(int i=0;i<numbers.length;i++){
            numbers[i] = random.nextInt(1000);
        }

        System.out.println("Unsorted Array: ");
        System.out.println(Arrays.toString(numbers));

        System.out.println("Sorted Array: ");
        insertionSort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static void insertionSort(int numbers[]){
        for(int i=1;i<numbers.length;i++){
            int currentValue = numbers[i];

            int j=i-1;
            while(j>=0 && numbers[j]> currentValue){
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = currentValue;
        }
        
    }
}
