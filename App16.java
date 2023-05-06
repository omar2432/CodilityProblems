public class App16 {
    public static void main(String[] args) {
        
        int[] A={4,5,1,0};
        
      int valp=-1000;
        int valq=-1000;
        int valr=-1000;
        int N=A.length;
        for(int i=0;i<N;i++){
            if(valp>=valq && valq<=valr){
                if(A[i]>valq){
                    valq=A[i];
                }
            }else if(valq>=valp && valp<=valr){
                if(A[i]>valp){
                    valp=A[i];
                }
            }else if(valq>=valr && valp>=valr){
                if(A[i]>valr){
                    valr=A[i];
                }
            }
        }
        
     //   return valq*valp*valr;
    }
    
}
