public class Fibonacci {

    private static long[] fibonacciCache;

    public static void main(String[] args){
        int n = 6; 

        fibonacciCache = new long[n + 1];

        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
        

    }
    public static long fibonacci(int n){
        if(n <= 1) {
            return n;
        }

        if(fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }

        long nthFib = fibonacci(n - 1) + fibonacci(n - 2);
        fibonacciCache[n] = nthFib;
        return nthFib;
    }
    
}
