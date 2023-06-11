public class App21 {

    public static void main(String[] args) {
        System.out.println("hellloooooooo");
    }


    public int solution(int[] A) {
        // Implement your solution here
        int N=A.length;
        if(N==0){
            return 0;
        }
        int maxProfit=0;
        int currentProfit=0;
        int buy=A[0];
        int sell=0;
        for(int i=0;i<N;i++){
            if(A[i]<buy){
                buy=A[i];
                sell=0;
            }else if(){}
        }
    }
    
}
