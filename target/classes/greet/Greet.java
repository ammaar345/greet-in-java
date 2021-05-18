package greet;

import java.util.ArrayList;

public class Greet {
    ArrayList<String> names = new ArrayList<>();
    int counter = 0;

    public String greet(String name, int language) {
        String msg = "";
        name = name.toLowerCase();
//        help();
//        if (!names.contains(name)) {
        //if name is not inside arrayList , greet user and add to arrayList.
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
//            case 4:greetedUser();
//
//            case 5:greetedUsers();
            case 6:
                clear();
            case 7:
                exit();
            default:

                msg = "Hey " + name;
                names.add(name);
                help();
//            }
        }
        return msg;

    }

    public int greetedUser(String userName) {
        //method to check amount of times the user selected appears throughout the arrayList.
        ArrayList<String> currentName = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            if (names.contains(userName)) {//check if correct
                currentName.add(userName);
            }
        }

        return currentName.size();
    }

    public Object greetedUsers() {
//return the count and name of all the users in the array
        return 0;
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

//        System.out.println("bread");
//        System.out.println("bread");


    }

//    public int uniqueCounter() {
//
//        return 0;
//
//        //check how many times unique users have been greeted.
//    }
}
