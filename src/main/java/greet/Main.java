package greet;

import java.util.Scanner;

import greet.Greet;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i < 1000000000) {
            Scanner myObj = new Scanner(System.in);
            String userName;
            Integer select;
            // Enter username and press Enter
            userName = myObj.nextLine();
            select = myObj.nextInt();

            Greet greet = new Greet(userName, select);


            System.out.println(greet.greet(userName, select));
        }
    }
}
