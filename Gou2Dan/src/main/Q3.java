package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        if (ok()){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean ok(){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        int N = Integer.parseInt(s1.split(" ")[0]);
        int M = Integer.parseInt(s1.split(" ")[1]);
        if (N < M)
            return false;

        Integer[] capacity = readNums(s2, N);
        Integer[] res = readNums(s3, M);
        Arrays.sort(capacity, Collections.reverseOrder());
        Arrays.sort(res, Collections.reverseOrder());

        for (int i = 0; i < M; ++i){
            if (capacity[i] < res[i])
                return  false;
        }
        return true;
    }

    public static Integer [] readNums(String s, int count) {
        Integer [] numbers = new Integer[count];
        Scanner numScanner = new Scanner(s);
        for (int i = 0; i < count; i++) {
            if (numScanner.hasNextInt()) {
                numbers[i] = numScanner.nextInt();
            } else {
                break;
            }
        }
        return numbers;
    }
}
