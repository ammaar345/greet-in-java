package greet;

import java.util.Scanner;

import greet.Greet;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Greet greet = new Greet();
        String userName;
        Integer select;
        // Enter username and press Enter
        System.out.println("Enter your name :");
        userName = myObj.nextLine();
        System.out.println("Select an option :");
        System.out.println("Select 0 for help menu.");
        select = myObj.nextInt();

        System.out.println(greet.greet(userName, select));
    }
}
