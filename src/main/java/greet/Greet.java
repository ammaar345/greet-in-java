package greet;

import java.util.HashMap;

public class Greet {
    String name = "";
    String language = "";
    HashMap<String, Integer> usersGreeted = new HashMap<>();
    int iCount = 0;


    public  void greet(String name) {

        String lowerName = name.toLowerCase();

        if (!usersGreeted.containsKey(lowerName)) {
            iCount = 1;
            usersGreeted.put(lowerName, iCount);
        } else if (usersGreeted.containsKey(lowerName)) {

            for (int i = 0; i < usersGreeted.size(); i++) {

                iCount++;
                usersGreeted.put(lowerName, iCount);

            }

        }
        // insert if statement for if the language and username is blank




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
