public class q44a {
    int a[];
    int top;
    int size;
    q44a(int size){
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
            return 0;
        }
        int temp=a[top];
        top--;
        return temp;
    } 
    public int peek(){
        if(top==-1){
            System.out.println("stack is empty");
            return 0;
        }
        return a[top];
    }
    
    public boolean isEmpty(){
        return  top==-1;
    }

    public void sortStack(int n){
        for(int j=0;j<n;j++){
            int max=a[j];
            for(int i=j;i<n;i++){
                if(max<a[i]){
                    int temp=max;
                    max=a[i];
                    a[i]=temp;
                }
                push(max);
            }
        }
    }

    public static void main(String args[]) {
        q44a s=new q44a(5);
        s.push(10);
        s.push(30);
        s.push(20);
        s.push(50);
        s.push(40);
        s.sortStack(5);
        System.out.println(" Stack");
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
