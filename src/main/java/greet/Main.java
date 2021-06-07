package greet;

import java.util.ArrayList;
import java.util.Scanner;
//
//import greet.Greet;

public class Main {
    public static void main(String[] args) {

        Greet greet = new Greet();
        String msg;
//        String language = "";
        greet.help();

        while (true) {
            Scanner myObj = new Scanner(System.in);
            String userInput = myObj.nextLine();
            // Enter username and press Enter

            String[] userNameAndCommand = userInput.split(" ");

            String command = (userNameAndCommand[0]);
            String userName = userNameAndCommand[1].toLowerCase();
            String language = userNameAndCommand[2].toLowerCase();
            if (command.equals("greet") && language.equalsIgnoreCase("english")) {
                greet.greet(userName);
                msg = "Hello " + userName;
                System.out.println(msg);

            }
            if (command.equals("greet") && language.equalsIgnoreCase("japanese")) {
                greet.greet(userName);
                msg = "こんにちは " + userName;
                System.out.println(msg);

            }
            if (command.equals("greet") && language.equalsIgnoreCase("russian")) {
                greet.greet(userName);
                msg = "Привет " + userName;
                System.out.println(msg);

            }
            if (userInput.equals("greeted")) {
                System.out.println(userName + " has been greeted " + greet.greetedUser(userName) + " times");
            }
            if (userInput.equals("remove"+)) {
                greet.minusOne(userName.toLowerCase());
                System.out.println("Removed one count from selected user");
            }

//                System.out.println("Hey" + userName);
//            }
            switch (userInput) {

                case "greeted":
                    ArrayList<Object> names = new ArrayList<>();
                    for (int i = 0; i < greet.usersGreeted.size(); i++) {

                        names.add(greet.greetedUsers().keySet().toArray()[i]);
                        System.out.println(names.get(i) + " has been greeted " + greet.greetedUsers().get(names.get(i)) + " time(s)");

                    }
                    break;
                case "clear":
                    greet.clear();
                    msg = "Successfully cleared";
                    System.out.println(msg);
                    break;
                case "exit":
                    msg = "Successfully exited";
                    System.out.println(msg);
                    break;
//                default:
//
//                    msg = "Hey " + userName;
//                    System.out.println(msg);
//                    break;

            }

//            if (command.equals("exit")) {
//                System.out.println("Successfully Exited");
//                break;
//            }
//            System.out.println();
        }
//            System.out.println(Bread[0]);


    }
}

