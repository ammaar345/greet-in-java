package greet;

import java.util.ArrayList;
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
            greet.name = userName;
            greet.language = select;


            if (userInput.length() > 1) {

            } else if (userInput.length() == 1) {
                greet.name = "";

                switch (greet.language) {
                    case 4:
                        System.out.println(greet.name + " has been greeted " + greet.greetedUser(greet.name) + " times");
                        break;
                    case 5:
                        ArrayList bread = new ArrayList();
                        for (int i = 0; i < greet.usersGreeted.size(); i++) {

                            bread.add(greet.greetedUsers().keySet().toArray()[i]);
                            System.out.println(bread.get(i) + " has been greeted " + greet.greetedUsers().get(bread.get(i)) + " time(s)");

                        }
                        break;
                    case 6:
                        greet.clear();
                        System.out.println("Successfully cleared");

                        break;
//                    case 7:
//                        System.out.println("Successfully exited");
//                        break;

                }
            }
            if (greet.language == 7) {
                System.out.println("Successfully Exited");
                break;
            }
        }
//            System.out.println(Bread[0]);


        System.out.println(greet.greet());
    }
}

