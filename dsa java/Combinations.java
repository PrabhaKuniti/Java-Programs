import java.util.*;
class Combinations{
    static java.util.List<java.util.List<Integer>> combine(int n,int k){
        List<List<Integer>> res=new ArrayList<>();backtrack(1,n,k,new ArrayList<>(),res);return res;
    }
    static void backtrack(int s,int n,int k,List<Integer> cur,List<List<Integer>> res){
        if(cur.size()==k){res.add(new ArrayList<>(cur));return;}
        for(int i=s;i<=n;i++){cur.add(i);backtrack(i+1,n,k,cur,res);cur.remove(cur.size()-1);}
    }
    public static void main(String[] args){
        System.out.println(combine(4,2).size());
    }
}
