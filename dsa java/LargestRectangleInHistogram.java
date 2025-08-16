import java.util.*;
class LargestRectangleInHistogram{
    static int largestRectangleArea(int[] h){
        Deque<Integer> st=new ArrayDeque<>();int ans=0;
        for(int i=0;i<=h.length;i++){
            int cur=i==h.length?0:h[i];
            while(!st.isEmpty()&&cur<h[st.peek()]){
                int height=h[st.pop()];
                int left=st.isEmpty()?-1:st.peek();
                int width=i-left-1;
                ans=Math.max(ans,height*width);
            }
            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }
}
