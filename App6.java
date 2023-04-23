public class App6 {
    public static void main(String[] args) {   }

}

        class Solution {
            public int solution(int[] A) {
                int n = A.length;
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += A[i];
                }
                int leftSum = 0;
                int rightSum = sum;
                int minDiff = Integer.MAX_VALUE;
                for (int i = 0; i < n-1; i++) {
                    leftSum += A[i];
                    rightSum -= A[i];
                    int diff = Math.abs(leftSum - rightSum);
                    if (diff < minDiff) {
                        minDiff = diff;
                    }
                }
                return minDiff;
            }
        }