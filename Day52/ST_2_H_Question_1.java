import java .util.*;
public class ST_2_H_Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char [] arr = st.toCharArray();
        Arrays.sort(arr);
        int cnt = 1;

        for(int i=0; i<st.length()-1; i++){
            if(arr[i]==arr[i+1]){
                continue;
            }
            else{
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
