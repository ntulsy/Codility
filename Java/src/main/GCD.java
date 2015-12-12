package main;

/**
 * Created by Boss on 12/12/15.
 */
public class GCD {

    // assume % take O(1) time
    // time complexity: log(a+b)
    public int gcdByDiv(int a, int b){
        if (a % b == 0)
            return b;
        else
            return gcdByDiv(b, a % b);
    }

    // assume % take large time (when a or b very large)
    // time complexity: log(n), n = ab
    public int gcdByBin (int a, int b) {
        return gcdByBin(a, b, 1);
    }
    public int gcdByBin (int a, int b, int res) {
        if (a == b)
            return res * a;
        else if (a % 2 == 0 && b % 2 == 0)
            return gcdByBin(a/2, b/2, 2 * res);
        else if (a % 2 == 0)
            return gcdByBin(a/2, b, res);
        else if (b % 2 == 0)
            return gcdByBin(a, b/2, res);
        else if (a > b)
            return gcdByBin(b, a-b, res);
        else
            return gcdByBin(a, b-a, res);
    }

    public int lcm (int a, int b) {
        return (a * b) / gcdByDiv(a, b);
    }
}
