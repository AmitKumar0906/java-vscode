package Assignment04;
import java.util.*;
public class ha05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter the number of row");
        int N = sc.nextInt();
        String s = " ";
        for( int i=1;i<=N;i++){
            s+= i+s;
            System.out.println(s);
        }
    }
}
