import java.util.HashMap;
import java.util.Random;

public class App20 {
    public static void main(String[] args) {
        System.out.println("helloooozzzzzz");
    }
    

    public int solution(int[] A) {
        // Implement your solution here
        int N=A.length;
        if(N==0){
            return -1;
        }
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++){
            if(map.containsKey(A[i])){
                count=map.get(A[i])+1;
                map.put(A[i], count);
            }else{
                map.put(A[i], 1);
            }
        }
        double maxCount=0;
        int value=0;
        int currentCount=0;
        for(Integer key: map.keySet()){
            currentCount=map.get(key);
            if(currentCount>maxCount){
                maxCount=currentCount;
                value=key;
            }
        }
        Random random=new Random();
        int index=0;
        if(maxCount/N >0.5){
            while(true){
                index=random.nextInt(N);
                if(A[index]==value){
                    return index;
                }
            }
        }
        return -1;


    }
}
