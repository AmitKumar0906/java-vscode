package Assignment03;
import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" enter the water in ml");
        int x = sc.nextInt();
        if(x>=5000){
            System.out.println(" yes, Alice is following doctor advice");

        }
        else{
            System.out.println(" no, Alice is not following doctor advice ");
        }
    }
}
