import java.util.Arrays;;

public class App17 {
    public static void main(String[] args) {
        
    }

    
    public int solution(int[] A) {
        int N = A.length;
        Arrays.sort(A);
        int maxProduct = A[N - 1] * A[N - 2] * A[N - 3];
        if (A[0] < 0 && A[1] < 0 && A[N - 1] > 0) {
            int maxNegProduct = A[0] * A[1] * A[N - 1];
            maxProduct = Math.max(maxProduct, maxNegProduct);
        }
        return maxProduct;
    }
}


