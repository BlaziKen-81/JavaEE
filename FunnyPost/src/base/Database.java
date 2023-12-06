package base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Database {
    public Connection getConnection() throws Exception {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://127.0.0.1:3306/FunnyPost";
            String username = "root";
            String password = "";

            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connecté");
            return connection;
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public void insertPost(int id, String title, String body) {
        try {
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO post (id, title, body) VALUES (?, ?, ?)");
            statement.setInt(1, id);
            statement.setString(2, title);
            statement.setString(3, body);
            statement.executeUpdate();
            System.out.println("Post inséré dans la base de données !");
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    

}