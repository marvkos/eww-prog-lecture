package at.technikum.conditions;

import java.util.Scanner;

public class Artikelnummern {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print(": ");
            int articleGroupNr = scanner.nextInt();
            if (articleGroupNr >= 1 && articleGroupNr <= 3) {
                System.out.print(": ");
                int subGroupNr = scanner.nextInt();
                if (articleGroupNr == 1 && subGroupNr >= 1 && subGroupNr <= 3) {
                    System.out.print(": ");
                    int articleNr = scanner.nextInt();
                    if (subGroupNr == 1 && articleNr >= 1 && articleNr <= 4) {
                        if (articleNr == 1) System.out.println("Bier (hell, 0,5)");
                        if (articleNr == 2) System.out.println("Bier (hell, 0,33)");
                        if (articleNr == 3) System.out.println("Zwickel (0,5)");
                        if (articleNr == 4) System.out.println("Zwickel (0,33)");
                    } else if (subGroupNr == 2 && articleNr == 1
                            || subGroupNr == 2 && articleNr == 2) {
                        if (articleNr == 1) System.out.println("Cola");
                        if (articleNr == 2) System.out.println("Fanta");
                    } else if (subGroupNr == 3 && articleNr == 1
                            || subGroupNr == 3 && articleNr == 2) {
                        if (articleNr == 1) System.out.println("Rotwein");
                        if (articleNr == 2) System.out.println("Weißer Spritzer");
                    } else
                        System.out.printf("Falsche Eingabe bei ArtikelNummer:%d in der Untergruppe:%d\n", articleNr, subGroupNr);

                } else if (articleGroupNr == 2 && subGroupNr == 1
                        || articleGroupNr == 2 && subGroupNr == 2
                        || articleGroupNr == 2 && subGroupNr == 9) {
                    System.out.print(": ");
                    int articleNr = scanner.nextInt();
                    if (subGroupNr == 1 && articleNr == 1) System.out.println("Schnitzel");
                    else if (subGroupNr == 1 && articleNr == 2) System.out.println("Schweinsbraten");
                    else if (subGroupNr == 2 && articleNr == 1) System.out.println("Frankfurter");
                    else if (subGroupNr == 9 && articleNr == 1) System.out.println("Ketchup");
                    else
                        System.out.printf("Falsche Eingabe bei ArtikelNummer:%d in der Untergruppe:%d\n", articleNr, subGroupNr);

                } else if (articleGroupNr == 3 && subGroupNr == 1) {
                    System.out.print(": ");
                    int articleNr = scanner.nextInt();
                    if (articleNr == 1) System.out.println("Zigaretten");
                    else
                        System.out.printf("Falsche Eingabe bei ArtikelNummer:%d in der Untergruppe:%d\n", articleNr, subGroupNr);
                }
                else
                    System.out.printf("Falsche Eingabe bei Untergruppe:%d in der Artikelgruppe:%d\n", subGroupNr, articleGroupNr);
            } else
                System.out.printf("Falsche Eingabe bei Artikelgruppe:%d\n", articleGroupNr);
        } catch (Throwable e) {
            System.out.println("Invalid Input: "+ e);
        }
    }
}