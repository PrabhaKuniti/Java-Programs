import java.util.*;
class ContainsDuplicate{
    static boolean containsDuplicate(int[] a){
        Set<Integer>s=new HashSet<>();
        for(int x:a) if(!s.add(x)) return true;
        return false;
    }
    public static void main(String[] args){
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
    }
}
