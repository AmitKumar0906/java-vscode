package Assignment02;
import java.util.*;
public class ans1 {
    public static void main(String[] args) {
        double f,c;
		Scanner sc =new Scanner(System.in);
		System.out.print("enter temperature in farenheit");
		f=sc.nextDouble();
		c = (f-32)*5/9;
		System.out.print("temperature in celcius is: "+c);
    }
}
