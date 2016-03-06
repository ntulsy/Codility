package main.java.codility;

/**
 * Created by Boss on 19/2/16.
 */
public class L1BinaryGap {
    public int solution(int N) {
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.insert(0, N % 2);
            N /= 2;
        }
        String binary = sb.toString();
        int result = 0;
        int count = 0;
        for (char c : binary.toCharArray()) {
            if ( c == '0' ) {
                ++count;
            } else {
                if (count > result)
                    result = count;
                count = 0;
            }
        }
        return result;
    }
}
