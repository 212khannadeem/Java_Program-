import java.io.*;
import java.util.*;

public class Solution {

    Node head;
    public class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public void add(int data){
        Node newNode=new Node(a);
        if(head==null){
            head=newNode;
            return;
        }

            Node cur=head;
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=newNode;
        }
    }
    
    public void print(){
        Node cur=head;
        while(cur!=null){
            System.out.println(cur.data);
            cur=cur.next;
        }
    }
    
    public static void main(String[] args) {
        Solution list=new Solution();
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        for (int i = 0; i < a; i++) {
            int a1=s.nextInt();
            list.add(a1);
        }
        list.print();
        
    }
}
