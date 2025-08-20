package Searching;

public class BinarySearch {
    public static void main(String[] args){
        int[] numbers = {1,3,5,7,9,11,13,15,17,19,21,23,25};

        System.out.println(binarySearch(numbers, 91));
    }

    public static int binarySearch(int[] numbers, int target){
        int low = 0;
        int high = numbers.length - 1;
        while(low<=high){
            int mid = (low+high)/2;
            int middleValue = numbers[mid];
            if(target == middleValue){
                return mid; // target value index return
            }
            if(target<middleValue){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1; // target value not found
    }
}
