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


        mergeSort(numbers);

        System.out.println("Sorted array:");
        printArray(numbers);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] array) {
        if(array.length < 2) {
            return;
        }
        int midIndex = array.length / 2;
        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[array.length - midIndex];

        for(int i=0;i<midIndex;i++) {
            leftArray[i] = array[i];
        }
        for(int i=midIndex;i<array.length;i++) {
            rightArray[i - midIndex] = array[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(array, leftArray, rightArray);

    }

    public static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int i=0, j=0, k=0;

        while(i < leftSize && j < rightSize) {
            if(leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i < leftSize) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < rightSize) {
            array[k] = rightArray[j];
            j++;
            k++;
        }

    }

}