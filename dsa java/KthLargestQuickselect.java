class KthLargestQuickselect{
    static int findKthLargest(int[] a,int k){
        int t=a.length-k,l=0,r=a.length-1;
        java.util.Random rand=new java.util.Random();
        while(l<=r){
            int p=l+rand.nextInt(r-l+1);
            int v=a[p];int i=l,j=r;
            while(i<=j){
                while(a[i]<v)i++;
                while(a[j]>v)j--;
                if(i<=j){int tmp=a[i];a[i]=a[j];a[j]=tmp;i++;j--;}
            }
            if(t<=j) r=j;
            else if(t>=i) l=i;
            else return a[t];
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println(findKthLargest(new int[]{3,2,1,5,6,4},2));
    }
}
