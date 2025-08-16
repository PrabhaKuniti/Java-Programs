import java.util.*;
class GroupAnagrams{
    static List<List<String>> groupAnagrams(String[] strs){
        Map<String,List<String>> m=new HashMap<>();
        for(String s:strs){char[] a=s.toCharArray();java.util.Arrays.sort(a);String k=new String(a);m.computeIfAbsent(k,x->new ArrayList<>()).add(s);}
        return new ArrayList<>(m.values());
    }
    public static void main(String[] args){
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}
