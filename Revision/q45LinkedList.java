public class q45LinkedList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }

    public static class queue{
        static Node head=null;
        static Node tail=null;

        public static boolean isempty(){
            return head==null&&tail==null;

        }

        public static void add(int data){
            Node newNode = new Node(data);
            if (isempty()) {
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;

        }
        
        public static int remove(){
            if(isempty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front =head.data;
            if (head==tail) {
                tail =null;
            }
            head=head.next;
            return front;
        }

        public static int peek(){
            if(isempty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }



    public static void main(String[] args) {
        queue q=new queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        while (!q.isempty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
