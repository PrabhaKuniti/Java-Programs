import java.util.*;
class GenerateParentheses{
    static java.util.List<String> generateParenthesis(int n){
        List<String> res=new ArrayList<>();backtrack(res,new StringBuilder(),0,0,n);return res;
    }
    static void backtrack(List<String> res,StringBuilder sb,int open,int close,int n){
        if(sb.length()==2*n){res.add(sb.toString());return;}
        if(open<n){sb.append('(');backtrack(res,sb,open+1,close,n);sb.deleteCharAt(sb.length()-1);}
        if(close<open){sb.append(')');backtrack(res,sb,open,close+1,n);sb.deleteCharAt(sb.length()-1);}
    }
    public static void main(String[] args){
        System.out.println(generateParenthesis(3).size());
    }
}
