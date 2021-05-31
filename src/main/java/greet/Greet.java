package greet;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Greet {
    //    ArrayList<String> names = new ArrayList<>();
    HashMap<String, Integer> usersGreeted = new HashMap<>();
    int iCount = 0;

    String name = "";

    public String greet(String name, int language) {
        String msg = "";
        String lowerName = name.toLowerCase();
//        checkIfExists(name);
        //if name is not inside arrayList , greet user and add to arrayList.

        // for (String user : names) {
//        int iCount = 0;

        if (!usersGreeted.containsKey(lowerName)) {
            iCount = 1;
            switch (language) {

                case 1:
                    msg = "Hello " + name;
                    usersGreeted.put(lowerName, iCount);
                    break;
                case 2:
                    msg = "こんにちは " + name;
                    usersGreeted.put(lowerName, iCount);

                    break;
                case 3:
                    msg = "Привет " + name;
                    usersGreeted.put(lowerName, iCount);
                    break;
                case 4:
                    clear();
                    msg = "Successfully cleared";
                    break;
                case 7:
//                    exit();
//                    break;

                    msg = "Successfully exited";
                    break;
                default:

                    msg = "Hey " + name;
                    usersGreeted.put(lowerName, iCount);
                    break;
            }
//            usersGreeted.put(lowerName, iCount);
        } else if (usersGreeted.containsKey(lowerName)) {
//            iCount = 0;

            for (int i = 0; i < usersGreeted.size(); i++) {
                iCount++;
                usersGreeted.put(lowerName, iCount);

            }

        }
        return msg;

    }

    public void minusOne(String user) {
        String lowCaseUser = user.toLowerCase();
        if (usersGreeted.containsKey(user)) {
//            iCount--;
            usersGreeted.put(lowCaseUser, iCount - 1);
        }
//if less than 0 , remove from hashmap and array
        else if (usersGreeted.get(user) < 1) {
            usersGreeted.remove(user);
        }
//            }


    }

    public int greetedUser(String userName) {
        //method to check amount of times the user selected appears throughout the arrayList.
        String lowerName = userName.toLowerCase();
        int userCount = usersGreeted.get(lowerName);
//        if (usersGreeted.containsKey(lowerName)) {
//
//        }
        return userCount;
    }

    public HashMap greetedUsers() {

        return usersGreeted;
    }

    public int counter() {

        return usersGreeted.size();
    }

//    public Boolean exit() {
//        System.exit(0);
//
//        return false;
//    }

    public void clear() {
        usersGreeted.clear();
        iCount = 0;
    }

    public void help() {

        System.out.println("Select 1 to greet in English.");
        System.out.println("Select 2 to greet in Japanese.");
        System.out.println("Select 3 to greet in Russian.");
        System.out.println("Select 4 to check how many times a specific user has been greeted.");
        System.out.println("Select 5 to check how many times all users have been greeted.");
        System.out.println("Select 6 to clear all usernames.");
        System.out.println("Select 7 to exit.");
    }

}
