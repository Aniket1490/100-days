import java.util.*;
public class ST2_H_10M {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int w = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int r_area=w*l;
        double c_area=3.14*r*r;
        if(r_area<c_area) System.out.println("true");
        else{
            System.out.println("False");
        }
    }
}
