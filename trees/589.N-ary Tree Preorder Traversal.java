
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    List<Integer> result = new ArrayList<Integer>();
    public List<Integer> preorder(Node root) {
        Stack<Node> stack = new Stack<Node>();
        if(root == null)
            return result;
        stack.add(root);
        while(!stack.isEmpty()){
            root = stack.pop();
            result.add(root.val);
            for(int i = root.children.size()-1; i >= 0;i--){
                stack.push(root.children.get(i));
            }
        }
       
        return result;
    }
}
