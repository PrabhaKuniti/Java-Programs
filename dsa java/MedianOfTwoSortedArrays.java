class MedianOfTwoSortedArrays{
    static double findMedianSortedArrays(int[] a,int[] b){
        if(a.length>b.length) return findMedianSortedArrays(b,a);
        int m=a.length,n=b.length,l=0,r=m,half=(m+n+1)/2;
        while(l<=r){
            int i=l+(r-l)/2,j=half-i;
            int al=i==0?Integer.MIN_VALUE:a[i-1];
            int ar=i==m?Integer.MAX_VALUE:a[i];
            int bl=j==0?Integer.MIN_VALUE:b[j-1];
            int br=j==n?Integer.MAX_VALUE:b[j];
            if(al<=br&&bl<=ar){
                if(((m+n)&1)==1) return Math.max(al,bl);
                return (Math.max(al,bl)+Math.min(ar,br))/2.0;
            }else if(al>br) r=i-1; else l=i+1;
        }
        return 0;
    }
    public static void main(String[] args){
        System.out.println(findMedianSortedArrays(new int[]{1,3},new int[]{2}));
    }
}
