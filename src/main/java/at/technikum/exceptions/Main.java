package at.technikum.exceptions;

import at.technikum.recap.Parent;

public class Main {

    public static void main(String[] args) {
        Database db = new Database();

        try {
            db.execute(
                    "INSERT INTO news (headline, text) VALUES ('Hello World', 'Lorem ipsum...')"
            );
        } catch (DatabaseConnectionLostException e) {
            System.out.println("There was an error");
        } catch (Exception e) {

        }

        System.out.println("End of program");
    }
}
