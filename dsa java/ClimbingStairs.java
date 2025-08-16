class ClimbingStairs{
    static int climbStairs(int n){
        int a=1,b=1;
        for(int i=2;i<=n;i++){int t=a+b;a=b;b=t;}
        return b;
    }
    public static void main(String[] args){
        System.out.println(climbStairs(5));
    }
}
