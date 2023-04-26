public class App11 {
    public static void main(String[] args) {
        
        int[] A={0,1,0,1,1};

        int N =A.length;
        int totalones=0;
        int currentones=0;
        int passingcars=0;
        
        for(int i=0;i<N;i++){
            if(A[i]==1){
                totalones++;
            }            
        }
        for(int i=0;i<N;i++){
            if(A[i]==0){
                passingcars+=(totalones-currentones);
                if(passingcars>1000000000){
                //    return -1;
                }
            }
            else{
                currentones++;
            }
        }
     //   return passingcars;
    }
    
}
