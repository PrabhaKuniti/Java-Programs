import java.util.*;
class ThreeSum{
    static List<List<Integer>> threeSum(int[] a){
        java.util.Arrays.sort(a);List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(i>0&&a[i]==a[i-1]) continue;
            int l=i+1,r=a.length-1;
            while(l<=r){
                int s=a[i]+a[l]+a[r];
                if(s==0){res.add(java.util.Arrays.asList(a[i],a[l],a[r]));l++;r--;while(l<r&&a[l]==a[l-1])l++;while(l<r&&a[r]==a[r+1])r--;}
                else if(s<0) l++; else r--;
            }
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
