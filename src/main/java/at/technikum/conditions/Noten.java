package at.technikum.conditions;

import java.util.Scanner;

public class Noten {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Noten: ");
        int grades = input.nextInt();
        input.close();

        // Nicht genau drei Noten eingegeben
        if (grades < 100 || grades > 999) {
            System.out.println("Erwarte genau 3 Noten!");
            return;
        }

        int firstGrade = grades / 100;
        int secondGrade = grades / 10 % 10;
        int thirdGrade =  grades % 10;

        // Erste Note nicht zwischen 1 und 5
        if (firstGrade < 1 || firstGrade > 5) {
            System.out.println("Erste Note muss zwischen 1 und 5 liegen!");
            return;
        }

        // Zweite Note nicht zwischen 1 und 5
        if (secondGrade < 1 || secondGrade > 5) {
            System.out.println("Zweite Note muss zwischen 1 und 5 liegen!");
            return;
        }

        // Dritte Note nicht zwischen 1 und 5
        if (thirdGrade < 1 || thirdGrade > 5) {
            System.out.println("Dritte Note muss zwischen 1 und 5 liegen!");
            return;
        }

        // Bei zumindest einem Fünfer: “Nicht bestanden!”
        if (firstGrade == 5 || secondGrade == 5 || thirdGrade == 5) {
            System.out.println("Nicht bestanden!");
            return;
        }

        // Sind alle drei Noten “1”, lautet die Bewertung: “Ausgezeichneter Erfolg!”
        if (firstGrade == 1 && secondGrade == 1 && thirdGrade == 1) {
            System.out.println("Ausgezeichneter Erfolg!");
            return;
        }

        // Bei 2 Einsern und einem Zweier lautet sie: “Guter Erfolg!”
        if (
            (firstGrade == 1 && secondGrade == 1 && thirdGrade == 2)
            || (firstGrade == 1 && secondGrade == 2 && thirdGrade == 1)
            || (firstGrade == 2 && secondGrade == 1 && thirdGrade == 1)
        ) {
            System.out.println("Guter Erfolg!");
            return;
        }
        /*
        if ((firstGrade + secondGrade + thirdGrade) == 4) {
            System.out.println("Guter Erfolg!");
            return;
        }
        */

        // ansonsten “Bestanden.”
        System.out.println("Bestanden");
    }
}
