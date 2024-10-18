public class q67 {
    public static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }

    public static class pair{
        int count;
        int sum;
        pair(int count, int sum){
            this.count=count;
            this.sum=sum;
        }
    }

    public static pair returnPair(TreeNode  root, int target){
        if (root==null) {
            return new pair(0, 0);
        }
        
        pair left=returnPair(root.left, target);
        pair right=returnPair(root.right, target);

        int sum = left.sum + right.sum + root.data;
        int count = left.count + right.count;
        if(sum==target)
        {
            count++;
        }
        return new pair(count, sum);
    }
    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(10);
        t1.left = new TreeNode(20);
        t1.right = new TreeNode(30);
        t1.left.left = new TreeNode(50);
        t1.left.right = new TreeNode(70);
        t1.right.left = new TreeNode(60);
        t1.right.right = new TreeNode(50);

        System.out.println(returnPair(t1, 140).count);
    }
}
