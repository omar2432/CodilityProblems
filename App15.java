import java.util.HashMap;

public class App15 {
    public static void main(String[] args) {
        System.out.println("Dooodoo");

        int[] A={1,2,3,3,4,5,4,4,6,6,1};

        HashMap<Integer,Boolean> map=new HashMap<>();
        for (int i : A) {
            map.put(i, true);
        }
        
        //return map.size();
    }
    
}
