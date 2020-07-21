/*

https://leetcode.com/problems/binary-tree-level-order-traversal-ii/

Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]

*/




class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> al = new ArrayList<>();
        
        if(root==null) return al;
        q.add(root);
        
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode curr = q.poll(); 
                temp.add(curr.val);
                if(curr.left!=null)  q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            al.add(0,temp);
        }
        return al;
    }
}
