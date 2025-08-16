import java.util.*;
class SetMatrixZeroes{
    static void setZeroes(int[][] m){
        int r=m.length,c=m[0].length;
        boolean fr=false,fc=false;
        for(int i=0;i<r;i++) if(m[i][0]==0) fc=true;
        for(int j=0;j<c;j++) if(m[0][j]==0) fr=true;
        for(int i=1;i<r;i++) for(int j=1;j<c;j++) if(m[i][j]==0){m[i][0]=0;m[0][j]=0;}
        for(int i=1;i<r;i++) if(m[i][0]==0) for(int j=1;j<c;j++) m[i][j]=0;
        for(int j=1;j<c;j++) if(m[0][j]==0) for(int i=1;i<r;i++) m[i][j]=0;
        if(fc) for(int i=0;i<r;i++) m[i][0]=0;
        if(fr) for(int j=0;j<c;j++) m[0][j]=0;
    }
    public static void main(String[] args){
        int[][] a={{1,1,1},{1,0,1},{1,1,1}};setZeroes(a);System.out.println(java.util.Arrays.deepToString(a));
    }
}
