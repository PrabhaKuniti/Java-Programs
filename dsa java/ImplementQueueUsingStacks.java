import java.util.*;
class ImplementQueueUsingStacks{
    Deque<Integer> a=new ArrayDeque<>(),b=new ArrayDeque<>();
    public void push(int x){a.push(x);}
    public int pop(){peek();return b.pop();}
    public int peek(){if(b.isEmpty())while(!a.isEmpty())b.push(a.pop());return b.peek();}
    public boolean empty(){return a.isEmpty()&&b.isEmpty();}
    public static void main(String[] args){
        ImplementQueueUsingStacks q=new ImplementQueueUsingStacks();q.push(1);q.push(2);System.out.println(q.peek());
    }
}
