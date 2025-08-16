class ValidSudoku{
    static boolean isValidSudoku(char[][] b){
        boolean[][] r=new boolean[9][9],c=new boolean[9][9],g=new boolean[9][9];
        for(int i=0;i<9;i++)for(int j=0;j<9;j++){
            if(b[i][j]=='.')continue;
            int d=b[i][j]-'1',k=(i/3)*3+j/3;
            if(r[i][d]||c[j][d]||g[k][d])return false;
            r[i][d]=c[j][d]=g[k][d]=true;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isValidSudoku(new char[][]{{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}}));
    }
}
