package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Driver {
    private static final String url = "jdbc:mysql://localhost:3306/management";
    private static final String user = "root";
    private static final String password = "";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public Driver(){

    }

    public int makeQuery(String q) throws SQLException{
        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            rs = stmt.executeQuery(q);

            while (rs.next()) {
                int count = rs.getInt(1);
                return count;
            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try {
                con.close();
            } catch (SQLException se) { throw new SQLException(se); }
            try {
                stmt.close();
            } catch (SQLException se) { throw new SQLException(se); }
            try {
                rs.close();
            } catch (SQLException se) { throw new SQLException(se); }
        }

        return -1;
    }
}
