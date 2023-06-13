public class App22 {

    public static void main(String[] args) {
        System.out.println("Helloo");
    }
    

    public int solution(int N) {
        int count = 0;
        
        // Iterate through numbers from 1 to sqrt(N)
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                // If i is a factor, count both i and its corresponding factor
                if (i * i == N) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        
        return count;
    }

}
