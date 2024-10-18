import java.util.*;

class Check
{
    public int count=0;
    void ans(char a1,char a2){
        if(a1==a2){
            System.out.println("Yay ! You got the right answer :)");
            count++;
        } 
        else{
            System.out.println("Oh ! Your answer is  wrong answer :( . Right answer is "+a1);
        }
    }
}
class quiz {

    public static void main(String args[]) {
        char a1,a2;
        Scanner s=new Scanner(System.in);
        Check c = new Check();
        System.out.print("Enter Your Name : ");
        String name  =s.nextLine();
        System.out.println(name+" your BASIC JAVA(10 Question) quiz is start now.");
        System.out.println();
        System.out.println("1) The default value of a static integer variable of a class in Java is");
        System.out.println("(a) 0  (b) 1  (c) Null  (d) -1.");
        a1='a';
        System.out.print("Enter your choice : ");
        a2=s.next().charAt(0);
        System.out.println("You Entered "+a2);
        c.ans(a1, a2);
        System.out.println();

        System.out.println("2) To prevent any method from overriding, we declare the method as,");
        System.out.println("(a) static  (b) const  (c) final  (d) abstract ");
        a1='c';
        System.out.print("Enter your choice : ");
        a2=s.next().charAt(0);
        System.out.println("You Entered "+a2);
        c.ans(a1, a2);
        System.out.println();

        System.out.println("3) The fields in an interface are implicitly specified as,");
        System.out.println("(a) static only  (b) protected  (c) private  (d) both static and final");
        a1='d';
        System.out.print("Enter your choice : ");
        a2=s.next().charAt(0);
        System.out.println("You Entered "+a2);
        c.ans(a1, a2);
        System.out.println();

        System.out.println("4) Among these expressions, which is(are) of type String?");
        System.out.println("(a) 0 (b) abcd  (c) 10  (d) Both (A) and (B) above ");
        a1='b';
        System.out.print("Enter your choice : ");
        a2=s.next().charAt(0);
        System.out.println("You Entered "+a2);
        c.ans(a1, a2);
        System.out.println();

        System.out.println("5) The java run time system automatically calls this method while garbage collection.");
        System.out.println("(a) finalizer()  (b) finalize()  (c) finally()  (d) finalized() ");
        a1='b';
        System.out.print("Enter your choice : ");
        a2=s.next().charAt(0);
        System.out.println("You Entered "+a2);
        c.ans(a1, a2);
        System.out.println();

        System.out.println("6) All exception types are subclasses of the built-in class");
        System.out.println("(a) Exception  (b) RuntimeException  (c) Error  (d) Throwable");
        a1='d';
        System.out.print("Enter your choice : ");
        a2=s.next().charAt(0);
        System.out.println("You Entered "+a2);
        c.ans(a1, a2);
        System.out.println();

        System.out.println("7) Java compiler javac translates Java source code into _______");
        System.out.println("(a) Assembler language  (b) Byte code  (c) Bit code  (d) Machine code");
        a1='b';
        System.out.print("Enter your choice : ");
        a2=s.next().charAt(0);
        System.out.println("You Entered "+a2);
        c.ans(a1, a2);
        System.out.println();

        System.out.println("8) What are used to document a program and improve its readability.");
        System.out.println("(a) system cells  (b) keywords  (c) comments  (d) control structures ");
        a1='c';
        System.out.print("Enter your choice : ");
        a2=s.next().charAt(0);
        System.out.println("You Entered "+a2);
        c.ans(a1, a2);
        System.out.println();

        System.out.println("9) In Java, a try block should immediately be followed by one or more blocks.");
        System.out.println("(a) Throw  (b) Run  (c) Exit  (d) Catch ");
        a1='d';
        System.out.print("Enter your choice : ");
        a2=s.next().charAt(0);
        System.out.println("You Entered "+a2);
        c.ans(a1, a2);
        System.out.println();

        System.out.println("10) In object-oriented programming, the process by which one object acquires the properties of another object is called");
        System.out.println("(a) Encapsulation  (b) Polymorphism  (c) Overloading  (d) Inheritance ");
        a1='d';
        System.out.print("Enter your choice : ");
        a2=s.next().charAt(0);
        System.out.println("You Entered "+a2);
        c.ans(a1, a2);
        System.out.println();
        System.out.println();
        System.out.println(name+" your score is "+c.count+" out of 10");
    }
}
