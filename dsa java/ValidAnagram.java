class ValidAnagram{
    static boolean isAnagram(String s,String t){
        if(s.length()!=t.length()) return false;
        int[] c=new int[26];
        for(char ch:s.toCharArray()) c[ch-'a']++;
        for(char ch:t.toCharArray()) if(--c[ch-'a']<0) return false;
        return true;
    }
    public static void main(String[] args){
        System.out.println(isAnagram("anagram","nagaram"));
    }
}
