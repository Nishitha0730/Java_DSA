package Sorting;

import java.util.Random;
import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args){
        int[] numbers = new int[500];
        Random random = new Random();

        for(int i=0;i<numbers.length;i++){
            numbers[i] = random.nextInt(10000);
        }

        System.out.println(Arrays.toString(numbers));

        long startTime = System.currentTimeMillis();
        selectionSort(numbers);
        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(numbers));
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }
    
    public static void selectionSort(int[] numbers){
        int length = numbers.length;
        
        for(int i=0;i<length-1;i++){
            int min = numbers[i];
            int minIndex = i;
            for(int j=i+1;j<length;j++){
                if(numbers[j] < min){
                    min = numbers[j];
                    minIndex = j;
                }  
            }
            swap(numbers, i, minIndex);
        }
    }

    public static void swap(int[] numbers, int a, int b){
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }
}
