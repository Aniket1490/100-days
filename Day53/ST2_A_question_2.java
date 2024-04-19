import java.util.*;
public class ST2_A_question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String st1="";
        String st2="";
        for(int i=0;i<st.length(); i+=2){
            st1=st1+st.charAt(i);
        }
        for(int i=1;i<st.length(); i+=2){
            st2=st2+st.charAt(i);
        }
        System.out.println(st1+st2);
    }
}
//a b c d e f g h
//a c e g b d f h