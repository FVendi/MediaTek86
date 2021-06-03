package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
	private static DatabaseConnection instance;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/mediatek86?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
    private String username = "Jean-Bernard-Minet";
    private String password = "ViveLaSIO";

    private DatabaseConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }
    
    public Connection getConnection() {
        return this.connection;
    }

    public static DatabaseConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new DatabaseConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public ResultSet query(String query) throws SQLException{
    	Statement statement = this.connection.createStatement();
        ResultSet res = statement.executeQuery(query);
        return res;
    }

    public int insert(String insertQuery) throws SQLException {
    	Statement statement = this.connection.createStatement();
        int result = statement.executeUpdate(insertQuery);
        return result;
    }

    public int update(String updatetQuery) throws SQLException {
    	Statement statement = this.connection.createStatement();
        int result = statement.executeUpdate(updatetQuery);
        return result;
    }

    public int delete(String deleteQuery) throws SQLException {
    	Statement statement = this.connection.createStatement();
        int result = statement.executeUpdate(deleteQuery);
        return result;
    }
}