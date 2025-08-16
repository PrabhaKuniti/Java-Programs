class HouseRobberII{
    static int rob(int[] a){
        if(a.length==1)return a[0];
        return Math.max(run(a,0,a.length-2),run(a,1,a.length-1));
    }
    static int run(int[] a,int l,int r){
        int incl=0,excl=0;
        for(int i=l;i<=r;i++){int ni=excl+a[i];excl=Math.max(excl,incl);incl=ni;}
        return Math.max(incl,excl);
    }
    public static void main(String[] args){
        System.out.println(rob(new int[]{2,3,2}));
    }
}
