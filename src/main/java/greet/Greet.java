package greet;

import java.util.ArrayList;
import java.util.HashMap;

public class Greet {
    String name = "";
    int language = 0;
    HashMap<String, Integer> usersGreeted = new HashMap<>();
    int iCount = 0;


    public String greet(/*String name, int language*/) {
        String msg = "";
        String lowerName = name.toLowerCase();
        if (name.length() > 1) {
            if (!usersGreeted.containsKey(lowerName)) {
                iCount = 1;
                usersGreeted.put(lowerName, iCount);
            } else if (usersGreeted.containsKey(lowerName) && language <= 3 /*&& lowerName != ""*/) {

                for (int i = 0; i < usersGreeted.size(); i++) {

                    iCount++;
                    usersGreeted.put(lowerName, iCount);

                }

            }
            // insert if statement for if the language and username is blank

            switch (language) {

                case 1:
                    msg = "Hello " + name;
                    break;
                case 2:
                    msg = "こんにちは " + name;
                    break;
                case 3:
                    msg = "Привет " + name;
                    break;
                case 4:
                    System.out.println(name + " has been greeted " + greetedUser(name) + " times");
                    break;
                case 5:
                    minusOne(lowerName);
                default:

                    msg = "Hey " + name;
                    break;
            }


        } else if (lowerName.length() == 1) {
            switch (language) {

                case 6:
                    ArrayList <Object >names = new ArrayList<>();
                    for (int i = 0; i < usersGreeted.size(); i++) {

                        names.add(greetedUsers().keySet().toArray()[i]);
                        System.out.println(names.get(i) + " has been greeted " + greetedUsers().get(names.get(i)) + " time(s)");

                    }
                    break;
                case 7:
                    clear();
                    msg = "Successfully cleared";

                    break;
                case 8:
                    msg = "Successfully exited";
                    break;
                default:

                    msg = "Hey " + name;
                    break;
            }
        }
        return msg;

    }

    public void minusOne(String user) {
        String lowCaseUser = user.toLowerCase();
        if (usersGreeted.containsKey(user)) {
            usersGreeted.put(lowCaseUser, iCount - 1);
        }
        if (usersGreeted.get(user) < 1) {
            usersGreeted.remove(user);
        }


    }

    public int greetedUser(String userName) {
        String lowerName = userName.toLowerCase();
        return usersGreeted.get(lowerName);
    }

    public HashMap greetedUsers() {

        return usersGreeted;
    }

    public int counter() {

        return usersGreeted.size();
    }

    public void clear() {
        usersGreeted.clear();
        iCount = 0;
    }

    public void help() {
        System.out.println(" Enter name and select an option below : ");
        System.out.println("1 - Greet in English.");
        System.out.println("2 - Greet in Japanese ");
        System.out.println("3 - Greet in Russian.");
        System.out.println("4 - Check how many times a specific user has been greeted.");
        System.out.println("5 - Check how many times each user has been greeted");
        System.out.println("6 - Clear all usernames.");
        System.out.println("7 - Exit.");
    }

}
