import java.util.*;
import java.util.Map.Entry;
public class q61 {

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

    public static int max(TreeNode root, TreeNode max) {
        if (root == null) {
            return max.data;
        }
        if (root.data>max.data) {
            max=root;
        }
        
        return Math.max(max(root.left , max),max(root.right, max));
    }

    /*         10
         20           30
    50      70    60     50 
    */

    public static void printAllPath(TreeNode root, int arr[], int ln) {
        if (root == null) {
            return;
        }

        arr[ln] = root.data;
        ln++;

        if (root.left == null || root.right == null) {
            print(arr, ln);
            System.out.println();

        }
        
        printAllPath(root.left, arr, ln);
        printAllPath(root.right, arr, ln);
    }

    public static void leftSide(TreeNode root){
        if (root==null) {
            return;
        }
        if (root.left==null&&root.right==null) {
            return;
        }

        System.out.print(root.data+" ");

        if (root.left!=null) {
            leftSide(root.left);
        }
        else {
            leftSide(root.right);
        }
    }

    public static void leaf(TreeNode root){
        if (root==null) {
            return;
        }
        if (root.left==null && root.right==null) {
            System.out.print(root.data+" ");
            return;
        }
        leaf(root.left);
        leaf(root.right);
    }

    public static void right(TreeNode root){
        if (root == null) {
            return;
        }
        if(root.left==null && root.right==null)
        {
            return;
        }
        if (root.right!=null) {
            right(root.left);
        }
        else if (root.left!=null) {
            right(root.right);
        }
        System.out.print(root.data+" ");
    }

    public static void boundary(TreeNode root){
        System.out.print(root.data+" ");
        leftSide(root.left);
        leaf(root);
        right(root.right);
    }

    private static void print(int[] arr, int ln) {
        for (int i = 0; i < ln; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int getLevel(TreeNode root,int key,int level)
    {
        if(root==null)
            return 0;
        if(root.data==key)
            return level;
 
        int result=getLevel(root.left,key,level+1) ;
        if(result!=0)
        {
            return result;
        }
        result= getLevel(root.right,key,level+1);
 
        return result;
    }

    public static TreeNode lCA(TreeNode root, int a, int b){
        if (root==null) {
            return null;
        }

        if (root.data==a||root.data==b) {
            return root;
        }

        TreeNode left=lCA(root.left, a, b);
        TreeNode right=lCA(root.right, a, b);

        if (left!=null&&right!=null) {
            return root;
        }
        if (left!=null) {
            return left;
        } else {
            return right;
        }

    }

    public static void printVerticalSum(TreeNode root, TreeMap<Integer, Integer> treeNodeMap,int level){
        if (root==null) {
            return;
        }

        printVerticalSum(root.left, treeNodeMap, level-1);

        if (treeNodeMap.get(level)!=null) {
            Integer sum=treeNodeMap.get(level)+root.data;
            treeNodeMap.put(level, sum);
        }
        else{
            treeNodeMap.put(level, root.data);
        }

        printVerticalSum(root.right, treeNodeMap, level+1);
    }
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(10);
        t1.left = new TreeNode(20);
        t1.right = new TreeNode(30);
        t1.left.left = new TreeNode(40);
        t1.left.right = new TreeNode(50);
        t1.right.left = new TreeNode(60);
        t1.right.right = new TreeNode(70);

        // preOrder(t1);
        // int arr[] = new int[20];
        // printAllPath(t1, arr, 0);
        // System.out.println(getLevel(t1, 40, 1));
        // System.out.println(max(t1,t1));
        // TreeNode ica=lCA(t1, 40, 50);
        // System.out.println(ica.data);
        //boundary(t1);
        TreeMap<Integer,Integer> tree=new TreeMap<>();
        printVerticalSum(t1, tree, 0);

        for (Entry<Integer,Integer> e : tree.entrySet()) {
            System.out.println(e.getValue());
        }
        for (Integer e : tree.keySet()) {
            System.out.println(e);
        }
        /*
                5
            6       
        8       9

        */
    }
}
