class BinarySearch{
    static int search(int[] a,int t){
        int l=0,r=a.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(a[m]==t) return m;
            else if(a[m]<t) l=m+1;
            else r=m-1;
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println(search(new int[]{1,2,3,4,5},4));
    }
}
