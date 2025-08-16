class DiameterOfBinaryTree{
    static class TreeNode{int val;TreeNode left,right;TreeNode(int v){val=v;}}
    static int ans;
    static int diameterOfBinaryTree(TreeNode r){
        ans=0;d(r);return ans;
    }
    static int d(TreeNode n){
        if(n==null)return 0;
        int l=d(n.left),ri=d(n.right);if(l+ri>ans)ans=l+ri;return 1+Math.max(l,ri);
    }
    public static void main(String[] args){
        TreeNode r=new TreeNode(1);r.left=new TreeNode(2);r.right=new TreeNode(3);r.left.left=new TreeNode(4);r.left.right=new TreeNode(5);
        System.out.println(diameterOfBinaryTree(r));
    }
}
