import java.util.*;
class LongestSubstringWithoutRepeating{
    static int lengthOfLongestSubstring(String s){
        int[] idx=new int[128];
        java.util.Arrays.fill(idx,-1);
        int ans=0,l=0;
        for(int r=0;r<s.length();r++){
            int c=s.charAt(r);
            if(idx[c]>=l) l=idx[c]+1;
            idx[c]=r;
            if(r-l+1>ans) ans=r-l+1;
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
