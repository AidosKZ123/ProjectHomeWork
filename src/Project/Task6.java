package Project;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//Write a java program to check whether a given number is prime or not?
public class Task6 {
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        System.out.println("Please Enter Prime number: ");
        int PrimeNumber = sv.nextInt();


        if (PrimeNumber==500){
            System.out.print("Your given number is PRIME");
        }else{
            System.out.printf("Your given number is NOT PRIME");
        }

    }
}
