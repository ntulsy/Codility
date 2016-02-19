package codility;

import java.util.Stack;

/**
 * Created by Boss on 16/12/15.
 */
public class GreedyCanoeist {
    public int GreedyCanoeistA(int[] W, int k) {
        int n = W.length;
        Stack<Integer> fats = new Stack<>();
        Stack<Integer> thins = new Stack<>();
        for (int w : W) {
            if (w + W[n-1] <= k)
                thins.push(w);
            else
                fats.push(w);
        }
        fats.push(W[n-1]);

        int count = 0;
        while (!(fats.isEmpty() && thins.isEmpty())) {
            if (!thins.isEmpty())
                thins.pop();
            fats.pop();
            ++count;

            if (fats.isEmpty() && !thins.isEmpty())
                fats.push(thins.pop());
            while (fats.size() > 1 && fats.get(0) + fats.get(fats.size() - 1) <= k)
                thins.add(fats.remove(0));
        }
        return count;
    }

    public int GreedyCanoeistB(int[] W, int k) {
        int min = 0;
        int max = W.length - 1;
        int count = 0;
        while (min <= max) {
            if (W[max] + W[min] <= k) {
                ++min;
            }
            --max;
            ++count;
        }
        return count;
    }
}
