package at.technikum.functions;

import java.util.Scanner;

public class MilchFun {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fat: ");
        double fat = scanner.nextDouble();
        System.out.print("Lasting: ");
        int lasting = scanner.nextInt();

        int k = type(fat, lasting);
        print(k);

        // print(type(fat, lasting));
    }

    private static int type(double fat, int lasting) {
        if (fat < 3. && 0 == lasting) {
            return 3;
        }
        if (fat < 3. && 1 == lasting) {
            return 4;
        }
        if (fat > 7. && 0 == lasting) {
            return 1;
        }
        if (fat > 7. && 1 == lasting) {
            return 1;
        }
        if (0 == lasting) {
            return 5;
        }
        if (1 == lasting) {
            return 6;
        }

        return -1;
    }

    private static void print(int type) {
        if (1 == type) {
            System.out.println("Extravollmilch (frisch)");
            return;
        }
        if (2 == type) {
            System.out.println("Extravollmilch (haltbar)");
            return;
        }
        if (3 == type) {
            System.out.println("Leichtmilch (frisch)");
            return;
        }
        if (4 == type) {
            System.out.println("Leichtmilch (haltbar)");
            return;
        }
        if (5 == type) {
            System.out.println("Normalmilch (frisch)");
            return;
        }
        if (6 == type) {
            System.out.println("Normalmilch (haltbar)");
            return;
        }
        if (-1 == type) {
            System.out.println("Ungueltige Klassifizierung!");
            return;
        }
        System.out.println("Ungueltiges Argument!");

        /*
        switch (type) {
            case 1:
                System.out.println("Extravollmilch (frisch)");
                break;
            case 2:
                System.out.println("Extravollmilch (haltbar)");
                break;
            case 3:
                System.out.println("Leichtmilch (frisch)");
                break;
            case 4:
                System.out.println("Leichtmilch (haltbar)");
                break;
            case 5:
                System.out.println("Normalmilch (frisch)");
                break;
            case 6:
                System.out.println("Normalmilch (haltbar)");
                break;
            case -1:
                System.out.println("Ungueltige Klassifizierung!");
                break;
            default:
                System.out.println("Ungueltiges Argument!");
        }
        */
    }
}
