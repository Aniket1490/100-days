
import java.util.*;
public class ST2_G_Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine();
        String st2 = sc.nextLine();

        if(st1.equals(st2)){
            System.out.println(1+":"+st1+" and "+st2+" are  permutable");
        }
        else{
            System.out.println(0+":"+st1+" and "+st2+" are not permutable");
        }

    }
}
