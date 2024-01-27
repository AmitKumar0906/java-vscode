package Arrayjava;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        // int marks [] = new int[50];

        //int number [] = {1,2,3};

        //int morenumber [] = {4,5,6};

        //String fruits[] = {"mango", " banana"};
        int marks [] = new int[100];
        Scanner sc = new Scanner (System.in);
        //int phy;
        //phy = sc.nextInt();

        marks[0] = sc.nextInt();  //phy
        marks[1] = sc.nextInt();  //chem
        marks[2] = sc.nextInt();   //math

        System.out.println("phy:"+marks[0]);
        System.out.println("chem:"+marks[1]);
        System.out.println("math :"+marks[2]);

       // marks[2] = marks[2]+1;    //adding marks
        //System.out.println("math:"+marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2]) / 3;
        System.out.println("percentage= " +percentage+ "%");


        //to find the length
       // System.out.println("length of array="+marks.length);

    }
}
