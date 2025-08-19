public class RecursionTutorial{
    public static void main(String[] args) {
        // System.out.println("Hello, Recursion!");
        printMessage(5);
    }

    public static void printMessage(int count) {
        System.out.println("Hello!");

        if(count<=1){
            return; 
        }

        printMessage(count-1);
    }
}