import java.util.Arrays;

public class App27 {
    public static void main(String[] args) {
        System.out.println("Hellooooo");
    }
    
    public int solution(int K, int M, int[] A) {
        int maxSum = 0;
        int totalSum = 0;

        // Find the maximum element and calculate the total sum
        for (int num : A) {
            maxSum = Math.max(maxSum, num);
            totalSum += num;
        }

        int lowerBound = maxSum;
        int upperBound = totalSum;

        while (lowerBound <= upperBound) {
            int mid = (lowerBound + upperBound) / 2;
            if (isDivisible(K, A, mid)) {
                upperBound = mid - 1;
            } else {
                lowerBound = mid + 1;
            }
        }

        return lowerBound;
    }

    // Helper function to check if it's possible to divide the array into K blocks
    // with a large sum less than or equal to the target value
    private boolean isDivisible(int K, int[] A, int target) {
        int blockCount = 0;
        int currentSum = 0;

        for (int num : A) {
            if (currentSum + num > target) {
                blockCount++;
                currentSum = num;
            } else {
                currentSum += num;
            }

            if (blockCount >= K) {
                return false;
            }
        }

        return true;
    }}
