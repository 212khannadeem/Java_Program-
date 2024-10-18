import javax.xml.validation.Validator;

public class bst {

    public static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static TreeNode search(int val, TreeNode root){
        while (root!=null && root.data!=val ) {
            root=val<root.data?root.left:root.right;
        }
        return root;
       } 
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(40);
        t1.left = new TreeNode(30);
        t1.right = new TreeNode(50);
        t1.left.left = new TreeNode(20);
        t1.left.right = new TreeNode(35);
        t1.right.left = new TreeNode(45);
        t1.right.right = new TreeNode(60);

        preOrder(t1);
        // if (search(60, t1)==null) {
        //     System.out.println("Not found");
        // } else {
        //     System.out.println("found");
        // }

        System.out.println(search(60, t1).data);
    }
}
