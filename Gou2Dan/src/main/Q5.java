package main;

import java.util.Scanner;

/**
 * Created by Boss on 25/10/15.
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int no = Integer.parseInt(s1);
        Round[] input = new Round[no];
        String s;
        int start, counter;
        for(int i=0; i<no; i++){
            s = sc.nextLine();
            start = Integer.parseInt(s.split(" ")[0]);
            counter = Integer.parseInt(s.split(" ")[1]);
            input[i] = new Round(start, counter);
        }
        boolean[] square = new boolean[10^100];
        for(int i=0;i<square.length;i++)
            square[i] = true;
        for(int j=0;j<no;j++){
            start = input[j].start;
            int position = start;
            counter = input[j].counter;
            for(int k=0; k<counter;){
                if (square[position]){
                    square[position] = false;
                    k++;
                }else {
                    position++;
                }
            }
            System.out.println(position);
        }

    }
    static class Round {
        private int start;
        private int counter;
        Round(int start, int counter){
            this.start=start;
            this.counter = counter;
        }
    }

}
