import java.util.Arrays;

public class App9 {
    public static void main(String[] args) {
     
        System.out.println("yoyoyo");

        int[] A={3,4,4,6,1,4};
        int N=5;

        int M=A.length;
        int[] counters=new int[N];

        // if counters not intialized to false
        // Arrays.fill(counters, false);
        
                
        int max=0;
        for(int i=0;i<M;i++){
            if(i>0 && A[i-1]==(N+1) && A[i]==(N+1)){                
                continue;
            }
            if(A[i]==(N+1)){
                Arrays.fill(counters, max);
            }
            else{
                counters[A[i]-1]++;
                if(counters[A[i]-1]>max){
                    max=counters[A[i]-1];
                }
            }
        }
        return counters;

    }    
}
