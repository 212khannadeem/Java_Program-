public class subTree {
    Node root;
 
    
    static class Node {
        int data;
        Node left, right;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
 
    
    public Node insertLevelOrder(int[] arr, Node root,int i)
    {
        if (i < arr.length) {
            Node temp = new Node(arr[i]);
            root = temp;
 
            root.left = insertLevelOrder(arr, root.left, 2 * i + 1);

            root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
        }
        return root;
    }
 
    
    public void inOrder(Node root)
    {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

    }

    public static boolean isIdentical(Node root, Node subroot){
        if(root==null&&subroot==null){
            return true;
        }
        if (root==null||subroot==null) {
            return false;
        }

        if (root.data==subroot.data) {
            return isIdentical(root.left, subroot.right)&&isIdentical(root.right, subroot.right);
        }

        return false;
    } 
    
    public static boolean isSubTree(Node root,Node subroot){
        if (subroot==null) {
            return true;
        }
        if (root==null) {
            return false;
        }
        if(isIdentical(root, subroot)){
            return true;
        }
        return isIdentical(root.left, subroot)&&isIdentical(root.right, subroot);
    }
 
    
    public static void main(String args[])
    {
        subTree t2 = new subTree();
        int arr[] = { 1, 2, 3, 4, 5, 6, 6, 6, 6 };
        Node root = t2.insertLevelOrder(arr, t2.root, 0);
        int arr1[] = { 1, 2, 3, 4, 5, 6, 6, 6, 6 };
        Node root2 = t2.insertLevelOrder(arr1, t2.root, 0);
        System.out.println(t2.isSubTree(root, root2));
        
    }
}
