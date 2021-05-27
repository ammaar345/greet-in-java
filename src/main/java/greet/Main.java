package greet;

import java.util.Scanner;

import greet.Greet;

public class Main {
    public static void main(String[] args) {
        Greet greet = new Greet();

        while (true) {
            Scanner myObj = new Scanner(System.in);
            String userName;
            Integer select;
            // Enter username and press Enter
            userName = myObj.nextLine();
            select = myObj.nextInt();
            System.out.println(greet.greet(userName, select));
            if (select == 7) {
                break;
            }
        }
    }
}
