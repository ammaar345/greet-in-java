package greet;

import java.util.Scanner;
//
//import greet.Greet;

public class Main {
    public static void main(String[] args) {
        Greet greet = new Greet();
        greet.help();
        while (true) {
            Scanner myObj = new Scanner(System.in);

            // Enter username and press Enter
            String userInput = myObj.nextLine();
            String[] userNameAndCommand = userInput.split(" ", 2);
            String userName = userNameAndCommand[0];
            int select = Integer.parseInt(userNameAndCommand[1]);
//            System.out.println(Bread[0]);


            if (select == 7) {
                System.out.println("Successfully Exited");
                break;
            }
            System.out.println(greet.greet(userName, select));
        }
    }
}
