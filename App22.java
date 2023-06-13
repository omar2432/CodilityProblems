public class App22 {

    public static void main(String[] args) {
        System.out.println("Helloo");
    }
    

    public int solution(int N) {
        // Implement your solution here
        int count=1;
        for(int i=1;i<N/2;i++){
            if(N%i ==0){
                count++;
            }
        }
        return count;
    }

}
