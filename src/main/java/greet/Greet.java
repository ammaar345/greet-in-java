package greet;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Greet {

    //    ArrayList<String> names = new ArrayList<>();
    HashMap<String, Integer> usersGreeted = new HashMap<>();
    int iCount = 0;

    public String greet(String name, int language) {

        String lowerName = name.toLowerCase();
        if (!usersGreeted.containsKey(lowerName)) {
            iCount = 1;
            usersGreeted.put(lowerName, iCount);
        } else if (usersGreeted.containsKey(lowerName) && language <= 3) {

            for (int i = 0; i < usersGreeted.size(); i++) {

                iCount++;
                usersGreeted.put(lowerName, iCount);

            }

        }
        String msg = "";
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
            default:

                msg = "Hey " + name;
                break;
            case 4:
                System.out.println(name + " has been greeted " + greetedUser(name) + " times");
                break;
            case 5:
                ArrayList bread = new ArrayList();
                for (int i = 0; i < usersGreeted.size(); i++) {

                    bread.add(greetedUsers().keySet().toArray()[i]);
                    System.out.println(bread.get(i) + " has been greeted " + greetedUsers().get(bread.get(i)) + " time(s)");

                }
                break;
            case 6:
                clear();
                msg = "Successfully cleared";

                break;
            case 7:
                msg = "Successfully exited";
                break;

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
