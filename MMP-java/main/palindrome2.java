package main;

import java.util.Scanner;

public class palindrome2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name: ");
        String userinput = scan.nextLine();
        
        StringBuilder bl1 = new StringBuilder(userinput);
        bl1.reverse();
        String x = bl1.toString();
        System.out.println(bl1);
        if (userinput.equals(x)) {
            System.out.println("Palindrome detected! ");
        }else{
            System.out.println("Good name");
        }
    }
}
