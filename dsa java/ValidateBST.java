class ValidateBST{
    static class TreeNode{int val;TreeNode left,right;TreeNode(int v){val=v;}}
    static boolean isValidBST(TreeNode r){
        return v(r,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    static boolean v(TreeNode n,long lo,long hi){
        if(n==null)return true;
        if(n.val<=lo||n.val>=hi)return false;
        return v(n.left,lo,n.val)&&v(n.right,n.val,hi);
    }
    public static void main(String[] args){
        TreeNode r=new TreeNode(2);r.left=new TreeNode(1);r.right=new TreeNode(3);System.out.println(isValidBST(r));
    }
}
