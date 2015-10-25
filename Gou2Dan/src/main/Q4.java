package main;

import java.math.BigInteger;
import java.util.*;

/**
 * Created by Siyao on 2015/10/25.
 */
public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totalLines = Integer.parseInt(sc.nextLine());
        KVPair[] ops = new KVPair[totalLines];
        for (int i = 0; i < totalLines; ++i){
            ops[i] = read(sc.nextLine());
        }

        ArrayList<OccupiedPos> occupiedPlace = new ArrayList<>();

        BigInteger current;
        for (int i = 0; i < totalLines; ++i){
            current = new BigInteger(ops[i].start + "");
            for (int counter = 0; counter < ops[i].count; ++counter){
                OccupiedPos oldp = null;
                OccupiedPos p = inOccupiedPlace(current, occupiedPlace);
                while (p != null){
                    current = current.add(BigInteger.ONE);
                    oldp = p;
                    p = inOccupiedPlace(current, occupiedPlace);
                }
                if (oldp != null)
                    oldp.end = current;
                else {
                    oldp = new OccupiedPos();
                    oldp.start = current;
                    oldp.end = current;
                    occupiedPlace.add(oldp);
                }
                current = current.add(BigInteger.ONE);
            }
            System.out.println(current.add(new BigInteger("-1")));
        }
    }

    public static OccupiedPos inOccupiedPlace(BigInteger i, ArrayList<OccupiedPos> occupiedPlace){
        for (OccupiedPos occupiedPos: occupiedPlace){
            if (i.compareTo(occupiedPos.start) >= 0 && i.compareTo(occupiedPos.end) <= 0)
                return occupiedPos;
        }
        return null;
    }

    private static class KVPair {
        public int start;
        public int count;
    }

    public static KVPair read(String s){
        KVPair p = new KVPair();
        p.start = Integer.parseInt(s.split(" ")[0]);
        p.count = Integer.parseInt(s.split(" ")[1]);
        return p;
    }

    private static class OccupiedPos {
        public BigInteger start;
        public BigInteger end;
    }

}
