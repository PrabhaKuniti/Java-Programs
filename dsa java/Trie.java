class Trie{
    static class Node{Node[] c=new Node[26];boolean end;}
    Node root=new Node();
    public void insert(String w){
        Node n=root;for(char ch:w.toCharArray()){int i=ch-'a';if(n.c[i]==null)n.c[i]=new Node();n=n.c[i];}n.end=true;
    }
    public boolean search(String w){
        Node n=root;for(char ch:w.toCharArray()){int i=ch-'a';if(n.c[i]==null)return false;n=n.c[i];}return n.end;
    }
    public boolean startsWith(String p){
        Node n=root;for(char ch:p.toCharArray()){int i=ch-'a';if(n.c[i]==null)return false;n=n.c[i];}return true;
    }
    public static void main(String[] args){
        Trie t=new Trie();t.insert("apple");System.out.println(t.search("apple"));
    }
}
