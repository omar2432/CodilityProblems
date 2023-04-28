import java.util.Arrays;

public class App13 {
    public static void main(String[] args) {
        System.out.println("null");

        String S="CAGCCTA";
        int [] P={2,5,0};
        int[] Q={4,5,6};

    }
    
}
class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        int n = S.length();
        int[] A = new int[n+1];
        int[] C = new int[n+1];
        int[] G = new int[n+1];
        int[] T = new int[n+1];
        
        for (int i = 0; i < n; i++) {
            A[i+1] = A[i] + (S.charAt(i) == 'A' ? 1 : 0);
            C[i+1] = C[i] + (S.charAt(i) == 'C' ? 1 : 0);
            G[i+1] = G[i] + (S.charAt(i) == 'G' ? 1 : 0);
            T[i+1] = T[i] + (S.charAt(i) == 'T' ? 1 : 0);
        }
        
        int m = P.length;
        int[] result = new int[m];
        
        for (int k = 0; k < m; k++) {
            int p = P[k];
            int q = Q[k];
            
            if (A[q+1] - A[p] > 0) {
                result[k] = 1;
            } else if (C[q+1] - C[p] > 0) {
                result[k] = 2;
            } else if (G[q+1] - G[p] > 0) {
                result[k] = 3;
            } else {
                result[k] = 4;
            }
        }
        
        return result;
    }
}
