package main;

import java.util.Scanner;

/**
 * Created by Siyao on 2015/10/25.
 */
public class Q2 {
    public static void main(String[] args) {
        if (!ok()){
            System.out.println("?");
        }

    }
    public static boolean ok(){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int N = Integer.parseInt(s1.split(" ")[0]);
        int M = Integer.parseInt(s1.split(" ")[1]);

        Integer[] answers = readNums(s2, N);
        int[] sorted = new int[M+1];
        float criteria = (float)N/2;

        for (int i = 0; i < N; ++i){
            sorted[answers[i]]++;
            if(sorted[answers[i]]>criteria) {
                System.out.println(answers[i]);
                return true;
            }
        }
        return false;
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
