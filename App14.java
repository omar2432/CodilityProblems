public class App14 {
    public static void main(String[] args) {
        
        int[] A={4,2,2,5,1,1};
    }
    
}

class Solution {
    public int solution(int[] A) {
        int minStartIndex = 0;
        double minAvg = (A[0] + A[1]) / 2.0;

        for (int i = 2; i < A.length; i++) {
            double avg2 = (A[i - 1] + A[i]) / 2.0;
            double avg3 = (A[i - 2] + A[i - 1] + A[i]) / 3.0;

            if (avg2 < minAvg) {
                minAvg = avg2;
                minStartIndex = i - 1;
            }

            if (avg3 < minAvg) {
                minAvg = avg3;
                minStartIndex = i - 2;
            }
        }

        return minStartIndex;
    }
}
