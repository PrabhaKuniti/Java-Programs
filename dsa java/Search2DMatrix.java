class Search2DMatrix{
    static boolean searchMatrix(int[][] m,int t){
        int r=m.length,c=m[0].length,l=0,h=r*c-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            int x=m[mid/c][mid%c];
            if(x==t) return true;
            if(x<t) l=mid+1; else h=mid-1;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(searchMatrix(new int[][]{{1,3,5},{7,9,11}},9));
    }
}
