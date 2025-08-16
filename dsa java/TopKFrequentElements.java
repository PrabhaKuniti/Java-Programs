import java.util.*;
class TopKFrequentElements{
    static int[] topKFrequent(int[] a,int k){
        Map<Integer,Integer> f=new HashMap<>();
        for(int x:a) f.put(x,f.getOrDefault(x,0)+1);
        List<Integer>[] b=new List[a.length+1];
        for(int x:f.keySet()){int c=f.get(x);if(b[c]==null)b[c]=new ArrayList<>();b[c].add(x);}
        int[] res=new int[k];int idx=0;
        for(int i=b.length-1;i>=0&&idx<k;i--) if(b[i]!=null) for(int x:b[i]){if(idx<k)res[idx++]=x;}
        return res;
    }
    public static void main(String[] args){
        System.out.println(java.util.Arrays.toString(topKFrequent(new int[]{1,1,1,2,2,3},2)));
    }
}
