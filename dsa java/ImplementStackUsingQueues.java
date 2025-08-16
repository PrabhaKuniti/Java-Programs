import java.util.*;
class ImplementStackUsingQueues{
    Deque<Integer> q=new ArrayDeque<>();
    public void push(int x){q.add(x);for(int i=0;i<q.size()-1;i++)q.add(q.remove());}
    public int pop(){return q.remove();}
    public int top(){return q.peek();}
    public boolean empty(){return q.isEmpty();}
    public static void main(String[] args){
        ImplementStackUsingQueues s=new ImplementStackUsingQueues();s.push(1);s.push(2);System.out.println(s.top());
    }
}
