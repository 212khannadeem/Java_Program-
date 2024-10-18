public class q41stack {
    int a[];
    int top;
    int size;
    q41stack(int size){
        this.size=size;
        top=-1;
        a=new int[size];
    }
    public void push(int data){
        if(top==size-1){
            System.out.println("Stack is full");
        }
        top++;
        a[top]=data;
    }
    public int pop(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        int temp=a[top];
        top--;
        return temp;
    } 
    public int peek(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        return a[top];
    }
    
    public boolean isEmpty(){
        return  top==-1;
    }
    

    public static void main(String args[]){
        q41stack s=new q41stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println("Pop "+s.pop());
        System.out.println(" Stack");
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println(s.peek());
        // s.pop();
        // s.peek();
        
    }
}
