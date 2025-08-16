import java.util.*;
class CloneGraph{
    static class Node{int val;List<Node> neighbors;Node(int v){val=v;neighbors=new ArrayList<>();}}
    static Node cloneGraph(Node n){
        if(n==null)return null;
        Map<Node,Node> m=new HashMap<>();
        Deque<Node> q=new ArrayDeque<>();q.add(n);m.put(n,new Node(n.val));
        while(!q.isEmpty()){
            Node cur=q.poll();
            for(Node nei:cur.neighbors){
                if(!m.containsKey(nei)){m.put(nei,new Node(nei.val));q.add(nei);}
                m.get(cur).neighbors.add(m.get(nei));
            }
        }
        return m.get(n);
    }
    public static void main(String[] args){
        Node a=new Node(1);Node b=new Node(2);a.neighbors.add(b);b.neighbors.add(a);
        System.out.println(cloneGraph(a).val);
    }
}
