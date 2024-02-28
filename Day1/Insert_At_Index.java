package Stacks;
import java.sql.SQLOutput;
import java.util.*;
public class Insert_at_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter the numnber of elements : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println("st is : "+st);
        Stack<Integer> temp = new Stack<>();
        System.out.print("Enter te index where u want to insert at : ");
        int index = sc.nextInt();
        System.out.print("Element u want to insert : ");
        int element=sc.nextInt();
        while(st.size()>index){
            temp.push(st.pop());
        }
        st.push(element);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println("st after insertion : "+ st);
    }
}
