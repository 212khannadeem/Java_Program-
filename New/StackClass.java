package New;

public class StackClass {
    public static class Node{
        int val;
        Node next;
        Node(int data){
            this.val=data;
            this.next=null;
        }
    }
    public static class Stack{
        public static Node head;
        public static int Size;
        public static void push(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
            Size++;
        }
        public static int pop(){
            if(head==null){
                return Integer.MIN_VALUE;
            }
            int val=head.val;
            head=head.next;
            Size--;
            return val; 
        }
        public static int peek(){
            if(head==null){
                return Integer.MIN_VALUE;
            }
            return head.val;
        }
    }
    
    public static void main(String[] args) {
        Stack st= new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.Size);

    }
}
