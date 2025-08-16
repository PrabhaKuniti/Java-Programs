import java.util.*;
class TwoSum{
    static int[] twoSum(int[] a,int t){
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<a.length;i++){
            int c=t-a[i];
            if(m.containsKey(c)) return new int[]{m.get(c),i};
            m.put(a[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15},9)));
    }
}
