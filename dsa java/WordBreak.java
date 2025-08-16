import java.util.*;
class WordBreak{
    static boolean wordBreak(String s,List<String> w){
        Set<String> set=new HashSet<>(w);
        boolean[] dp=new boolean[s.length()+1];dp[0]=true;
        for(int i=1;i<=s.length();i++)for(int j=0;j<i;j++)if(dp[j]&&set.contains(s.substring(j,i))){dp[i]=true;break;}
        return dp[s.length()];
    }
    public static void main(String[] args){
        System.out.println(wordBreak("leetcode",java.util.Arrays.asList("leet","code")));
    }
}
