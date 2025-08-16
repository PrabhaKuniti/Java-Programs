import java.util.*;
class CombinationSumII{
    static java.util.List<java.util.List<Integer>> combinationSum2(int[] c,int t){
        java.util.Arrays.sort(c);List<List<Integer>> res=new ArrayList<>();backtrack(c,t,0,new ArrayList<>(),res);return res;
    }
    static void backtrack(int[] c,int t,int s,List<Integer> cur,List<List<Integer>> res){
        if(t==0){res.add(new ArrayList<>(cur));return;}
        for(int i=s;i<c.length;i++){if(i>s&&c[i]==c[i-1])continue;if(c[i]>t)break;cur.add(c[i]);backtrack(c,t-c[i],i+1,cur,res);cur.remove(cur.size()-1);}
    }
    public static void main(String[] args){
        System.out.println(combinationSum2(new int[]{10,1,2,7,6,1,5},8).size());
    }
}
