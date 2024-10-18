public class q45{

    public static class queue{
        static int a[];
        static int size;
        static int rear;
        static int front;

        queue(int size){
            this.size=size;
            this.a=new int[size];
            rear=-1;
            front=-1;
        }

        public static boolean isempty(){
            return rear==-1;
        } 

        public static void add(int data){
            if (rear==a.length-1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            a[rear]=data;
        }
        public static int remove(){
            if (isempty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            front=a[0];
            for (int index = 0; index < rear; index++) {
                a[index]=a[index+1];

            }
            rear--;
            return front;
        }

        public static int peek(){
            if (isempty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return a[0];
        }
    }


    public static void main(String[] args) {
        queue q=new queue(5);
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