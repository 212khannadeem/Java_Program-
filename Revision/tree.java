import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class tree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void preorder(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }
            
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void levelOrder(Node root) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {                     
                Node curNode = q.remove();
                if (curNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(curNode.data + " ");
                    if (curNode.left != null) {
                        q.add(curNode.left);
                    }
                    if (curNode.right != null) {
                        q.add(curNode.right);
                    }
                }
            }
        }

        static void printLeaf(Node root){
        
    
                    if (root == null)
                        return;
                    
                    
                    if (root.left == null && root.right == null)
                    {
                        System.out.print(root.data + " ");
                        return;
                    }
                    if (root.left != null)
                        printLeaf(root.left);
                    
                    if (root.right != null)
                        printLeaf(root.right);
                }

        static int countLeaf(Node root){
    
                    if (root == null)
                        return 0;
                    
                    
                    if (root.left == null && root.right == null)
                    {
                        return 1;
                    }
                    else{
                        return countLeaf(root.left)+countLeaf(root.right);
                    }
                }
        public static void printSpiral(Node root){
        if (root == null)
            return; 
 
        Stack<Node> s1 = new Stack<Node>();
        
        Stack<Node> s2 = new Stack<Node>();
 
        
        s1.push(root);
 
        
        while (!s1.empty() || !s2.empty()) {
            
            while (!s1.empty()) {
                Node temp = s1.peek();
                s1.pop();
                System.out.print(temp.data + " ");
 
                
                if (temp.right != null)
                    s2.push(temp.right);
 
                if (temp.left != null)
                    s2.push(temp.left);
            }

            while (!s2.empty()) {
                Node temp = s2.peek();
                s2.pop();
                System.out.print(temp.data + " ");
 
                if (temp.left != null)
                    s1.push(temp.left);
                if (temp.right != null)
                    s1.push(temp.right);
            }
        }
    }
        public static int height(Node root){
            if (root==null) {
                return 0;
            }
            int left=height(root.left);
            int right=height(root.right);
            return Math.max(left, right)+1;

        }
        public static int countOfNodes(Node root) {
            if(root == null) {
                return 0;
            }
      
            int leftNodes = countOfNodes(root.left);
            int rightNodes = countOfNodes(root.right);
            return leftNodes + rightNodes + 1;
        }

        public static int diameter(Node root){
            if (root==null) {
                return 0;
            }

            int dia1=diameter(root.left);
            int dia2=diameter(root.right);
            int dia3=height(root.left)+height(root.right)+1;

            return Math.max(Math.max(dia1, dia2),dia3);
        }

        public static boolean isIdentical(Node root, Node subroot){
            if(root==null&&subroot==null){
                return true;
            }
            if (root==null||subroot==null) {
                return false;
            }

            if (root.data==subroot.data) {
                return isIdentical(root.left, subroot.left)&&isIdentical(root.right, subroot.right);
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
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree t = new BinaryTree();
        Node root = t.buildTree(nodes);
        int nodes1[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Node subroot = t.buildTree(nodes1);
        System.out.println(root.data);

        t.preorder(root);
        System.out.println();
        t.inorder(root);
        System.out.println();
        t.levelOrder(root);
        System.out.println("Height = "+t.height(root));
        System.out.println("Nodes = "+t.countOfNodes(root));
        System.out.println("Diameter = "+t.diameter(root));
        t.printSpiral(root);
        t.printLeaf(root);
        System.out.println(t.countLeaf(root));
        //tree t1=new tree();
        System.out.println( t.isSubTree(root, subroot));

        
        /*
                1
            2       3
          4   5  -1   6

                2
            4       5
        */

    }
}
 