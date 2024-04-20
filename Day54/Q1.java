package ET;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = ""+str.charAt(0);
        int cnt = 1;
        for(int i=1; i<str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr==prev) cnt++;
            else {
                ans += cnt;
                cnt = 1;
                ans += curr;
            }
        }
        ans+=cnt; // for last character
        System.out.println(ans);
    }
}
