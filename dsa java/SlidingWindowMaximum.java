import java.util.*;
class SlidingWindowMaximum{
    static int[] maxSlidingWindow(int[] a,int k){
        int n=a.length;int[] res=new int[n-k+1];Deque<Integer> dq=new ArrayDeque<>();int j=0;
        for(int i=0;i<n;i++){
            if(!dq.isEmpty()&&dq.peekFirst()<=i-k) dq.pollFirst();
            while(!dq.isEmpty()&&a[dq.peekLast()]<=a[i]) dq.pollLast();
            dq.addLast(i);
            if(i>=k-1) res[j++]=a[dq.peekFirst()];
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(java.util.Arrays.toString(maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3)));
    }
}
