
package controller;

        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;

public class connectionDB {

    public Connection getConnection() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");

        Connection con = (Connection) DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/safari", "root", "root");
        System.out.println("done");
        return con;
    }

}