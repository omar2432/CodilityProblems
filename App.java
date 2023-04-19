import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        

        int  N =35777;
        int max=0;
        int current=0;
        Boolean first= false;
        boolean[] arr = new boolean[32];
        Arrays.fill(arr, false);

        for(int i=31;i>=0;i--){

            if(N>=(int)Math.pow(2, i)){
                N=N-(int)Math.pow(2, i);
                arr[i]=true;
            }else{
                arr[i]=false;
            }


            
            if(arr[i]){
                if(!first){
                    first=true;
                }else{
                    if(current==0){
                        continue;
                    }else{
                        
                        if(current>max){
                            max=current;
                            
                        }
                        current=0;
                    }
                }
            }else{
                if(first){
                    current++;
                }
            }



        }



System.out.println("MAX");
System.out.println(max);

    }
}
