package ET;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans ="";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch>='a' && ch<='z'){
                ans+=(char)(ch-32);
            }
            else if(ch>='A' && ch<='Z'){
                ans+=(char)(ch+32);
            }
        }
        System.out.println(ans);
    }
}
