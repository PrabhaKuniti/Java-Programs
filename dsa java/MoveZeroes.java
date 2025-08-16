import java.util.*;
class MoveZeroes{
    static void moveZeroes(int[] a){
        int j=0;
        for(int i=0;i<a.length;i++) if(a[i]!=0) {int t=a[i];a[i]=a[j];a[j]=t;j++;}
    }
    public static void main(String[] args){
        int[] a={0,1,0,3,12};moveZeroes(a);System.out.println(Arrays.toString(a));
    }
}
