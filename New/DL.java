public class DL {
    public static class Node{
        int val;
        Node next;
        Node back;

        Node(int val, Node next,Node back){
            this.val=val;
            this.next=next;
            this.back=back;
        }

        Node(int val){
            this.val=val;
            this.next=null;
            this.back=null;
        }
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        Node head=new Node(arr[0]);
        Node prev=head;

        for(int i=1;i<arr.length;i++){
            Node newNode = new Node(arr[i], null, prev);
            prev.next=newNode;
            prev=newNode;
        }

        Node temp = head;
        Node prevTemp=null;
        while(temp!=null){
            System.out.println(temp.val);
            prevTemp=temp;
            temp=temp.next;
        }
        while (prevTemp!=null) {
            System.out.println(prevTemp.val);
            print("print");
            prevTemp=prevTemp.back;
        }

    }
}
