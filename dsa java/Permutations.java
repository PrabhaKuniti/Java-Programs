import java.util.*;
class Permutations{
    static java.util.List<java.util.List<Integer>> permute(int[] a){
        List<List<Integer>> res=new ArrayList<>();boolean[] v=new boolean[a.length];backtrack(a,v,new ArrayList<>(),res);return res;
    }
    static void backtrack(int[] a,boolean[] v,List<Integer> cur,List<List<Integer>> res){
        if(cur.size()==a.length){res.add(new ArrayList<>(cur));return;}
        for(int i=0;i<a.length;i++) if(!v[i]){v[i]=true;cur.add(a[i]);backtrack(a,v,cur,res);cur.remove(cur.size()-1);v[i]=false;}
    }
    public static void main(String[] args){
        System.out.println(permute(new int[]{1,2,3}).size());
    }
}
