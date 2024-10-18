import java.util.*;

import javax.xml.crypto.Data;

public class LL{

    Node head;
    private int size;

    LL(){
        size=0;
    }

    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
 
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node curNode =head;
        while (curNode.next!=null) {
            curNode=curNode.next;
        }
        curNode.next=newNode;
    }

    public void print(){
        Node currNode=head;
        int size=0;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
            size++;
        }
        System.out.print("null");
    }

    public void revomeFirst(){
        if (head==null) {
            System.out.println("List is Empty");
        }
        head=head.next;
        size--;
    }
    public void removeLast(){
        if (head==null) {
            System.out.println("List is Empty");
        }
        size--;
        if(head.next == null) {
            head = null;
            return;

        }
        Node currNode=head;
        Node lastNode=head.next;
        while (lastNode.next!=null) {
            lastNode=lastNode.next;
            currNode=currNode.next;
        }
        currNode.next=null;

    }
    public void reverse(){
        if(head == null || head.next == null) {
             return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;

        }
        head.next=null;
        head=prevNode;
    }

    public int middle(){
        Node fast=head;
        Node slow=head;

        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow =slow.next;
        }

        return slow.data;
    }

    public int lastNthNode(int n){
        int lnn=size-n;
        Node curr=head;
        int i=1;
        while (i<=lnn) {
            curr=curr.next;
            i++;
        }
        // curr=curr.next;
        return curr.data;
    }

    public boolean hasCycle(){
        Node fast=head;
        Node slow=head;

        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow =slow.next;


            if(fast==slow){
                return true;
            }
            
        }
        return false;
    }

    public Node getMid(Node head){
        Node fast = head;
        Node slow = head;
        while (fast.next==null||fast.next.next==null) {
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
    
    public Node rev(Node head){
        Node prev =head;
        Node curr=head.next;
        while(curr!=null){
            Node next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public boolean isPalendrome(){
        if(head== null|| head.next==null){//1,2,3  |2,1
            return true;                  //1,2,3 | 1,2
        }
        Node firstHalfEnd = getMid(head);
        Node secondHalfStart=rev(firstHalfEnd.next);
        Node firstHalfStart=head;

        while (secondHalfStart!=null) {
            if (secondHalfStart.data!=firstHalfStart.data) {
                return false;
            }

            firstHalfStart=firstHalfStart.next;
            secondHalfStart=secondHalfStart.next;
        }
        return true;
    }

    public static void intersection(Node head1, Node head2){
        Node first=head1;
        while (first!=null) {
            Node second =head2;
            while (second !=null) {
                if (first.data==second.data) {
                    System.out.print(first.data+" ");
                }
                second=second.next;
            }
            first=first.next;
        }
    }

    public void pairRev(){
        Node temp=head;
        while(temp!=null&&temp.next!=null){

            int k=temp.data;
            temp.data=temp.next.data;
            temp.next.data=k;
            temp=temp.next.next;
        }
    }
    
    public static void main(String args[]){   
    LL list = new LL();
    list.addLast(10);
    list.addLast(20);
    list.addLast(30);
    list.addLast(40);
    list.addLast(50);
    

    LL list1 = new LL();
    list1.addLast(70);
    list1.addLast(20);
    list1.addLast(30);
    list1.addLast(40);
    list1.addLast(50);

    list.print();

    list.pairRev();

    list.print();
    

    intersection(list.head, list1.head);
    // list.removeLast();
    // list.print();
    // System.out.println();
    // System.out.println(list.middle());
    // System.out.println(list.lastNthNode(3));
    // System.out.println(list.hasCycle());
    // System.out.println(list.isPalendrome());
    // list.reverse();
    //list.print();
   // System.out.println(list.size);        
    }
}