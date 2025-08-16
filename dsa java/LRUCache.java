import java.util.*;
class LRUCache extends LinkedHashMap<Integer,Integer>{
    int cap;
    public LRUCache(int c){super(c,0.75f,true);cap=c;}
    public int get(int k){return super.getOrDefault(k,-1);}
    public void put(int k,int v){super.put(k,v);}
    protected boolean removeEldestEntry(Map.Entry<Integer,Integer> e){return size()>cap;}
    public static void main(String[] args){
        LRUCache c=new LRUCache(2);c.put(1,1);c.put(2,2);c.get(1);c.put(3,3);System.out.println(c.get(2));
    }
}
