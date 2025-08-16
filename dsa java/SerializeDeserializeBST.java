class SerializeDeserializeBST{
    static class TreeNode{int val;TreeNode left,right;TreeNode(int v){val=v;}}
    static String serialize(TreeNode r){
        StringBuilder sb=new StringBuilder();pre(r,sb);return sb.toString();
    }
    static void pre(TreeNode n,StringBuilder sb){
        if(n==null)return;sb.append(n.val).append(",");
        pre(n.left,sb);pre(n.right,sb);
    }
    static int idx;
    static TreeNode deserialize(String s){
        String[] a=s.isEmpty()?new String[0]:s.split(",");idx=0;return build(a,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    static TreeNode build(String[] a,long lo,long hi){
        if(idx>=a.length)return null;
        int v=Integer.parseInt(a[idx]);
        if(v<=lo||v>=hi)return null;
        idx++;TreeNode n=new TreeNode(v);
        n.left=build(a,lo,v);n.right=build(a,v,hi);
        return n;
    }
    public static void main(String[] args){
        TreeNode r=new TreeNode(2);r.left=new TreeNode(1);r.right=new TreeNode(3);
        String s=serialize(r);System.out.println(deserialize(s).val);
    }
}
