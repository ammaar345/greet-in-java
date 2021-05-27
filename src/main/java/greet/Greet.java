package greet;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Greet {
    ArrayList<String> names = new ArrayList<>();
    HashMap<String, Integer> usersGreeted = new HashMap<>();
    static int iCount = 0;
    int selected = 0;

    String name = "";
//
//    Greet(String name, int selected) {
//        this.name = name;
//        this.selected = selected;
//
//    }

    public String greet(String name, int language) {
        String msg = "";
        String lowerName = name.toLowerCase();
//        checkIfExists(name);
        //if name is not inside arrayList , greet user and add to arrayList.

        // for (String user : names) {
//        int iCount = 0;

        if (!names.contains(lowerName)) {
            iCount = 1;
            switch (language) {

                case 1:
                    msg = "Hello " + name;
                    names.add(name);
                    break;
                case 2:
                    msg = "こんにちは " + name;
                    names.add(name);

                    break;
                case 3:
                    msg = "Привет " + name;
                    names.add(name);
                    break;
                case 4:
                    clear();
                    msg = "Successfully cleared";
                    break;
                case 7:
                    exit();
                    break;
                default:

                    msg = "Hey " + name;
                    break;
            }
            usersGreeted.put(lowerName, iCount);
        } else if (names.contains(lowerName)) {
            iCount = 0;
            names.add(name);

            for (String userName : names) {
                iCount++;


            }
            usersGreeted.put(name, iCount);
        }
        return msg;

    }

    public void minusOne(String user) {
        if (names.contains(user)) {
//            iCount--;
            usersGreeted.put(user, iCount - 1);
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

        ArrayList<String> currentName = new ArrayList<>();

        for (String name : names) {
            if (name.equals(lowerName)) {
                currentName.add(lowerName);
            }
        }
        return currentName.size();
    }

    public HashMap greetedUsers() {

        return usersGreeted;
    }

    public int counter() {

        return usersGreeted.size();
    }

    public void exit() {
        System.exit(0);
    }

    public void clear() {
        names.clear();
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
