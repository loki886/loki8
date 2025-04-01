class TreeNode 
{
 int val;
 TreeNode left;
 TreeNode right;
 TreeNode(int val)
 {
 this.val = val;
 }
}
public class Main 
{
 public static void preorderTraversal(TreeNode root) 
{
 if (root != null)
{
 System.out.print(root.val + " "); 
 preorderTraversal(root.left); 
 preorderTraversal(root.right);
 }
 }
 public static void inorderTraversal(TreeNode root)
 {
 if (root != null) 
{
 inorderTraversal(root.left);
 System.out.print(root.val + " "); 
 inorderTraversal(root.right); 
 }
 }
 public static void postorderTraversal(TreeNode root)
{
 if (root != null) 
{
 postorderTraversal(root.left); 
 postorderTraversal(root.right); 
 System.out.print(root.val + " "); 
 }
 }
 public static void main(String[] args) 
{
 TreeNode root = new TreeNode(1);
 root.left = new TreeNode(2);
 root.right = new TreeNode(3);
 root.left.left = new TreeNode(4);
 root.left.right = new TreeNode(5);
 root.right.right = new TreeNode(6);
 // Pre-order traversal
 System.out.print("Pre-order traversal: ");
 preorderTraversal(root);
 System.out.println();
  // In-order traversal
 System.out.print("In-order traversal: ");
 inorderTraversal(root);
 System.out.println();
 // Post-order traversal
 System.out.print("Post-order traversal: ");
 postorderTraversal(root);
 System.out.println();
 }
}