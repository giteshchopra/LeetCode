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
    Stack<Node> stack = new Stack<Node>();
    public List<Integer> postorder(Node root) {
    List<Integer> result = new ArrayList<Integer>();
         if(root == null)
        return result;
    stack.push(root);
    while(!stack.isEmpty())
    {
        root = stack.pop();
        result.add(root.val);
        for(int i = 0 ; i < root.children.size(); i++){
            stack.push(root.children.get(i));
        }
    }
       Collections.reverse(result);
        return result;
        
    }
}
