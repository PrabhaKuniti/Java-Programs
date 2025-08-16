import java.util.*;
class DailyTemperatures{
    static int[] dailyTemperatures(int[] t){
        int n=t.length;int[] res=new int[n];Deque<Integer> st=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&t[i]>t[st.peek()]){int j=st.pop();res[j]=i-j;}
            st.push(i);
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(java.util.Arrays.toString(dailyTemperatures(new int[]{73,74,75,71,69,72,76,73})));
    }
}
