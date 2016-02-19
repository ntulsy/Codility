package codility;

/**
 * Created by Boss on 5/10/15.
 */
public class L4MissingInteger {
//    solution to return min missing integer greater than any integer in the array
    public int solution(int[]A){
        int[] check = new int[A.length];
        int i, j=1, min =0,tmp,a;
        for(i=0; i<A.length;i++){
            if(A[i]>0){
                if (min == 0) {
                    min = A[i];
                    check[0]=min;
                }
                else{
                    if (A[i] < min){
                        if (A[i]<=(min-A.length)){
                            j++;
                            min = A[i];
                            check[0]=min;

                        }
                        else {
                            tmp = min-A[i];
                            min = A[i];
                            check[0]=min;
                            for (a=check.length-1;a>tmp;a--){
                                check[a]=check[a-tmp];

                            }
                            for(a=1;a<tmp;a++){
                                check[a]=0;
                            }
                            check[tmp]=j;


                        }
                    }
                    else if (A[i]>=(min+A.length)){
                    }
                    else{
                        check[A[i]-min]=j;
                    }
                }

            }
        }

        for(i=1;i<check.length;i++){
            if(check[i]<j)
                return i+check[0];
        }
        return check[0]+check.length;
    }
    public int solution2(int[] A){
        boolean[] check = new boolean[A.length];
        int i;
        for(i=0; i<A.length;i++){
            if ((A[i]>=1) && (A[i] <= A.length)){
                check[A[i]-1]=true;
            }
        }
        for(i=0;i<A.length;i++){
            if(!check[i])
                return i+1;
        }
        return A.length+1;
    }
}
