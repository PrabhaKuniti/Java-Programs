class LowestCommonAncestorBST{
    static class TreeNode{int val;TreeNode left,right;TreeNode(int v){val=v;}}
    static TreeNode lowestCommonAncestor(TreeNode r,TreeNode p,TreeNode q){
        while(r!=null){
            if(p.val<r.val&&q.val<r.val) r=r.left;
            else if(p.val>r.val&&q.val>r.val) r=r.right;
            else return r;
        }
        return null;
    }
    public static void main(String[] args){
        TreeNode r=new TreeNode(6);r.left=new TreeNode(2);r.right=new TreeNode(8);
        System.out.println(lowestCommonAncestor(r,r.left,r.right).val);
    }
}
