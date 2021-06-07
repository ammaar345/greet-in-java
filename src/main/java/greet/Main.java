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


            if (command.equals("greet")) {
                String userName = userNameAndCommand[1].toLowerCase();
                String language = userNameAndCommand[2].toLowerCase();
                if (language.equalsIgnoreCase("english")) {
                    greet.greet(userName);
                    msg = "Hello " + userName;
                    System.out.println(msg);
                }

            }
            if (command.equals("greet")) {
                String userName = userNameAndCommand[1].toLowerCase();
                String language = userNameAndCommand[2].toLowerCase();
                if (language.equalsIgnoreCase("japanese")) {
                    greet.greet(userName);
                    msg = "こんにちは " + userName;
                    System.out.println(msg);
                }
            }
            if (command.equals("greet")) {
                String userName = userNameAndCommand[1].toLowerCase();
                String language = userNameAndCommand[2].toLowerCase();

                if (language.equalsIgnoreCase("russian")) {
                    greet.greet(userName);
                    msg = "Привет " + userName;
                    System.out.println(msg);
                }
            }
//            if (command.equals("greeted")) {
//                System.out.println(userName + " has been greeted " + greet.greetedUser(userName) + " times");
//            }
            if (command.equals("remove")) {

                String userName = userNameAndCommand[1].toLowerCase();
                greet.minusOne(userName.toLowerCase());
                System.out.println("Removed one count from selected user");
            }
            if (command.equals("greeteduser")) {
                String userName = userNameAndCommand[1].toLowerCase();
                System.out.println(userName + " has been greeted " + greet.greetedUser(userName) + " times");
            }
//            else {
//                String userName = userNameAndCommand[1].toLowerCase();
//                System.out.println("Hey" + userName);
//            }
            switch (command) {

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
            }

            if (command.equals("exit")) {
                System.out.println("Successfully Exited");
                break;
            }

        }

    }
}

