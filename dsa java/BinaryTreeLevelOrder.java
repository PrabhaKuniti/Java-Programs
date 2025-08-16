import java.util.*;
class BinaryTreeLevelOrder{
    static class TreeNode{int val;TreeNode left,right;TreeNode(int v){val=v;}}
    static java.util.List<java.util.List<Integer>> levelOrder(TreeNode r){
        List<List<Integer>> res=new ArrayList<>();if(r==null)return res;Deque<TreeNode> q=new ArrayDeque<>();q.add(r);
        while(!q.isEmpty()){
            int sz=q.size();List<Integer> cur=new ArrayList<>();
            for(int i=0;i<sz;i++){
                TreeNode n=q.poll();cur.add(n.val);
                if(n.left!=null)q.add(n.left);if(n.right!=null)q.add(n.right);
            }
            res.add(cur);
        }
        return res;
    }
    public static void main(String[] args){
        TreeNode r=new TreeNode(3);r.left=new TreeNode(9);r.right=new TreeNode(20);r.right.left=new TreeNode(15);r.right.right=new TreeNode(7);
        System.out.println(levelOrder(r).size());
    }
}
