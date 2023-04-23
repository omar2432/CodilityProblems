import java.util.Arrays;

public class App7 {

    public static void main(String[] args) {
        

        int X=5;
        int[] A={1,3,4,2,3,5,2};

        int N=A.length;        
        boolean[] found=new boolean[X+1];

        Arrays.fill(found, false);

        int count = 0;

        for (int i = 0; i < N; i++) {
            
            if (!found[A[i]]) {
                found[A[i]] = true;
                count++;
                if (count == X) {
                    return i;
                }
            }
        }
        
        return -1;

    }
    
}
