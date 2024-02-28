//package Stacks;
//import java.util.*;
//
//public class Balanced_Brackets {
//    public static boolean isBalanced(String str){
//            Stack<Character> st = new Stack<>();
//            int n = str.length();
//            for(int i=0; i<n; i++){
//                char ch =str.charAt(i);
//                if(ch=='(' || ch=='[' || ch=='{' ){
//                    st.push(ch);
//                }
//                else{
//                    if(st.size()==0 || st.peek() != '(' || st.peek() != '[' || st.peek() != '{')return false;
//                    else{
//                        st.pop();
//                    }
//                }
//            }
//            if(st.size()>0){
//                return false;
//            }
//            else return true;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        System.out.println(isBalanced(str));
//    }
//}


package Stacks;
import java.util.*;

public class Balanced_Brackets {
    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();

        for(int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if(st.isEmpty()) {
                    return false;
                }

                char top = st.pop();
                if((ch == ')' && top != '(') ||
                        (ch == ']' && top != '[') ||
                        (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }
}

