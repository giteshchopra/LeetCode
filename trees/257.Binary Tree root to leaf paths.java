/*
Given a binary tree, return all root-to-leaf paths.

Note: A leaf is a node with no children.

Example:

Input:

   1
 /   \
2     3
 \
  5

Output: ["1->2->5", "1->3"]

Explanation: All root-to-leaf paths are: 1->2->5, 1->3
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<String> list = new ArrayList<String>();
    public void inOrder(TreeNode root, String result){
        if(root == null)
            return ;
        
        if(root.left == null && root.right == null)
        {
          list.add(result+root.val);
            
        } 
        
        if(root.left!=null) 
            inOrder(root.left,result+root.val+"->") ;
        if(root.right!=null)
            inOrder(root.right, result+root.val+"->") ;
       
        
    }
    public List<String> binaryTreePaths(TreeNode root) {
        inOrder(root,"");
        return list;
        
    }
}
