import java.util.*;
class MinWindowSubstring{
    static String minWindow(String s,String t){
        int[] need=new int[128];int required=0;
        for(char c:t.toCharArray()){if(need[c]==0)required++;need[c]++;}
        int[] have=new int[128];int formed=0;
        int l=0,ansL=0,ansR=Integer.MAX_VALUE;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);have[c]++;
            if(have[c]==need[c]) formed++;
            while(formed==required){
                if(r-l<ansR-ansL){ansL=l;ansR=r;}
                char d=s.charAt(l++);have[d]--;if(have[d]<need[d]) formed--;
            }
        }
        return ansR==Integer.MAX_VALUE?"":s.substring(ansL,ansR+1);
    }
    public static void main(String[] args){
        System.out.println(minWindow("ADOBECODEBANC","ABC"));
    }
}
