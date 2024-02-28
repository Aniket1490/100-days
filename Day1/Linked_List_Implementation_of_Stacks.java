package Stacks;
import java.util.*;

public class LL_Implementation {
    public static class Node {
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class LLStack{
        private Node head = null;
        private int size=0;
        void push(int x){
            Node temp = new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        int pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }
        void displayReverse(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void displayrec(Node h){
            if(h==null)return ;
            displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayrec(head);
            System.out.println();
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            if(size==0)return true;
            else return false;
        }
    }
    public static void main(String[] args){
    LLStack st = new LLStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.push(5);
        st.push(6);
        st.push(6);
        st.display();
        System.out.println(st.isEmpty());
//        System.out.println(st.isFull());
    }
}
