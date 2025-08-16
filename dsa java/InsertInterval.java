import java.util.*;
class InsertInterval{
    static int[][] insert(int[][] a,int[] n){
        List<int[]> res=new ArrayList<>();
        int i=0;
        while(i<a.length&&a[i][1]<n[0]) res.add(a[i++]);
        while(i<a.length&&a[i][0]<=n[1]){n[0]=Math.min(n[0],a[i][0]);n[1]=Math.max(n[1],a[i][1]);i++;}
        res.add(n);
        while(i<a.length) res.add(a[i++]);
        return res.toArray(new int[0][]);
    }
    public static void main(String[] args){
        int[][] r=insert(new int[][]{{1,3},{6,9}},new int[]{2,5});
        System.out.println(java.util.Arrays.deepToString(r));
    }
}
