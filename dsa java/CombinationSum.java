import java.util.*;
class CombinationSum{
    static java.util.List<java.util.List<Integer>> combinationSum(int[] c,int t){
        List<List<Integer>> res=new ArrayList<>();backtrack(c,t,0,new ArrayList<>(),res);return res;
    }
    static void backtrack(int[] c,int t,int s,List<Integer> cur,List<List<Integer>> res){
        if(t==0){res.add(new ArrayList<>(cur));return;}
        for(int i=s;i<c.length&&c[i]<=t;i++){cur.add(c[i]);backtrack(c,t-c[i],i,cur,res);cur.remove(cur.size()-1);}
    }
    public static void main(String[] args){
        System.out.println(combinationSum(new int[]{2,3,6,7},7).size());
    }
}
