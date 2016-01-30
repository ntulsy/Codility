package main;

/**
 * Created by Boss on 19/10/15.
 */
public class L9MaxProfit {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int profit_sofar = 0, max_profit=0;
        for(int i = 1; i<A.length;i++){
            profit_sofar = Math.max(profit_sofar+A[i]-A[i-1], 0);
            max_profit = Math.max(max_profit,profit_sofar);
        }
        return max_profit;
    }
}
