import java.util.HashSet;

public class App28 {

    public static void main(String[] args) {
        System.out.println("Hellla");
    }
    
    public int solution(int[] A) {
        // Implement your solution here
        int N=A.length;
        int temp=0;
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i=0;i<N;i++){
            temp=A[i];
            if(temp<0){
                temp=temp * -1;
            }
            hashSet.add(temp);
        }
        return hashSet.size();
    }

}
