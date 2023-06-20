
class App24 {

  public static void main (String[] args) {  

     
  }

  public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int solution(int N, int M) {
        int gcd = gcd(N, M);
        long lcm = (long) N * M / gcd;
        return (int) (lcm / M);
    }

}