package DbController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

    private static final String URL = "jdbc:sqlite:ExamensDB.db";

    public static Connection getConnection() {
        try {

            return DriverManager.getConnection(URL);

        }
        catch (SQLException e) {

            e.printStackTrace();
            return null;
        }
    }// Connection End

}
