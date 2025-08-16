class HouseRobber{
    static int rob(int[] a){
        int incl=0,excl=0;
        for(int x:a){int ni=excl+x;excl=Math.max(excl,incl);incl=ni;}
        return Math.max(incl,excl);
    }
    public static void main(String[] args){
        System.out.println(rob(new int[]{1,2,3,1}));
    }
}
