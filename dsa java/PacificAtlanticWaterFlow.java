import java.util.*;
class PacificAtlanticWaterFlow{
    static java.util.List<int[]> pacificAtlantic(int[][] h){
        int r=h.length,c=h[0].length;
        boolean[][] p=new boolean[r][c],a=new boolean[r][c];
        for(int i=0;i<r;i++){dfs(h,p,i,0,Integer.MIN_VALUE);dfs(h,a,i,c-1,Integer.MIN_VALUE);}
        for(int j=0;j<c;j++){dfs(h,p,0,j,Integer.MIN_VALUE);dfs(h,a,r-1,j,Integer.MIN_VALUE);}
        java.util.List<int[]> res=new ArrayList<>();
        for(int i=0;i<r;i++)for(int j=0;j<c;j++)if(p[i][j]&&a[i][j])res.add(new int[]{i,j});
        return res;
    }
    static void dfs(int[][] h,boolean[][] v,int i,int j,int prev){
        if(i<0||j<0||i>=h.length||j>=h[0].length||v[i][j]||h[i][j]<prev)return;
        v[i][j]=true;
        dfs(h,v,i+1,j,h[i][j]);dfs(h,v,i-1,j,h[i][j]);dfs(h,v,i,j+1,h[i][j]);dfs(h,v,i,j-1,h[i][j]);
    }
    public static void main(String[] args){
        int[][] m={{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
        System.out.println(pacificAtlantic(m).size());
    }
}
