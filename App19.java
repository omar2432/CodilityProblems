import java.util.Stack;

public class App19 {

    public static void main(String[] args) {
        System.out.println("dodooodoooo");
    }

    public int solution(String S) {
        int N=S.length();
        if(S.isEmpty()){
            return 1;
        }
        if(N%2==1){
            return 0;
        }

        Stack<Character> stack=new Stack<>();
        
        for (int i=0;i<N;i++) {
            switch(S.charAt(i)){
                case '{':
                case '[':
                case '(':
                    stack.push(S.charAt(i));
                    break;
                case '}':
                    if(stack.isEmpty()){
                        return 0;
                    }
                    char c1 =stack.pop();
                    if(c1!='{'){
                        return 0;
                    }
                    break;
                case ']':
                    if(stack.isEmpty()){
                        return 0;
                    }
                    char c2 =stack.pop();
                    if(c2!='['){
                        return 0;
                    }
                    break;
                case ')':
                    if(stack.isEmpty()){
                        return 0;
                    }
                    char c3 =stack.pop();
                    if(c3!='('){
                        return 0;
                    }
                    break;
            }
        }
        if(stack.isEmpty()){
            return 1;
        }
        return 0;
    }
    
}
