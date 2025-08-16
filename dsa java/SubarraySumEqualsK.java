import java.util.*;
class SubarraySumEqualsK{
    static int subarraySum(int[] a,int k){
        Map<Integer,Integer> m=new HashMap<>();m.put(0,1);
        int sum=0,ans=0;
        for(int x:a){sum+=x;ans+=m.getOrDefault(sum-k,0);m.put(sum,m.getOrDefault(sum,0)+1);}
        return ans;
    }
    public static void main(String[] args){
        System.out.println(subarraySum(new int[]{1,1,1},2));
    }
}
