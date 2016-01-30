package codility;

/**
 * Created by Boss on 12/12/15.
 */
public class Fibonacci {
    public int[] fib(int n) {
        int[] fib = new int[n+1];
        fib[1] = 1;
        int index = 2;
        while (index <= n)
            fib[index] = fib[index - 1] + fib[index - 2];
        return fib;
    }
}
