package Stacks;
import java.util.*;
public class Reverse_Recursivly {
    public static void display_Recursicly(Stack<Integer> st){
        if(st.size()==0)return;
        int top=st.pop();
        System.out.print(top+" ");
        display_Recursicly(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        display_Recursicly(st);

    }
}
