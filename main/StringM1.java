package main;

import java.util.Scanner;

public class StringM1{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // String name = "";
        System.out.println("Enter name: ");
        String user = scan.nextLine();
        int length = user.length();
        
        int userinput = user.length();
        System.out.println(userinput);

        String toupper = user.toUpperCase();
        System.out.println(toupper);

        String toLower = user.toLowerCase();
        System.out.println(toLower);

        char firstchar = user.charAt(0);
        System.out.println(firstchar);

        char lastchar = user.charAt(length -1);
        System.out.println(lastchar);

        System.out.println(user.substring(1,5));

         
    }
}