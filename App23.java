import java.util.HashMap;
import java.util.*;

public class App23 {
    public static void main(String[] args) {
        System.out.println("hellooo");        

    }
    

    
        public int[] solution(int[] A) {
            int N = A.length;
            int[] result = new int[N];
            
            Map<Integer, Integer> countMap = new HashMap<>();
            Map<Integer, Integer> divisorsMap = new HashMap<>();
            
            // Step 1: Count occurrences of each element in A
            for (int num : A) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
            
            // Step 2: Calculate divisors count for each element in A
            for (int num : A) {
                int divisorsCount = 0;
                for (int i = 1; i * i <= num; i++) {
                    if (num % i == 0) {
                        divisorsCount += countMap.getOrDefault(i, 0);
                        if (i * i != num) {
                            divisorsCount += countMap.getOrDefault(num / i, 0);
                        }
                    }
                }
                divisorsMap.put(num, divisorsCount);
            }
            
            // Step 3: Calculate non-divisors count for each element in A
            for (int i = 0; i < N; i++) {
                result[i] = N - divisorsMap.getOrDefault(A[i], 0);
            }
            
            return result;
        }

}    




