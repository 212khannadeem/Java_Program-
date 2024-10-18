public class q42 {
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static class stack{
        public static Node head =null;
        public static int size=0;
        public void push(int data) {
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;
            size++;
        }

        public int pop(){
            if(head==null){
                System.out.println("Stack is Empty");
            }
            Node temp=head;
            head=head.next;
            size--;
            return temp.data;
        }

        public int peek(){
            if(head==null){
                System.out.println("Stack is Empty");
            }
            Node temp = head;
            return temp.data;
        }

        public boolean isEmpty(){
            return head==null;
        }

        public int size(){
            return size;
        }
    
    }

    
    public static void main(String args[]) {
        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(20);
        s.push(30);
        s.pop();

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println(s.peek());
    }
}
