package at.technikum.conditions;

import java.util.Scanner;

public class Bools {

    public static void main(String[] args) {
        int age = 12;
        boolean isAdult = age >= 18;

        // >, <, >=, <=, ==, !=

        char nationality = 'A';
        boolean isFromAustria = nationality == 'A';

        System.out.println(isAdult);
        System.out.println(isFromAustria);

        boolean allowedToVote = isAdult && isFromAustria;

        System.out.println(allowedToVote);

        boolean drinkBeer = isAdult || isFromAustria;
        System.out.println(drinkBeer);

        boolean isAdmin = true;
        System.out.println(isAdmin);
        isAdmin = !isAdmin;
        System.out.println(isAdmin);

        // &&, ||, !
        // boolean access = (isAdmin || isSuperUser) && accountIsActive;
        // boolean access = isAdmin && isActive && hasSubscription && isAdult;
    }
}
