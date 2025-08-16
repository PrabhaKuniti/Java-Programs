import java.util.*;
class SpiralMatrix{
    static java.util.List<Integer> spiralOrder(int[][] m){
        List<Integer> res=new ArrayList<>();int top=0,bot=m.length-1,l=0,r=m[0].length-1;
        while(top<=bot&&l<=r){
            for(int j=l;j<=r;j++) res.add(m[top][j]);top++;
            for(int i=top;i<=bot;i++) res.add(m[i][r]);r--;
            if(top<=bot) for(int j=r;j>=l;j--) res.add(m[bot][j]);bot--;
            if(l<=r) for(int i=bot;i>=top;i--) res.add(m[i][l]);l++;
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
}
