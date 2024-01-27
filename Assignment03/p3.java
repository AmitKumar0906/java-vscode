package Assignment03;
import java.util.*;
public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the three integer");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a<b && b<c){
            System.out.println(" increasing");
        }
        else if(a>b && b>c){
            System.out.println(" decreasing");
        }
        else{
            System.out.println(" neither increase nor decrease");
        }

    }
}
