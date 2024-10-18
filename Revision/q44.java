public class q44 {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static class Stack1{
        public static Node head=null;
        public static int size=0;
        public void push(int data){
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;
            size++;

        }

        public static int pop(){
            if (head==null) {
                System.out.println("Stack is Empty");
                return 0;
            }
            Node temp=head;
            head=head.next;
            size--;
            return temp.data;
        }

        public static int peek(){
            if (head==null) {
                System.out.println("Stack is Empty");
                return 0;
            }
            return head.data;
        }

        public static int size(){
            return size;
        }

        public static boolean isEmpty(){
            return head==null;
        }

        // public static void sortStack(){
        //     Node temp=head;
        //     int max=temp.data;
        //     for (int i=0;i<size();i++) {
        //         if(max<temp.data){
        //             int t=
        //         }
        //     }
        // }
    }

    

    public static void main(String args[]) {
        Stack1 s=new Stack1();
        s.push(10);
        s.push(40);
        s.push(20);
        s.push(60);
        s.push(50);
        s.push(80);
        s.pop();
        System.out.println("Size ="+s.size);


        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
