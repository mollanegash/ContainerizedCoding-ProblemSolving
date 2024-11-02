package recursion;

public class Fibonacci {

    // Class-level (static) array to store computed Fibonacci values for memoization
    private static long[] fibonacciCache;

    public static void main(String[] args) {
        int n = 50; // Define the target Fibonacci index

        // Initialize the cache array with size (n + 1) for memoization
        fibonacciCache = new long[n + 1];

        // Compute Fibonacci using basic recursion (no memoization) - slower
       // System.out.println("Fibonacci without cache: " + fibonacci(n));

        // Compute Fibonacci using memoization (faster with caching)
        System.out.println("Fibonacci with cache: " + fibonacciWithCache(n));
    }

    /**
     * Recursive method to calculate the nth Fibonacci number without caching.
     * @param n the Fibonacci sequence index
     * @return the nth Fibonacci number
     */
    private static long fibonacci(int n) {
        // Base cases: return n for the first two values (0 and 1)
        if (n < 2) {
            return n;
        }

        // Recursive calculation for Fibonacci (slower, recalculates values)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Optimized recursive method to calculate the nth Fibonacci number using memoization.
     * Caches results in fibonacciCache to avoid redundant calculations.
     * @param n the Fibonacci sequence index
     * @return the nth Fibonacci number
     */
    private static long fibonacciWithCache(int n) {
        // Base cases: directly return n if it’s 0 or 1
        if (n <= 1) {
            return n;
        }

        // Check if the result is already computed and stored in cache
        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n]; // Return cached result if available
        }

        // Recursive calculation and cache storage for future calls
        long nthFibonacciNumber = fibonacciWithCache(n - 1) + fibonacciWithCache(n - 2);
        fibonacciCache[n] = nthFibonacciNumber; // Store result in cache

        return fibonacciCache[n]; // Return computed result
    }
}