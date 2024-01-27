package Assignment02;
import java.util.*;
public class ans4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.println(" enter the number between 0 to 1000 ");
       int x= sc.nextInt();
       int sum =0;
       sum= sum + x%10;
       x= x/10;
       sum= sum + x%10;
       x= x/10;
       sum= sum + x%10;
       x= x/10;
       System.out.println(sum);
       


    }
}
