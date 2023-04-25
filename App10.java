
import java.util.Arrays;
public class App10 {
    public static void main(String[] args) {
        System.out.println("Yoooooooooo");

        int [] A={1,3,2,5};

        int N=A.length;
        boolean [] found =new boolean[N+2];
        Arrays.fill(found, false);

        for(int i=0;i<N;i++){
            if(A[i]>0 && A[i]<=N){
                found[A[i]]=true;
            }
            
        }
        for(int j=1;j<N+2;j++){
            if(!found[j]){
                //return j;
            }
        }
        //return 1;
    }
    
}
