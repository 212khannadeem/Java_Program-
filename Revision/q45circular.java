public class q45circular {
    public static class queue{
        static int a[];
        static int size;
        static int rear ;
        static int front ;
        
        queue(int size){
            this.size=size;
            this.a=new int[size];
            this.rear=-1;
            this.front=-1;
        }

        public static boolean isempty(){
            return (rear==-1 && front==-1);
        }
        public static boolean isfull(){
            return (rear+1)%size==front;
        }

        public static void add(int data){
            if (isfull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front==-1) {
                front=0;
            }
            rear=(rear+1)%size;
            a[rear]=data;
        }

        public static int remove(){
            if (isempty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int res=a[front];
            if(front==rear){
                front=rear=-1;
            }else{
                front =(front+1)%size;
            }
            return res;
        }

        public static int peek(){
            if (isempty()) {
                System.out.println("Queue is Empty");
                return-1;
            }
            return a[front];
        }


    }


    public static void main(String[] args) {
        queue q=new queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q.remove());
        q.add(60);
        System.out.println(q.remove());
        q.add(70);
        while (!q.isempty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
