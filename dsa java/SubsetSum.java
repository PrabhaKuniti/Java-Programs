import java.util.*;
class SubsetSum{
    static java.util.List<java.util.List<Integer>> subsets(int[] a){
        List<List<Integer>> res=new ArrayList<>();res.add(new ArrayList<>());
        for(int x:a){
            int sz=res.size();
            for(int i=0;i<sz;i++){List<Integer> t=new ArrayList<>(res.get(i));t.add(x);res.add(t);}
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(subsets(new int[]{1,2,3}).size());
    }
}
