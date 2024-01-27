package Assignment02;
import java.util.*;
public class ans3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the sallery");
		double salery = sc.nextDouble();
		double Salary = 15600 ;
		double da = 0.4 * Salary;
        double hra = 0.2 *Salary;
        double grossSalary = Salary + da + hra;

        System.out.println("Dearness Allowance (DA): " + da);
        System.out.println("House Rent Allowance (HRA): " + hra);
        System.out.println("Gross Salary: " + grossSalary);

    }
}
