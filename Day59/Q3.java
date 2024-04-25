package ET;
import java .util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int tic = sc.nextInt();
        int jhon = sc.nextInt();
        int mike = sc.nextInt();

        if(jhon+mike<=tic){
            System.out.println("Jhon: tickets booked: "+jhon);
            System.out.println("Mike: tickets booked: "+mike);
        }
        else if(jhon>tic && mike >tic){
            System.out.println("Jhon: not booked");
            System.out.println("Mike: not booked");
        }
        else{
            if(jhon<tic && jhon<=mike || jhon>=mike){
                System.out.println("Jhon: tickets booked: "+jhon);
                System.out.println("Mike: not booked");
            }
            else{
                System.out.println("Jhon: not booked");
                System.out.println("Mike: tickets booked:"+mike);
            }
        }



    }
}



