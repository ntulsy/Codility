package main;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Siyao on 2015/10/25.
 */
public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character, Boolean> isIn = new HashMap<Character, Boolean>();
        for (int i = 0; i < s.length(); ++i){
            isIn.put(s.charAt(i), true);
        }
        StringBuilder sb = new StringBuilder();
        for(Character c: isIn.keySet()){
            sb.append(c);
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
