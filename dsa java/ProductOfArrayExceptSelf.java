import java.util.*;
class ProductOfArrayExceptSelf{
    static int[] productExceptSelf(int[] a){
        int n=a.length;int[] ans=new int[n];ans[0]=1;
        for(int i=1;i<n;i++) ans[i]=ans[i-1]*a[i-1];
        int r=1;
        for(int i=n-1;i>=0;i--){ans[i]*=r;r*=a[i];}
        return ans;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
    }
}
