import java.util.*;
public class ST2_G_10M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[n-1]);
        System.out.println(arr[0]);
        int sub=arr[0]-arr[1];
        for(int i=2; i<n; i++){
            sub=sub-arr[i];
        }
        if(sub<0){
            System.out.println(sub+" Subtract is less than Zero");
        }
        else{
            System.out.println( sub+"Subtract is greater or equal than Zero");
        }

    }
}
