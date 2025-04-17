
 class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        if(root == null) return result;

        result.add(root.val);
        left = preorderTraversal(root.left);
        right = preorderTraversal(root.right);
        for(int x : left) result.add(x);
        for(int y : right) result.add(y);
        return result;
    }
    
}