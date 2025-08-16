import java.util.*;
class LIS{
    static int lengthOfLIS(int[] a){
        int[] d=new int[a.length];int len=0;
        for(int x:a){
            int i=java.util.Arrays.binarySearch(d,0,len,x);
            if(i<0)i=-(i+1);
            d[i]=x;
            if(i==len)len++;
        }
        return len;
    }
    public static void main(String[] args){
        System.out.println(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}
