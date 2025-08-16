import java.util.*;
class CoinChange{
    static int coinChange(int[] c,int a){
        int[] dp=new int[a+1];java.util.Arrays.fill(dp,a+1);dp[0]=0;
        for(int i=1;i<=a;i++) for(int x:c) if(x<=i) dp[i]=Math.min(dp[i],dp[i-x]+1);
        return dp[a]>a?-1:dp[a];
    }
    public static void main(String[] args){
        System.out.println(coinChange(new int[]{1,2,5},11));
    }
}
