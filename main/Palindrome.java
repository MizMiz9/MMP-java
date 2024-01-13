package main;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name  = scan.nextLine(); 
        int length = name.length();
        String paln = "Palindrome detected! ";
         char charstart = name.charAt(0);
        char charlast = name.charAt(length - 1);
        if (charstart == charlast && charlast == charstart) {
            System.out.println(paln);
        }else{
            System.out.println("Good name");
        }
        scan.close();
       
    }
}
