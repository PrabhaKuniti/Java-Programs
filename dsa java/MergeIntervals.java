import java.util.*;
class MergeIntervals{
    static int[][] merge(int[][] a){
        java.util.Arrays.sort(a,(x,y)->x[0]-y[0]);
        List<int[]> res=new ArrayList<>();
        int s=a[0][0],e=a[0][1];
        for(int i=1;i<a.length;i++){
            if(a[i][0]<=e) e=Math.max(e,a[i][1]);
            else{res.add(new int[]{s,e});s=a[i][0];e=a[i][1];}
        }
        res.add(new int[]{s,e});
        return res.toArray(new int[0][]);
    }
    public static void main(String[] args){
        int[][] r=merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
        System.out.println(java.util.Arrays.deepToString(r));
    }
}
