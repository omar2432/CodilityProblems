public class App12 {
    public static void main(String[] args) {
        }
}

class Solution {
    public int solution(int A, int B, int K) {
        // Implement your solution here
        int kbig=B/K;

        if(A%K ==0){
            kbig++;
        }
        int ksmall=A/K;
        
        if(A==B){
            if(B%K==0){
                return 1;
            }
            return 0;
        }
        return kbig-ksmall;
    }
}
