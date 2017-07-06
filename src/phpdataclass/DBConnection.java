package phpdataclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {

    private Connection con;
    private String databaseName;
    private String port;
    private String username;
    private String password;

    public DBConnection(String databaseName, String port, String username, String password) {
        this.databaseName = databaseName;
        this.port = port;
        this.username = username;
        this.password = password;
    }

    public boolean createConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:" + port, username, password);
            return false;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
            return true;
        }
    }

    public Connection getConnection() {
        return this.con;
    }

    public ResultSet getData(String sql) throws Exception {
        return getConnection().createStatement().executeQuery(sql);
    }

    public void updateData(String sql) throws Exception {
        getConnection().createStatement().executeUpdate(sql);
    }

    public String getDatabaseName() {

        return databaseName;
    }

    public boolean setDatabaseName(String databaseName) {
        try {
            this.databaseName = databaseName;
            con = DriverManager.getConnection("jdbc:mysql://localhost:" + port + "/" + this.databaseName, username, password);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
