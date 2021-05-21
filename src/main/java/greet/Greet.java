package greet;

import java.util.ArrayList;
import java.util.HashMap;

public class Greet {
    ArrayList<String> names = new ArrayList<>();
    HashMap<String, Integer> usersGreeted = new HashMap<String, Integer>();
    int iCount = 0;
    int counter;

//    public Boolean checkIfExists(String name) {
//        if (!names.contains(name)) {
//            return true;
//        }
//        return false;
//    }


    public String greet(String name, int language) {
        String msg = "";
        String lowerName = name.toLowerCase();
//        checkIfExists(name);
        //if name is not inside arrayList , greet user and add to arrayList.

        // for (String user : names) {
        int iCount = 0;

        if (!names.contains(lowerName)) {
            iCount = 1;
            usersGreeted.put(lowerName, iCount);


            switch (language) {

                case 1:
                    msg = "Hello " + lowerName;
                    names.add(lowerName);
//                usersGreeted.put(name, 1);
                    break;
                case 2:
                    msg = "こんにちは " + lowerName;
                    names.add(lowerName);
//                    usersGreeted.put(name, iCount);
                    break;
                case 3:
                    msg = "Привет " + lowerName;
                    names.add(lowerName);
//                    usersGreeted.put(name, iCount);
                    break;
//            case 4:greetedUser();
//            case 5:greetedUsers();
                case 6:
                    clear();
                case 7:
                    exit();
                default:

                    msg = "Hey " + lowerName;
                    names.add(lowerName);
                    help();
//            }
            }
        }
        //}
//        else {

        for (String userName : names) {
//            iCount = 0;
//            iCount=0;
            if (userName.equals(lowerName)) {
//                    int value = usersGreeted.get(name);
                iCount++;
                usersGreeted.put(lowerName, iCount);

            }

        }
//        }
        return msg;

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
//        HashMap<String, Integer> usersGreeted = new HashMap<String, Integer>();
//        String currentName;
//        int iCount = 0;
//        for (String name : names) {
//            if (name.equals(name)) {
//                iCount++;
//            }
//
//            currentName = name;
//
//        }
        return usersGreeted;
//        System.out.println(usersGreeted);

    }

    public void exit() {
        System.exit(0);
    }

    public void clear() {
        names.clear();
        counter = 0;
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
