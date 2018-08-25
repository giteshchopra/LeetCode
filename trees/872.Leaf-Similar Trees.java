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
    List<Integer> list1 = new ArrayList<Integer>();
    List<Integer> list2 = new ArrayList<Integer>();
    public void traverseList(TreeNode root, List list){
        if(root == null)
            return;
        if(root.left==null && root.right == null)
        {
            list.add(root.val);
        }
        traverseList(root.left,list);
        traverseList(root.right,list);
        
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        traverseList(root1,list1);
        traverseList(root2,list2);
        return list1.equals(list2);
    }
}
