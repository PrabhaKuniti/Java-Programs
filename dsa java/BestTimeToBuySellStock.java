class BestTimeToBuySellStock{
    static int maxProfit(int[] p){
        int mn=Integer.MAX_VALUE,ans=0;
        for(int x:p){if(x<mn)mn=x; else if(x-mn>ans)ans=x-mn;}
        return ans;
    }
    public static void main(String[] args){
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
