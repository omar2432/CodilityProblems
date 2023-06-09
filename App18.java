import java.util.Arrays;

public class App18 {
    public static void main(String[] args) {
        System.out.println("helllllooooo");

    }

    public int solution(int[] A) {
        int N=A.length;
        if(N<3){return 0;
        }

        Arrays.sort(A);
        for(int i=0;i<N-2;i++){
            if(A[i]+A[i+1]>A[i+2]
            &&A[i+1]+A[i+2]>A[i]
            &&A[i]+A[i+2]>A[i+1]
            ){
                return 1;
            }
        }

        return 0;
    }

    
}
