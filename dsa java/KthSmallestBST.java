class KthSmallestBST{
    static class TreeNode{int val;TreeNode left,right;TreeNode(int v){val=v;}}
    static int kthSmallest(TreeNode r,int k){
        java.util.Deque<TreeNode> st=new java.util.ArrayDeque<>();
        while(true){
            while(r!=null){st.push(r);r=r.left;}
            r=st.pop();if(--k==0)return r.val;r=r.right;
        }
    }
    public static void main(String[] args){
        TreeNode r=new TreeNode(3);r.left=new TreeNode(1);r.right=new TreeNode(4);r.left.right=new TreeNode(2);
        System.out.println(kthSmallest(r,1));
    }
}
