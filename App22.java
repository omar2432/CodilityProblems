public class App22 {

    public static void main(String[] args) {
        System.out.println("Helloo");
    }
    

     public int solution(int N) {
        int count = 0;
        int sqrtN = (int) Math.sqrt(N);

        // Iterate through numbers from 1 to sqrt(N)
        for (int i = 1; i <= sqrtN; i++) {
            if (N % i == 0) {
                // If i is a factor, count both i and its corresponding factor (N / i)
                count += 2;
            }
        }
        
        // Check if N is a perfect square, and if so, count the square root as an additional factor
        if (sqrtN * sqrtN == N) {
            count--;
        }
        
        return count;
    }
}
