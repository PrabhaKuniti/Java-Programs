import java.util.*;
class ValidParentheses{
    static boolean isValid(String s){
        Deque<Character> st=new ArrayDeque<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='['||c=='{') st.push(c);
            else{
                if(st.isEmpty()) return false;
                char p=st.pop();
                if((c==')'&&p!='(')||(c==']'&&p!='[')||(c=='}'&&p!='{')) return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args){
        System.out.println(isValid("()[]{}"));
    }
}
