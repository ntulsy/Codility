package main;

/**
 * Created by Boss on 12/12/15.
 */
public class L10CommonPrimeDivisors {
    public int solution(int[] A, int[] B) {
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            int gcd = gcd(A[i], B[i]);
            if (subPrime(A[i] / gcd, gcd) && subPrime(B[i]/gcd, gcd))
                ++result;
        }
        return result;
    }

    public boolean subPrime(int quotient, int gcd) {
        int gcd_sub = gcd(gcd, quotient);
        while (gcd_sub > 1) {
            quotient /= gcd_sub;
            gcd_sub = gcd(gcd, quotient);
        }
        if (quotient == 1)
            return true;
        else
            return false;
    }


    public int gcd(int a, int b) {
        if (a < b) {
            int min = a;
            a = b;
            b = min;
        }
        int gcd = 1;
        while (a % b > 0) {
            gcd = b;
            b = a % gcd;
            a = gcd;
        }
        return b;
    }
}
