package codility;

/**
 * Created by Boss on 5/10/15.
 */
public class L5GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        int i,j,value;
        int[][] seen = new int[4][S.length()];
        int[] result = new int[P.length];
        for (i=0; i<S.length(); i++){
            value = value(S.charAt(i));
            seen[value][i] = 1;
        }
        for (i=0; i<4; i++){
            for(j=1;j<S.length();j++){
                seen[i][j] += seen[i][j-1];
            }
        }

        for(j=0;j<P.length;j++){
            for (i=0;i<4;i++){
                if ((P[j]>=1)&& (seen[i][Q[j]]-seen[i][P[j]-1]>0) ){
                    result[j] = i+1;
                    break;
                }
                else if ((P[j] == 0) && (seen[i][Q[j]]>0)) {
                    result[j] = i + 1;
                    break;
                }
            }
        }
        return result;
    }

    public int value(char c){
        switch(c){
            case 'A':
                return 0;
            case 'C':
                return 1;
            case 'G':
                return 2;
            case 'T':
                return 3;
        }
        return -1;
    }

    public int[] solution2(String S, int[] P, int[] Q){
        int[][] lastSeen = new int[4][S.length()];
        int[] result = new int[P.length];
        int i, j, value;
        for (i=0;i<S.length();i++){
            value = value(S.charAt(i));
            for (j=0;j<4;j++){
                if (j==value)
                    lastSeen[j][i] = i;
                else if (i==0)
                    lastSeen[j][i] = -1;
                else
                    lastSeen[j][i] = lastSeen[j][i-1];
            }
        }

        for(i=0;i<P.length;i++){
            for (j=0;j<4;j++){
                if (lastSeen[j][Q[i]] >= P[i]){
                    result[i] = j+1;
                    break;
                }
            }
        }
        return  result;

    }
}
