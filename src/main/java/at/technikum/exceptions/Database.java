package at.technikum.exceptions;

import java.util.Random;

public class Database {

    private final Random random;

    public Database() {
        this.random = new Random();
    }

    public boolean execute(String sql) throws DatabaseConnectionLostException {
        int n = random.nextInt(3);

        if (n == 2) {
            // Database Connection lost
            throw new DatabaseConnectionLostException("Database Error 110255");
        }

        return true;
    }
}
