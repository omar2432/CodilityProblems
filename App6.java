public class App6 {
    public static void main(String[] args) {
        

        int[] A={5, -10, 7, 3, -2, 1, -8, 4, 9, -6, 2, -4, 6, -1, 0};

        int N =A.length;
        int sumlift=A[0];
        int sumright=A[N-1];

        if(N==2){
            System.out.println(Math.abs(sumlift-sumright));
            //return Math.abs(sumlift-sumright);
        }

        int i=1;
        int j=N-2;

        while(i<=j){
            if(Math.abs(sumlift-(sumright+A[j]))<Math.abs(sumlift+A[i]-sumright)){
                sumright+= A[j];
                j--;
            }
            else{
                sumlift+= A[i];
                i++;
            }            
        }
        System.out.println(Math.abs(sumlift-sumright));
            //return Math.abs(sumlift-sumright);
    }
}
