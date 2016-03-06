package codility;

/**
 * Created by Boss on 5/10/15.
 */
public class L03FrogJump {
    public int solution(int X, int Y, int D){
        int solution=0;
        solution = (Y-X+D-1)/D;
        return solution;
    }
}
