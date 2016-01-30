package main;

/**
 * Created by Boss on 12/12/15.
 */
public class L12ChocolatesByNumbers {
    public int solution(int N, int M) {
        long lcm = (long) M * N / gcd(N, M);
        return (int) (lcm / M);
    }

    public int gcd(int a, int b) {
        int gcd = 1;
        while (a % b > 0) {
            gcd = b;
            b = a % gcd;
            a = gcd;
        }
        return b;
    }

}
