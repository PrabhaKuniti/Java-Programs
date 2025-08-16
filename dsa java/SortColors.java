import java.util.*;
class SortColors{
    static void sortColors(int[] a){
        int l=0,m=0,r=a.length-1;
        while(m<=r){
            if(a[m]==0){int t=a[l];a[l]=a[m];a[m]=t;l++;m++;}
            else if(a[m]==2){int t=a[m];a[m]=a[r];a[r]=t;r--;}
            else m++;
        }
    }
    public static void main(String[] args){
        int[] a={2,0,2,1,1,0};sortColors(a);System.out.println(Arrays.toString(a));
    }
}
