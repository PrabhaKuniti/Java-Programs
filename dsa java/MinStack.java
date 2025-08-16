import java.util.*;
class MinStack{
    Deque<Integer> s=new ArrayDeque<>(),m=new ArrayDeque<>();
    public void push(int x){s.push(x);m.push(m.isEmpty()?x:Math.min(x,m.peek()));}
    public void pop(){s.pop();m.pop();}
    public int top(){return s.peek();}
    public int getMin(){return m.peek();}
    public static void main(String[] args){
        MinStack ms=new MinStack();ms.push(-2);ms.push(0);ms.push(-3);System.out.println(ms.getMin());
    }
}
